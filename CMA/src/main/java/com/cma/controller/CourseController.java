package com.cma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cma.model.Course;
import com.cma.service.CourseService;

@Controller
public class CourseController {
	CourseService courseService;
	@Autowired
	
	@RequestMapping("/")
	public String userInterface() {
		return "userinterface";
	}
	
	
	@RequestMapping("/addcourse")
	public String addCousre() {
		return "addCourse";
	}
	
	@RequestMapping("/savecourse")
	public String saveCousre(@ModelAttribute Course c) {
		courseService.saveCourse(c);
		return "addCourse";
	}
	
	@RequestMapping("view")
	public String viewCousre(Model m) {
		List<Course> list=courseService.viewCourse();
		m.addAttribute("data", list);
		return "view";
	}
	
	@RequestMapping("update")
	public String updatePage() {
		return "update";
	}
	
	@RequestMapping("updateCourse")
	public String updateCousre() {
		return "view";
	}
	
	
	@RequestMapping("delete")
	public String deleteCousre(Model m) {
		courseService.deleteCousre();
		List<Course> list=courseService.viewCourse();
		m.addAttribute("data", list);
		return "view";
	}
	
	
}
