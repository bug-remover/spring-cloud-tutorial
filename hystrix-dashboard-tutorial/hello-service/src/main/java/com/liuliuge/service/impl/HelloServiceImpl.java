package com.liuliuge.service.impl;

import com.liuliuge.service.HelloService;
import com.liuliuge.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 17:14  <br/>
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Autowired
    private ProviderService providerService;

    @Override
    public List<String> getProviderData() {
        return this.providerService.getProviderData();
    }

}
