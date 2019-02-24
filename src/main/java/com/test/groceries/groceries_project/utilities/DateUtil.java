package com.test.groceries.groceries_project.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author aboujaow
 *
 */
public class DateUtil {
	
	public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";

	/**
	 * 
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static Date createDate(String date, String dateFormat) throws ParseException {
		
		if (dateFormat == null || dateFormat.equals("")) {
			dateFormat = DEFAULT_DATE_FORMAT;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		if (date != null && date != "") {
			return sdf.parse(date);
		}
		
		// if date parameters is null then return current date
		Date today = new Date();
		return sdf.parse(sdf.format(today));
	}
	
	public static String formatDateAsString(Date date, String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}
}
