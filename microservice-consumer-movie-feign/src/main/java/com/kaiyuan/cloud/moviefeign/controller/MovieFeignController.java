package com.kaiyuan.cloud.moviefeign.controller;

import com.kaiyuan.cloud.moviefeign.entity.User;
import com.kaiyuan.cloud.moviefeign.service.MovieFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieFeignController {

    @Autowired
    private MovieFeignClient movieFeignClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return this.movieFeignClient.findById(id);
    }
}
