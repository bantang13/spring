package com.pctc.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author H1PPPY
 * @date 2021/9/29 16:54
 */

@Component
public class Paper {

    @Value("A4")
    private String paperSize;

    public String getPaperSize() {
        return paperSize;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "paperSize='" + paperSize + '\'' +
                '}';
    }
}
