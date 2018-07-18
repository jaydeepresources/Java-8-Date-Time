package localTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class TestLocalTime {

	public static void main(String[] args) {

		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time=" + time);

		// Creating LocalTime by providing input arguments
		LocalTime specificTime = LocalTime.of(9, 30, 0, 400);
		System.out.println("Training in full swing at=" + specificTime);

		// Create specific time using Zone Id
		LocalTime timeParis = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Current Time in Paris="+timeParis);

	}

}
