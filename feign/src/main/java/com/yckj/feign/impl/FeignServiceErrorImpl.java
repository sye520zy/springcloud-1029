package com.yckj.feign.impl;

import com.yckj.entity.Student;
import com.yckj.feign.IFeignService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname FeignServiceImpl
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 17:22
 */
//@Component
public class FeignServiceErrorImpl implements IFeignService {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
