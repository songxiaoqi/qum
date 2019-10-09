package com.quming.back.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 暂时不用
 */
@Component
@Aspect
public class PageHelpAop {

    /**
     * 切点 环绕mapper方法根据方法名后缀执行分页
     */
    @Pointcut("execution(* com.quming.mapper..*ByPage(..)))")
    public void pointCut(){}


    /**
     * 环绕执行
     */
    @Around("pointCut()")
    public Object arountAdvice(ProceedingJoinPoint pjp) throws Throwable{

        Object proceed = pjp.proceed();
        return proceed;
    }
}
