package Oca808;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ques035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014,06,14);  //right way
		//LocalDate date2 = LocalDate.of(6, 20, 2014);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);

	}

}
