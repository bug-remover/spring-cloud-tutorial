package com.liuliuge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/20 18:07  <br/>
 */
@RestController
@RequestMapping("user")
public class TestUserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("add")
    public String add(String name) {
        String result = restTemplate.getForObject("http://user-service/user/add?name=" + name, String.class);
        return result;
    }

}
