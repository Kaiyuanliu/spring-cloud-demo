package com.kaiyuan.cloud.userfeign.controller;

import com.kaiyuan.cloud.userfeign.entity.User;
import com.kaiyuan.cloud.userfeign.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/feign/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findByFeignId(id);
    }
}
