package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Topicservice {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getAllTopics(){
		List <Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String Id)
	{
		return topicRepository.findById(Id);
		//return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
		
	}

	public void delTopic(String id) {
		topicRepository.deleteById(id);
		//topics.removeIf(t -> t.getId().equals(id)); 
	}

}
