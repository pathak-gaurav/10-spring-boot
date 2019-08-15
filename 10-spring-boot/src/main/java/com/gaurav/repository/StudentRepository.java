package com.gaurav.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gaurav.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query(value="select * from student",nativeQuery=true)
	public Page<Student> findAll(Pageable paging);
	
}
