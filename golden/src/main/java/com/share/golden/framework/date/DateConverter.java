package com.share.golden.framework.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements org.springframework.core.convert.converter.Converter<String, Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		try {
			return dateFormat.parse(source);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
