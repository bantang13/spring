package com.pctc.service;

/**
 * @author H1PPPY
 * @date 2021/9/28 10:31
 */
public class ProductionTool {
    private String pName;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "ProductionTool{" +
                "pName='" + pName + '\'' +
                '}';
    }
}
