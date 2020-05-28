package com.stq.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author stqsht@163.com
 * @date 2020-05-27 22:41
 */
@Component
public class Person {
	@Value("${person.nickName}")
	private String nickName;
	private String realName;
	private Integer age;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Override
	public String toString() {
		return "Person{" +
				"nickName='" + nickName + '\'' +
				", realName='" + realName + '\'' +
				", age=" + age +
				'}';
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
