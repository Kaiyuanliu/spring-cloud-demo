package com.kaiyuan.cloud.userribbon.controller;

import com.kaiyuan.cloud.userribbon.entity.User;
import com.kaiyuan.cloud.userribbon.service.UserRobbionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRibbonController {

    @Autowired
    private UserRobbionService userRobbionService;

    @RequestMapping(value = "/ribbon/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return this.userRobbionService.findById(id);
    }
}
