package com.gaurav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.entity.Student;
import com.gaurav.repository.StudentRepository;
import com.gaurav.response.StudentResponse;

@RestController
public class HomeController {

	@Autowired
	private StudentRepository repository;
	
	@GetMapping("/student")
	public Object getAllStudent(@RequestParam(value="pagenum")Integer pagenum,@RequestParam(value="pagesize") Integer pagesize){
		 Pageable paging = PageRequest.of(pagenum, pagesize);
		 Page<Student> studentPage = repository.findAll(paging);
		 StudentResponse studentResponse = new StudentResponse();
		 studentResponse.setTotalPages(String.valueOf(studentPage.getTotalPages()));
		 studentResponse.setStudents(studentPage.getContent());
		 return studentResponse;
	}
}
