package com.cma.service;

import java.util.List;

import com.cma.model.Course;

public interface CourseService {

	public void saveCourse(Course c);

	public List<Course> viewCourse();

	public void deleteCousre();

}
