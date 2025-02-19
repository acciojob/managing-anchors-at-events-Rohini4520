package com.driver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class ManagingAnchorsAtEventsSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagingAnchorsAtEventsSolutionApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(EventMasterApp eventMasterApp) {
		return args -> {
		// your code goes here
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter event type (e.g., wedding, corporate):");
		String eventType = sc.nextLine();

		System.out.println("Enter language required:");
		String Language = sc.nextLine();

		System.out.println("Enter event duration (in hours):");
		int duration = sc.nextInt();

		Event event = new Event(eventType, Language, duration);
		Anchor recommendedAnchor = eventMasterApp.start(event);

		if (recommendedAnchor != null) {
			System.out.println("Recommended Anchor: " + recommendedAnchor.getName());
		} else {
			System.out.println("No suitable anchor found.");
		}
	};
}

}
