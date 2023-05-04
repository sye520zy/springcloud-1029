package com.yckj.feign;

import com.yckj.entity.Student;
import com.yckj.feign.impl.FeignServiceErrorImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Classname IFeignService
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 17:12
 */
@FeignClient(value = "provider")
public interface IFeignService {
    @GetMapping("/student/findAll")
    public List<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
