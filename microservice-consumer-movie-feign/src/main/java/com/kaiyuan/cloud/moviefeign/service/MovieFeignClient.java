package com.kaiyuan.cloud.moviefeign.service;

import com.kaiyuan.cloud.moviefeign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface MovieFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);
}
