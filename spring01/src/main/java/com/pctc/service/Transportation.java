package com.pctc.service;

/**
 * @author H1PPPY
 * @date 2021/9/28 10:30
 */
public class Transportation {
    private String tName;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "tName='" + tName + '\'' +
                '}';
    }
}
