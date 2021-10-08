package com.pctc.service;

import org.springframework.stereotype.Component;

/**
 * @author H1PPPY
 * @date 2021/9/30 16:22
 */
@Component
public interface PersonService {

    public void save(String name);
    public void update(String name,Integer id);
    public String getName(Integer id);
}
