package com.lightingshop.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.lightingshop.dto.Msg;
import com.lightingshop.entity.Light;
import com.lightingshop.entity.LightImage;
import com.lightingshop.service.ILightManageService;
import com.lightingshop.util.IMGUtil;



@Controller
public class InsertLightController {
	

	
	@Autowired
	LightImage lightImage;
	
	@Autowired
	ILightManageService lightManageService;
	
	
	/**
	 * 添加灯饰+上传图片
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/LightInsert", method=RequestMethod.POST)
	@ResponseBody
	private Msg InsertLight(HttpServletRequest request) {
		MultipartHttpServletRequest mult = (MultipartHttpServletRequest) request;
		
		//裁剪imgPath
		String imgPath = mult.getParameter("images");
		imgPath = this.SUBPath(imgPath);
		Light light = new Light(); 
		//将灯饰信息封装
		light.setLightName(mult.getParameter("lightName"));
		light.setCategoryID(Integer.valueOf(mult.getParameter("categoryID")));
		light.setBrandID(Integer.valueOf(mult.getParameter("brandID")));
		light.setStyleID(Integer.valueOf(mult.getParameter("styleID")));
		light.setColor(mult.getParameter("color"));
		light.setLocate(mult.getParameter("locate"));
		light.setStuff(mult.getParameter("stuff"));
		light.setPrice(new BigDecimal(mult.getParameter("price")));
		light.setQuantity(Integer.valueOf(mult.getParameter("quantity")));
		light.setImages("img/singlepro/"+imgPath);
		light.setDescription(mult.getParameter("description"));
		
		//insert，获得插入后返回的主键ID
		light.setLightID(lightManageService.insertLight(light));//在数据库存储路径

		//开始上传封面图片
		String path = mult.getSession().getServletContext().getRealPath("")+"img\\singlepro\\";
		MultipartFile img0 = mult.getFile("image0");//主图片
		if(!this.SaveImg(path, imgPath, img0,1))
			return Msg.Fail();
		else
			System.out.println("路径：/n"+path+imgPath+"成功上传!");
		
		
		//轮播图路劲存储+上传
		for(int k=0 ; k<=Integer.valueOf(mult.getParameter("imgNum")) ; k++ ) {
			MultipartFile img = mult.getFile("image"+k);
			if(img==null)
				continue;
			String PATH = img.getOriginalFilename();
			PATH = this.SUBPath(PATH);
			lightImage.setLightID(light.getLightID());
			lightImage.setImages("img/photos/"+PATH);
			//存储路径
			lightManageService.lightImage(lightImage); //在数据库存储路径
			
			//开始上传图片
			String path2 = mult.getSession().getServletContext().getRealPath("")+"img\\photos\\";
			if(!this.SaveImg(path2, PATH , img, 1 ))
				return Msg.Fail();
			else
				System.out.println("路径：---"+path2+PATH+"---成功上传!");
		}
		
		//开始上传商品信息图
		MultipartFile img2 = mult.getFile("lightInfo");
		if(img2 != null) {
			//获取原图片名
			String PATH = img2.getOriginalFilename();
			//裁剪+随机名称
			PATH = this.SUBPath(PATH);
			lightImage.setImages("img/lightInfo/"+PATH);
			lightManageService.lightInfo(lightImage);//在数据库存储路径
			String path3 = mult.getSession().getServletContext().getRealPath("")+"img\\lightInfo\\";
			if(!this.SaveImg(path3, PATH, img2,0))
				return Msg.Fail();
			else
				System.out.println("路径：---"+path3+PATH+"---成功上传!");
		}else
			System.out.println("---无信息图上传!---");
		
		return Msg.Success();
	}
	

	/**
	 * 随机路径名缩短图片路径长度
	 * @param imgPath
	 * @return
	 */
	private String SUBPath(String imgPath) {
		int i;
		for( i=0;i<99;i++)
		{
			if(imgPath.substring(imgPath.length()-i-1, imgPath.length()-i).equals(".")) {
				break;
			}
		}
		imgPath = UUID.randomUUID().toString().substring(0, 9)+imgPath.substring(imgPath.length()-i-2,imgPath.length());
		return imgPath;
	}


	/**
	 * 上传图片
	 * @param path
	 * @param fileName
	 * @param img
	 * @return
	 */
	private boolean SaveImg(String path ,String fileName, MultipartFile img, int type) {
		FileOutputStream fileOutputStream = null;
		InputStream inputStream;
		try {
            inputStream = img.getInputStream();
            fileOutputStream = new FileOutputStream(new File(path, fileName));
            //上传
            IOUtils.copy(inputStream, fileOutputStream);
            
            //上传图片后需要压缩成400x400的处理
            if(type==1) {
            	if(IMGUtil.compressPic(new File(path,fileName), 400, 400, path+fileName))
            		return true;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return true;
	}
}
