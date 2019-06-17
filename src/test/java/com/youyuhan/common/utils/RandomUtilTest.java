package com.youyuhan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。
	@Test
	public void testRandom() {
		for (int i = 0; i < 3; i++) {
			System.out.println( RandomUtil.random(1, 3));
		}
				
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	//应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	@Test
	public void testSubRandom() {
		for (int i = 0; i < 3; i++) {
			System.out.println( RandomUtil.subRandom(2, 6, 4));
		}
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 
	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 3; i++) {
			System.out.println( RandomUtil.randomCharacter());
		}
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法
	@Test
	public void testRandomString() {
		for (int i = 0; i < 3; i++) {
			System.out.println( RandomUtil.randomString(4));
		}
	}

}
