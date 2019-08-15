package com.gaurav.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gaurav.entity.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {
	
	private List<Student> students;
	private String totalPages;
	
}
