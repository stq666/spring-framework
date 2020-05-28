package com.stq.test;

import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  Java内省测试
 * @author stqsht@163.com
 * @date 2020-05-27 21:30
 */
public class IntrospectorTest {

	public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
		BeanInfo beanInfo = Introspector.getBeanInfo(User.class,Object.class);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor propertyDescriptor:propertyDescriptors){
			Method readMethod = propertyDescriptor.getReadMethod();
			System.out.println(readMethod);
		}
		MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
		for (MethodDescriptor methodDescriptor:methodDescriptors){
			Method method = methodDescriptor.getMethod();
			System.out.println(method);
			method.invoke(beanInfo,null);
		}
	}

}
class User{
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public void eat(){
		System.out.println("吃饭");
	}
}
