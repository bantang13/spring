package com.pctc.service.impl;

import com.pctc.service.PersonService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author H1PPPY
 * @date 2021/9/30 16:25
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Override
    public void save(String name) {
        System.out.println("save方法");
    }

    @Override
    public void update(String name, Integer id) {
        System.out.println("update方法");
    }

    @Override
    public String getName(Integer id) {
        System.out.println("getPersonName方法");
        /*System.out.println(10/0);*/
        return "xxx";
    }
}
