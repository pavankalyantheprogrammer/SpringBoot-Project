package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.entity.Student;
import com.code.repository.StudentRepository;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("PavanKalyan", "Magam","pavankalyanmagam@gmail.com");
//		studentRepository.save(student1);
//		
//		
//		Student student2 = new Student("Nani", "Magam","nanimagam@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Sukesh", "Sharma","ssharma@gmail.com");
//		studentRepository.save(student3);
	}

}
