package com.liuliuge.controller;

import com.liuliuge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 14:04  <br/>
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUser")
    public String findUser(String name) throws Exception {
        return this.userService.getByName(name);
    }

}
