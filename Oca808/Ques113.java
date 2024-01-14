package Oca808;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ques113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.print(dt.format(DateTimeFormatter.ISO_DATE));

	}

}
