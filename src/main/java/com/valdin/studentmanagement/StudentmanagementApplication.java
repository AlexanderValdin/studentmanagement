package com.valdin.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdin.studentmanagement.entity.Student;
import com.valdin.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Alexander", "Valenzuela",
		 * "alvalenzuela2304@gmail.com"); studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Rafael", "Dinamarca",
		 * "alvalenzuela2304@gmail.com"); studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("José", "José", "alvalenzuela2304@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
