package com.liuliuge.controller;

import com.liuliuge.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 17:21  <br/>
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        return helloService.getProviderData();
    }

    @GetMapping(value = "/helloService")
    public String getHelloServiceData() {
        return "hello Service";
    }

}
