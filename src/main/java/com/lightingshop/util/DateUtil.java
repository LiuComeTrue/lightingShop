package com.lightingshop.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat类不都是线程安全的.
 * blog:http://www.cnblogs.com/peida/archive/2013/05/31/3070790.html
 *
 */
public class DateUtil {

    public static String formatDate(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
   
    public static Date parse(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //从MyBatis中取Date类型字段后会有".0"后缀，判断有则去掉后两位字符
        String suffix = ".0";
        if (suffix.equals(strDate.substring(strDate.length() - 2, strDate.length())))
            strDate = strDate.substring(0, strDate.length() - 2);
        return sdf.parse(strDate);
    }
}
