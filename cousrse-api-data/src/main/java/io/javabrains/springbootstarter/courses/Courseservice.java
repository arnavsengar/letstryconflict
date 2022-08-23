package io.javabrains.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Courseservice {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String topicid){
		List <Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicid)
		.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String Id)
	{
		return courseRepository.findById(Id);
		//return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course topic) {
		courseRepository.save(topic);
		
	}

	public void delCourse(String id) {
		courseRepository.deleteById(id);
		//topics.removeIf(t -> t.getId().equals(id)); 
	}

}
