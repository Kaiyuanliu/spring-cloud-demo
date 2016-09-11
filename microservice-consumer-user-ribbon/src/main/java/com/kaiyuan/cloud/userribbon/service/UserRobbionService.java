package com.kaiyuan.cloud.userribbon.service;

import com.kaiyuan.cloud.userribbon.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRobbionService {

    private static Logger logger = LoggerFactory.getLogger(UserRobbionService.class);
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        return this.restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/"+id, User.class);
    }

    public User fallback(Long id) {
        logger.info("error happened, get into fallback method, id = " + id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
