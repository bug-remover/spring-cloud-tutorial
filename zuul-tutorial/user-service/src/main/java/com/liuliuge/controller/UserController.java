package com.liuliuge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/20 18:04  <br/>
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String addUser(@RequestParam String name) {
        return "name is " + name;
    }

}
