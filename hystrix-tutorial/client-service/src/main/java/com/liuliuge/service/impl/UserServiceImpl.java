package com.liuliuge.service.impl;

import com.liuliuge.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 13:48  <br/>
 */
@Component
public class UserServiceImpl implements UserService {

    public static final String DEFAULT_USER_NAME = "tom";

    @HystrixCommand(fallbackMethod = "defaultException")
    @Override
    public String getByName(String name) throws Exception {
        if (DEFAULT_USER_NAME.equals(name)) {
            return name;
        }
        throw new Exception();
    }

    public String defaultException(String name) {
        return "system error";
    }
}
