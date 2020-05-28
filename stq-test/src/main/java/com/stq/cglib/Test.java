package com.stq.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author stqsht@163.com
 * @date 2020-05-26 22:52
 */
public class Test {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(HellloTest.class);
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("增强前...");
				Object result = methodProxy.invokeSuper(o,objects);
				System.out.println("增强后...");
				return result;
			}
		});
		HellloTest test = (HellloTest) enhancer.create();
		test.sayHello();
	}
}
