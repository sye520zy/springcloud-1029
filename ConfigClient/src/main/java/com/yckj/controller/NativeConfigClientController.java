package com.yckj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname NativeConfigClientController
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/4 18:35
 */
@RestController
@RequestMapping("/native")
public class NativeConfigClientController {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;
    @GetMapping("/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
