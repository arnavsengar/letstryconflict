package io.javabrains.springbootstarter.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class Coursecontroller {
	@Autowired
	private Courseservice courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getallcourses(@PathVariable String id)
	{
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicid}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String id,@PathVariable String topicid)
	{
		course.setTopic(new Topic(topicid,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicid}/courses/{id}")
	public void delCourse(@PathVariable String id) {
		courseService.delCourse(id);
	}
}

