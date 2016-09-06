package com.kaiyuan.cloud.movieribbon.controller;

import com.kaiyuan.cloud.movieribbon.entity.User;
import com.kaiyuan.cloud.movieribbon.service.MovieRobbionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRibbonController {

    @Autowired
    private MovieRobbionService movieRobbionService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return this.movieRobbionService.findById(id);
    }
}
