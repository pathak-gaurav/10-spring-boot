package com.gaurav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="STUDENT")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_ID")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Course course;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student(String firstName, String lastName, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}
	
}
