package com.example.Visma_project;

import com.example.Visma_project.Meeting_data.MeetingData;
import com.example.Visma_project.Meeting_data.MeetingDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Repository
public class VismaProjectApplication {

	private static final Logger log = LoggerFactory.getLogger(VismaProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(VismaProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(MeetingDataRepository repository) {
		return (args) -> {
			//saving meeting data
			repository.save(new MeetingData(
					"Visma_meeting",
					"Tom",
					"Visma project first time with spring boot",
					"Hub",
					"Live",
					LocalDate.now(),
					LocalDate.of(2023, Month.APRIL, 8)));

			// fetch all meeting data
			log.info("Meeting data found with findAll():");
			log.info("-------------------------------");
			for (MeetingData meetingData : repository.findAll()) {
				log.info(meetingData.toString());
			}
			log.info("");
		};
	}
}
