package com.youyuhan.common.utils;



import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.Test;

import com.youyuhan.common.entity.Person;

public class Persontext {
	//Person类，批量生成1万个
	@Test
	public void testPerson() throws UnsupportedEncodingException {
		for (int i = 0; i < 10000; i++) {
			Person p=new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), StringUtil.randomChineseString(140), new Date());
			System.out.println(p);
		}

	}
}
