package com.pctc.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author H1PPPY
 * @date 2021/9/29 16:55
 */

@Component
public class Ink {

    @Value("红色")
    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ink{" +
                "color='" + color + '\'' +
                '}';
    }
}
