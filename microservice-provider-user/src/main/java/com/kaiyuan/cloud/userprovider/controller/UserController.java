package com.kaiyuan.cloud.userprovider.controller;

import com.kaiyuan.cloud.userprovider.domain.User;
import com.kaiyuan.cloud.userprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }

    @RequestMapping(value = "/instance-info", method = RequestMethod.GET)
    public ServiceInstance showInfo() {
        return this.discoveryClient.getLocalServiceInstance();
    }
}
