package com.yckj.controller;

import com.yckj.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname ConsumerController
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 16:28
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List findAll(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",List.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,Boolean.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }
}
