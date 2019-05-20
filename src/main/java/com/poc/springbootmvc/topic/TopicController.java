package com.poc.springbootmvc.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/dummytopics")
    public String getDummyTopics(){
        return "Returning ALL Topics";
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")                         // ("/topics/{foo}") => AnotherWay
    public Topic getTopic(@PathVariable("id") String foo){      // @PathVariable("foo" int id
        return topicService.getTopic(foo);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
}
