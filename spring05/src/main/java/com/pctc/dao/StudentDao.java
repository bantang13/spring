package com.pctc.dao;

import com.pctc.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author H1PPPY
 * @date 2021/10/8 11:53
 */
public interface StudentDao {
    
    List<Student> selectStudents();

}
