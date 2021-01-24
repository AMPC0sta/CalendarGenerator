package calendar.generator.ut;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import calendar.generator.logic.CalendarSeeder;

public class CalendarGeneratorTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD");
		Date date = new Date();
		String[][] cal;
		
		try 
		{
			date = sdf.parse("2021/01/04");	
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		
		CalendarSeeder c = new CalendarSeeder(date,CalendarSeeder.TYPE_454,2021,5);
		
		System.out.println("******************** Testing class ************************");
		
		cal = c.generator();
		
		for(int ptr=0; ptr <= 364;ptr++ )
			System.out.println("Gregorian Date="+cal[ptr][0]+",DOY="+cal[ptr][1]);
		
	}

}
