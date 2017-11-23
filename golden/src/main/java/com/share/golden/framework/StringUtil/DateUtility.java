package com.share.golden.framework.StringUtil;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.pagehelper.util.StringUtil;



/**
 * 
 * 功能描述:日期工具类
 * @author Administrator
 * @version 1.0
 * 创建日期:2017年5月12日
 */
public class DateUtility {

	/**
	 * 将Timestamp转化为java.util.Date
	 * @param timestamp
	 * @return
	 */
	public static Date getUtilDate(Timestamp timestamp) {
		if(timestamp == null)
			return null ;
		else
			return new Date(timestamp.getTime());
	}

	/**
	 * 将字符串转化为java.util.Date
	 * @param strDate
	 * @return
	 * @throws Exception 
	 */
	public static Date getDate(String strDate) throws Exception {
		if(StringUtil.isEmpty(strDate)){
			return null ;
		}
			
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(strDate) ;
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("转化异常") ;
		}
	}
	public static String dateToString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		String strDate=sdf.format(date);
		return strDate;
	}
}
