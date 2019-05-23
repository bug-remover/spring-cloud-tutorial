package com.liuliuge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/23 16:54  <br/>
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        System.out.println("----------------header----------------");
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            System.out.println(key + ": " + request.getHeader(key));
        }
        System.out.println("----------------header----------------");
        return "hellooooooooooooooo!";
    }

}
