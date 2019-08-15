package com.gaurav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	
	public List<Course> findAll();

}
