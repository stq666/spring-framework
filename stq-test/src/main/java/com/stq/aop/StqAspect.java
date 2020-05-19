package com.stq.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author stqsht@163.com
 * @date 2020-05-18 22:02
 */
@Component
@Aspect
public class StqAspect {

	@Pointcut("execution(* com.stq.aop.*.*(..))")
	public void stqPointCut() {
	}

	@Before("stqPointCut()")
	public void stqBefore() {
		System.out.println("Before...前置通知");
	}

	@After("stqPointCut()")
	public void after() {
		System.out.println("After...后置通知");
	}

	@Around("stqPointCut()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around...前");
		Object retVal = pjp.proceed();
		System.out.println("Around...后");
		return retVal;
	}

	@AfterReturning("stqPointCut()")
	public void afterReturning() {
		System.out.println("AfterReturning...返回值通知");
	}

	@AfterThrowing("stqPointCut()")
	public void throwing() {
		System.out.println("AfterThrowing...异常通知");
	}
}
