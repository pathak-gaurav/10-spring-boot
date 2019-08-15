package com.gaurav.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "COURSE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;

	private String courseName;

	public Course(String courseName) {
		this.courseName = courseName;
	}

}
