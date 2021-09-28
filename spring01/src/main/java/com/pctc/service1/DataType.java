package com.pctc.service1;

import com.pctc.service.Worker;

import java.util.*;

/**
 * @author H1PPPY
 * @date 2021/9/28 17:03
 */
public class DataType {
    private String[] arrayValue; //String数组

    private List<String> listValue;

    private Set<String> setValue;

    private Map<String,Object> mapValue;

    private Properties priInfo; //Hashtable的之类,可以将集合中的键值对写入到磁盘中

    public Date date;

    public List<Worker> listWork;

    public DataType() {
    }

    public DataType(Set<String> setValue,Properties priInfo) {
        this.setValue = setValue;
        this.priInfo = priInfo;
    }

    public String[] getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    public List<String> getListValue() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    public Set<String> getSetValue() {
        return setValue;
    }

    public void setSetValue(Set<String> setValue) {
        this.setValue = setValue;
    }

    public Map<String, Object> getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map<String,
            Object> mapValue) {
        this.mapValue = mapValue;
    }

    public Properties getPriInfo() {
        return priInfo;
    }

    public void setPriInfo(Properties priInfo) {
        this.priInfo = priInfo;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setListWork(List<Worker> listWork) {
        this.listWork = listWork;
    }

    @Override
    public String toString() {
        return "DataType:{\n" +
                "arrayValue=" + Arrays.toString(arrayValue) +
                ",\n"+"listValue=" + listValue +
                ",\n"+"setValue=" + setValue +
                ",\n"+"mapValue=" + mapValue +
                ",\n"+"priInfo=" + priInfo +
                ",\n"+"date=" + date +
                ",\n"+"listWork=" + listWork +
                ",\n}";
    }
}
