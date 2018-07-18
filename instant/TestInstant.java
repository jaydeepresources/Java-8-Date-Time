package instant;

import java.time.Instant;

public class TestInstant {

	public static void main(String[] args) {
		// Create a timestamp in machine (unix) format
		
		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = "+timestamp);

	}

}
