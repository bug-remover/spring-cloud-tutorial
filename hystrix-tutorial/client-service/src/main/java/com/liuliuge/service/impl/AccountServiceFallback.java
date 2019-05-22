package com.liuliuge.service.impl;

import com.liuliuge.service.AccountService;
import org.springframework.stereotype.Component;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 14:58  <br/>
 */
@Component
public class AccountServiceFallback implements AccountService {

    @Override
    public String getByAcctNo(String acctNo) throws Exception {
        return "system error";
    }
    
}
