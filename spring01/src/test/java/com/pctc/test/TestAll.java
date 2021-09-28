package com.pctc.test;

import com.pctc.service.Worker;
import com.pctc.service1.DataType;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author H1PPPY
 * @date 2021/9/28 10:35
 */
public class TestAll {

    @Test
    public void testWorker(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Worker worker = (Worker) context.getBean("worker");
        System.out.println(worker);
    }

    @Test
    public void testDataType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        DataType dataType = (DataType) context.getBean("dataType");
        System.out.println(dataType);
    }
}
