package com.yckj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Student
 * @Description TODO
 * @Copyright:Copyright(c) 2022
 * @Company 英才汇硕信息科技有限公司
 * @Author shengyuee
 * @Version 1.0
 * @Date 2023/5/3 10:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_student")
public class Student {
    @TableId(value = "id",type= IdType.ASSIGN_ID)
    private long id;
    private String name;
    private int age;
}
