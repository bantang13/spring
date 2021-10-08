package com.pctc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author H1PPPY
 * @date 2021/9/29 16:55
 */

@Component("pri")
public class Printer {

    @Autowired  //不写@Qualifier默认使用ByType
    @Qualifier("paper")//ByName
    private Paper paper;

    @Resource(name = "ink")//默认使用ByName
    private Ink ink;

    public Printer() {
    }

    //@Autowired//构造器注入
    public Printer(Paper paper, Ink ink) {
        this.paper = paper;
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public Ink getInk() {
        return ink;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "paper=" + paper +
                ", ink=" + ink +
                '}';
    }
}
