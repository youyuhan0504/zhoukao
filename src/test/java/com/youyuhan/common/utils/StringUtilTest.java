package com.youyuhan.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.Test;

import com.youyuhan.common.entity.Person;

public class StringUtilTest {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 
	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength("4"));
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	@Test
	public void testHasText() {
		System.out.println(StringUtil.hasText(" "));
	}
	@Test
	public void testRandomChinese() throws UnsupportedEncodingException {
		System.out.println(StringUtil.randomChinese());
	}
	//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，
	@Test
	public void testRandomChinesestring() throws UnsupportedEncodingException {
		System.out.println(StringUtil.randomChineseString(2));
	}
	//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		System.out.println(StringUtil.generateChineseName());
	}
	
}
