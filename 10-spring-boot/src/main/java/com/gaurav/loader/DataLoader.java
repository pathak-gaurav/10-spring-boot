package com.gaurav.loader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gaurav.entity.Course;
import com.gaurav.entity.Student;
import com.gaurav.repository.CourseRepository;
import com.gaurav.repository.StudentRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private StudentRepository studentRepository;
	private CourseRepository courseRepository;

	public DataLoader(StudentRepository studentRepository, CourseRepository courseRepository) {
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Course course= new Course("HTML and CSS");
		courseRepository.save(course);
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));
		studentRepository.save(new Student("Zack", "Anderson",course));

	}

}
