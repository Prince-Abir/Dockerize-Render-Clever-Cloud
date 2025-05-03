package com.myapp.dozzy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.dozzy.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	


}
