package com.example.demo.config;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.beans.Student;
import com.example.demo.repository.StudentRepository;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository){
		return args->{
			
			Student Simar=new Student(
					
					1,
					"simar",
					"simar@gmail.com",
					LocalDate.of(2000, 05, 17)
					
					);
			repository.save(Simar);
		};
	}
}
