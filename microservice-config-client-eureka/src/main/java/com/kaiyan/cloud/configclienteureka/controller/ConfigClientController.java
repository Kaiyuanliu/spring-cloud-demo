package com.kaiyan.cloud.configclienteureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profile.name}")
    private String profileName;

    @RequestMapping(value = "/profile/name", method = RequestMethod.GET)
    public String profile() {
        return this.profileName;
    }
}
