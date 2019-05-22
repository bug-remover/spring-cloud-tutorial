package com.liuliuge.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 17:17  <br/>
 */
@FeignClient(name = "sc-provider-service")
public interface ProviderService {

    @RequestMapping(value = "/getDashboard", method = RequestMethod.GET)
    List<String> getProviderData();

}
