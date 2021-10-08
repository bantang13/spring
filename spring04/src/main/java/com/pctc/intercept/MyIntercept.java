package com.pctc.intercept;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author H1PPPY
 * @date 2021/9/30 16:30
 */
@Aspect
@Component
public class MyIntercept {

   /* //方法执行之前
    @Before("joinPointExpression()")
    public void doBeforeRunning(JoinPoint joinPoint){

        String methodName=joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(args));
        System.out.println("test doBeforeRunning()");

    }

    //方法执行之后 没有异常
    @AfterReturning(value = "joinPointExpression()",returning = "result")
    public void doAfterRunning(JoinPoint joinPoint,Object result){

        String methodName=joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(args)+"正常结束:"+result);
        System.out.println("test doAfterRunning()");

    }

    //finally方法 最后运行
    @After("joinPointExpression()")
    public void doAfter(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(args)+"正常结束:");
        System.out.println("test doAfter()");
    }

    //catch方法 业务代码出错后运行
    @AfterThrowing(value = "joinPointExpression()",throwing = "ee")
    public void doAfterThrowing(JoinPoint joinPoint,Exception ee){
        String methodName=joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(args)+"例外:"+ee);
        System.out.println("test doAfterThrowing()");
    }*/

    //方法执行的整个周期
    @Around("joinPointExpression()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        String methodName = pjp.getSignature().getName();

        try {
            //前置通知
            System.out.println("前置通知");
            System.out.println("方法名:" + methodName + "参数值" + Arrays.asList(pjp.getArgs()));

            //执行目标方法
            result = pjp.proceed();

            //后置通知
            System.out.println("后置通知");
            System.out.println("方法名:" + methodName + "参数值" + Arrays.asList(pjp.getArgs()) + "返回结果:" + result);
        } catch (Throwable e) {
            //异常通知
            System.out.println("异常通知");
            System.out.println("方法名:"+methodName+"参数值"+ Arrays.asList(pjp.getArgs())+"异常:"+e);
        }
        //最终通知
        System.out.println("最终通知");
        System.out.println("方法名:" + methodName + "参数值" + Arrays.asList(pjp.getArgs())+"最终结束");

        //公共业务处理代码
        System.out.println("权限控制系统!");
        return result;
    }


    /*
     * 定义一个方法,用于声明切入点表达式,该方法中再不需要添加其他的代码,
     * 使用 @PointCut 来声明切入点表达式,
     * 后面的其他通知直接使用方法名来引用当前的切入点表达式
     */
    @Pointcut("execution(* com.pctc.service.impl.*.*(..))")
    public void joinPointExpression() {
    }

}
