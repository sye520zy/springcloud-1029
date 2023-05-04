package com.yckj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Classname ConfigServer1Application
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/4 22:01
 */
@SpringBootApplication
@EnableConfigServer // 声明一个配置中心
public class ConfigServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer1Application.class,args);
    }
}
