package com.liuliuge.controller;

import com.liuliuge.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/20 14:36  <br/>
 */
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping("/github/search")
    public String searchGithubRepo(@RequestParam String keyword) {
        return this.helloFeignService.searchRepo(keyword);
    }

}
