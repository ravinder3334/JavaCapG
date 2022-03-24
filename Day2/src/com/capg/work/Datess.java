package com.capg.work;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datess {
 public static void main(String[] args) {
//	LocalDate date = LocalDate.now();
//	System.out.println(date);
	
//	LocalDate date = LocalDate.of(2000, 12, 31);
//	System.out.println(date);
	 
//	 LocalTime time = LocalTime.now();
//	 System.out.println(time);
	 
//	 LocalTime time = LocalTime.of(12, 23, 20,450000000);
//	 System.out.println(time);
	 
//	 LocalTime time = LocalTime.now(ZoneId.of("Egypt"));
//	 System.out.println(time);
	 
//	 for(String s:ZoneId.getAvailableZoneIds()) {
//		 System.out.println(s);
//	 }
	 
	 LocalDateTime dateTime = LocalDateTime.now();
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
	 String dt =  dateTime.format(dtf);
	 System.out.println(dt);
	
	
}
}
