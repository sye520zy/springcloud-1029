package com.yckj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yckj.entity.Student;
import com.yckj.mapper.StudentMapper;
import com.yckj.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 10:53
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
}
