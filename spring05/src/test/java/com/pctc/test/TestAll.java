package com.pctc.test;

import com.pctc.domain.Student;
import com.pctc.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author H1PPPY
 * @date 2021/10/8 16:18
 */
public class TestAll {


    @Test
    public void testServiceSelect() {

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ctx.getBean("studentService");

        List<Student> students = service.queryStudents();
        for (Student stu : students) {
            System.out.println(stu);
        }

    }
}
