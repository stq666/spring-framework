package com.stq.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author stqsht@163.com
 * @date 2020-05-26 22:47
 */
public class HellloTest {
	public void sayHello(){
		System.out.println("我要说hello...");
	}


}
