package localDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class TestLocalDate {

	public static void main(String[] args) {

		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date=" + today);

		// Creating LocalDate by providing input arguments
		LocalDate firstDay_2018 = LocalDate.of(2018, Month.JANUARY, 1);
		System.out.println("Specific Date=" + firstDay_2018);

		// Creating LocalDate using time-zone ID
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkata);
	}
}
