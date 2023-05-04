package com.yckj.controller;

import com.yckj.entity.Student;
import com.yckj.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname StudentController
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 10:56
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private IStudentService studentService;
    @GetMapping("/findAll")
    public List<Student> findAll(){
        return  studentService.list();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentService.getById(id);
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Student student){
        return studentService.save(student);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Student student){
        return studentService.updateById(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable long id){
        return studentService.removeById(id);
    }
    @GetMapping("/index")
    public String index(){
        return "返回当前端口："+this.port;
    }
}
