package com.liuliuge.service;

import com.liuliuge.service.impl.AccountServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * DESCRIPTION:配置降级回退类 <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 14:52  <br/>
 */
@FeignClient(name = "account-provider-service", fallback = AccountServiceFallback.class)
public interface AccountService {

    @RequestMapping(value = "/getAcct", method = RequestMethod.GET)
    String getByAcctNo(String acctNo) throws Exception;

}
