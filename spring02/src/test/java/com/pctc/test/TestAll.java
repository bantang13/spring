package com.pctc.test;

import com.pctc.service.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author H1PPPY
 * @date 2021/9/29 17:12
 */
public class TestAll {

    @Test
    public void testPrinter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Printer printer = (Printer) context.getBean("pri");

        System.out.println(printer);
    }
}
