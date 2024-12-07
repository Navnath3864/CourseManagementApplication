package com.cma.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cma.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
