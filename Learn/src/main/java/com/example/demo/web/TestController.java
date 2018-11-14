package com.example.demo.web;

import com.example.demo.common.vo.JsonResult;
import com.example.demo.dao.TeacherMapper;
import com.example.demo.model.bean.Teacher;
import com.example.demo.model.vo.TeacherAndStudentsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TeacherMapper teacherMapper;

    @GetMapping(value = "/hello")
    public String hello(){
        logger.info("hello");
        return JsonResult.okResult("hello");
    }

    @GetMapping(value = "/getTeachers")
    public String getTeachers(){
        logger.info("getTeachers");
        List<Teacher> teachers = teacherMapper.getTeachers();
        return JsonResult.okResult(teachers);
    }

    @GetMapping(value = "/getTeacherAndStudents")
    public String getTeacherAndStudents(){
        logger.info("getTeacherAndStudents");
        List<TeacherAndStudentsVo> teacherAndStudentsVos = teacherMapper.getTeacherAndStudents("1");
        return JsonResult.okResult(teacherAndStudentsVos);
    }



}
