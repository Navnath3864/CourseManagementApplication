package com.cma.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.model.Course;
import com.cma.repo.CourseRepository;
import com.cma.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public void saveCourse(Course c) {
		courseRepository.save(c);
		
	}

	@Override
	public List<Course> viewCourse() {
		
		return (List<Course>) courseRepository.findAll();
	}

	@Override
	public void deleteCousre() {
		courseRepository.deleteAll();;
		
	}

}
