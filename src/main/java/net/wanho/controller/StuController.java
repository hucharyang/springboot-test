package net.wanho.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import net.wanho.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    RedisTemplate redisTemplate;

    // static Logger log = LoggerFactory.getLogger(StuController.class);
    //springboot默认使用的是jackson，且不需要导入依赖
    @GetMapping("/list")
    public List<Student> list(){
        log.info("stu.list");
        Student stu1 = (Student) studentMapper.selectByPrimaryKey(1);
        Student stu2 = (Student) studentMapper.selectByPrimaryKey(1);
        Student stu3 = (Student) studentMapper.selectByPrimaryKey(1);
        Student stu4 = (Student) studentMapper.selectByPrimaryKey(1);
        redisTemplate.opsForValue().set("key","abc");
        List<Student> stus = Arrays.asList(stu1,stu2,stu3,stu4);
        log.info((String) redisTemplate.opsForValue().get("key"));
        return stus;
    }
    @GetMapping("/rmi")
    public String rmi(){
        redisTemplate.delete("stu1");
        return "stus";
    }
}
