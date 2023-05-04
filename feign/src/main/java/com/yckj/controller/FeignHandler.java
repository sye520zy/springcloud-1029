package com.yckj.controller;

import com.yckj.entity.Student;
import com.yckj.feign.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname FeignHandler
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 17:15
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private IFeignService feignService;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return feignService.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignService.index();
    }
}
