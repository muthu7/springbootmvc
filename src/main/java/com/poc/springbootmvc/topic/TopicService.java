package com.poc.springbootmvc.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic(11, "Java", "Java Description"),
            new Topic(22, "Python", "Python Description"),
            new Topic(33, "NodeJ", "NodeJS Description"));

    public List<Topic> getAllTopics(){
        return topics;
    }

}
