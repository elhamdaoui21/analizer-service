package com.ismail.analizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=DailyRecordController.class)
public class AnalizerApplication implements CommandLineRunner {

	@Autowired
	private DailyRecordRepository dailyRecordRepository;

	public static void main(String[] args) {
		SpringApplication.run(AnalizerApplication.class, args);
	}

	@Override
	public void run(String... args) {

		dailyRecordRepository.deleteAll();

		dailyRecordRepository.save(new DailyRecord("01-01-2022", 100));
		dailyRecordRepository.save(new DailyRecord("01-02-2022", 246));
		dailyRecordRepository.save(new DailyRecord("01-03-2022", 531));
		dailyRecordRepository.save(new DailyRecord("01-04-2022", 1584));
		dailyRecordRepository.save(new DailyRecord("01-05-2022", 1800));
		dailyRecordRepository.save(new DailyRecord("01-06-2022", 1426));
		dailyRecordRepository.save(new DailyRecord("01-07-2022", 1501));
		dailyRecordRepository.save(new DailyRecord("01-08-2022", 2007));
		dailyRecordRepository.save(new DailyRecord("01-09-2022", 1957));
		dailyRecordRepository.save(new DailyRecord("01-10-2022", 1785));
		dailyRecordRepository.save(new DailyRecord("01-11-2022", 2300));
		dailyRecordRepository.save(new DailyRecord("01-12-2022", 2103));
		dailyRecordRepository.save(new DailyRecord("01-13-2022", 1354));
		dailyRecordRepository.save(new DailyRecord("01-14-2022", 1429));
		dailyRecordRepository.save(new DailyRecord("01-15-2022", 1203));
		dailyRecordRepository.save(new DailyRecord("01-16-2022", 1754));
		dailyRecordRepository.save(new DailyRecord("01-17-2022", 1958));
		dailyRecordRepository.save(new DailyRecord("01-18-2022", 2001));
		dailyRecordRepository.save(new DailyRecord("01-19-2022", 1854));
		dailyRecordRepository.save(new DailyRecord("01-20-2022", 1997));
		dailyRecordRepository.save(new DailyRecord("01-21-2022", 1452));
		dailyRecordRepository.save(new DailyRecord("01-22-2022", 1112));
		dailyRecordRepository.save(new DailyRecord("01-23-2022", 925));


		System.out.println("DailyRecord found with findAll():");
		System.out.println("-------------------------------");
		for (DailyRecord dailyRecord : dailyRecordRepository.findAll()) {
			System.out.println(dailyRecord);
		}
		System.out.println();
	}

}
