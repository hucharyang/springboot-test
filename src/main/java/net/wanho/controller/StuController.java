package net.wanho.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.wanho.po.Student;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/stu")
@Slf4j
public class StuController {

    // static Logger log = LoggerFactory.getLogger(StuController.class);
    //springboot默认使用的是jackson，且不需要导入依赖
    @GetMapping("/list")
    public List<Student> list(){
        log.info("stu.list");
        Student stu1 = new Student(1,"张三",18,"男","南京",new Date());
        Student stu2 = new Student(2,"张三2",18,"男","南京",new Date());
        Student stu3 = new Student(3,"张三3",18,"男","南京",new Date());
        Student stu4 = new Student(4,"张三4",18,"男","南京",new Date());
        List<Student> stus = Arrays.asList(stu1,stu2,stu3,stu4);
        return stus;
    }
}
