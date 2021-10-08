package com.pctc.service.impl;

import com.pctc.dao.StudentDao;
import com.pctc.domain.Student;
import com.pctc.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author H1PPPY
 * @date 2021/10/8 16:14
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Override
    public List<Student> queryStudents() {
        List<Student> list = new ArrayList<>();
        list = studentDao.selectStudents();
        return list;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
