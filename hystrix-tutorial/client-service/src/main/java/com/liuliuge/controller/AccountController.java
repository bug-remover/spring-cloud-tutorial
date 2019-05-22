package com.liuliuge.controller;

import com.liuliuge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/22 15:05  <br/>
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/getByAcctNo")
    public String getByAcctNo(@RequestParam("acctNo") String acctNo) throws Exception {
        return this.accountService.getByAcctNo(acctNo);
    }

}
