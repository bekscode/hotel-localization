package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.i18n.DisplayMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		// Create instances for required locales
		DisplayMessage displayMessageEnglish = new DisplayMessage(Locale.US);
		DisplayMessage displayMessageFrench = new DisplayMessage(Locale.CANADA_FRENCH);

		// Create threads for DisplayMessage instance
		Thread englishThread = new Thread(displayMessageEnglish);
		Thread frenchThread = new Thread(displayMessageFrench);

		// Start threads
		englishThread.start();
		frenchThread.start();

	}

}
