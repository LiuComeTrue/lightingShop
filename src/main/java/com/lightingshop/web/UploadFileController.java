package com.lightingshop.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFileController {

    @RequestMapping("/upload")
    private String upload(MultipartFile file, HttpServletRequest request) {
        
        System.out.println("uploadContoller");
        System.out.println(request.getParameter("msg"));
        System.out.println(file.getContentType());//文件类型
        System.out.println(file.getName());//前台传入的名字
        System.out.println(file.getOriginalFilename());//原始名字
        System.out.println(file.getSize());//文件大小

        String path = "D:/upload";//上传路径
        FileOutputStream fileOutputStream = null;
        InputStream inputStream;
        try {
            inputStream = file.getInputStream();
            String uuid = UUID.randomUUID().toString();
            String lastName = file.getOriginalFilename().split("\\.")[1];
            String fileName = uuid + "." + lastName;
            fileOutputStream = new FileOutputStream(new File(path, fileName));
            IOUtils.copy(inputStream, fileOutputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            
        return "redirect:/index.jsp";
    }
    
    @RequestMapping("download")
    @ResponseBody
    public void download(HttpServletResponse response) {
        File file = new File("D:/upload/a.jpg");
        FileInputStream fileInputStream = null;
        try {
            response.setHeader("Content-Disposition", "attachment;filename=a.jpg");
            fileInputStream = new FileInputStream(file);
            ServletOutputStream outputStream = response.getOutputStream();
            IOUtils.copy(fileInputStream, outputStream);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {        
            try {
                if(fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                    // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
}
