package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
