package ru.avakyants.java.bball.test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		String dateStr = "20180202T18:00:00+03:00";
		ZonedDateTime datetime = ZonedDateTime.parse(dateStr, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println(datetime.getHour());

	}

}
