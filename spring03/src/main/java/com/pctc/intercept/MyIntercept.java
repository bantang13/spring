package com.pctc.intercept;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @author H1PPPY
 * @date 2021/9/30 16:30
 */
public class MyIntercept {

    //方法执行之前
    public void doBeforeRunning(JoinPoint joinPoint){

        String methodName=joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(args));
        System.out.println("test doBeforeRunning()");

    }

    //方法执行之后
    public void doAfterRunning(JoinPoint joinPoint){

        String methodName=joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(args));
        System.out.println("test doAfterRunning()");

    }
}
