package com.yckj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Classname ZuulApplication
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 16:38
 */
@EnableZuulProxy // 包含了 @EnableZuulServer ，设置该类是⽹关的启动类。
@EnableAutoConfiguration // 可以帮助 Spring Boot 应⽤将所有符合条件的 @Configuration 配置加载到当前 Spring Boot 创建并使⽤的 IOC 容器中。
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
