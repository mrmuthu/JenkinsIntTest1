package com.muthu.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestMain {

	public static void main(String[] args) {
		
	TestMain test = new TestMain();
			Date da;
			try {
				da = test.formatToDate("2016-02-22");
			
			System.out.println("Date 1 : " + da);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			Calendar cal = Calendar.getInstance();
			System.out.println("date2 : "+test.formatDatetoStr(cal.getTime()));
			

	}
	
	public Date formatToDate(String date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
			return sdf.parse(date);
		
	}
	
	public String formatDatetoStr(Date date){

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		return sdf.format(date);
		
		
	}

}
