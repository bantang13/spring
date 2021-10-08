package com.pctc.domain;


public class Student {

    private long tId;
    private String tName;
    private long tAge;


    public long getTId() {
        return tId;
    }

    public void setTId(long tId) {
        this.tId = tId;
    }


    public String getTName() {
        return tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }


    public long getTAge() {
        return tAge;
    }

    public void setTAge(long tAge) {
        this.tAge = tAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                '}';
    }
}
