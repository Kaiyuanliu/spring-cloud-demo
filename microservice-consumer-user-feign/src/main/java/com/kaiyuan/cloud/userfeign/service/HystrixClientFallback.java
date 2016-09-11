package com.kaiyuan.cloud.userfeign.service;

import com.kaiyuan.cloud.userfeign.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class HystrixClientFallback implements UserFeignClient {
    @Override
    public User findByFeignId(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
