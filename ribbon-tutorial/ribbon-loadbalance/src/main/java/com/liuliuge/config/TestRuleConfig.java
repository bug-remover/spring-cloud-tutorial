package com.liuliuge.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DESCRIPTION:TODO <br/>
 *
 * @author qizhongju
 * @Date: 2019/5/21 19:52  <br/>
 */
@Configuration
public class TestRuleConfig {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
