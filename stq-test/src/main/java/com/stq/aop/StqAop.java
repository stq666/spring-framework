package com.stq.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author stqsht@163.com
 * @date 2020-05-12 14:17
 */
@Component
@Aspect
public class StqAop {
	@Pointcut("execution(* com.stq.service.*.*(..))")
	public void pointCut1() {

	}

	@Before("pointCut1()")
	public void before() {
		System.out.println("aop...before");

	}
	@After("pointCut1()")
	public void after(){
		System.out.println("aop...after");
	}
}
