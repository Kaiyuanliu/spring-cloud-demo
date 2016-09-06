package com.kaiyuan.cloud.moviefeign.service;

import com.kaiyuan.cloud.moviefeign.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class HystrixClientFallback implements MovieFeignClient{
    @Override
    public User findById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
