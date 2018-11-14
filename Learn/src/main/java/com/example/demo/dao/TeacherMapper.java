package com.example.demo.dao;

import com.example.demo.model.bean.Teacher;
import com.example.demo.model.vo.TeacherAndStudentsVo;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeachers();

    List<TeacherAndStudentsVo> getTeacherAndStudents(String id);
}
