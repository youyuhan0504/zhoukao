package com.youyuhan.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {

/**
 * 方法1：返回min-max之间的随机整数（包含min和max值），
 * 例如返回1-3之间的随机数，
 * 那么返回1或2或3都是正确的，返回4就不对。
 *
 */
	public static int random(int min, int max){
		Random r=new Random();
		return r.nextInt(max-min+1)+min;
		
		}
/**
 * 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
 * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，
 * 因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
 */
	public static Set subRandom (int min, int max, int subs){
		Set set=new HashSet<>();
		while(set.size()!=subs) {
			Random r=new Random();
			set.add(r.nextInt(max-min+1)+min);
		}
		
		return set;
	
		}
	/**
	 * 方法3：返回1个1-9,a-Z之间的随机字符。
	 */
	
	public static char randomCharacter (){
		String a="123456789asdfghjklqwertyuiopxcvbnmz";
		int aa = random(0, a.length()-1);
		return a.charAt(aa);
	
	}
	/**
	 * 方法4：返回参数length个字符串(5分)，
	方法内部要调用randomCharacter()方法
	 */
	public static String randomString(int length){
		String a="123456789asdfghjklqwertyuiopxcvbnmz";
		String ds="";
		for (int i = 0; i < length; i++) {
			char asd = randomCharacter();
			ds+=asd;
		}
		return ds;
	
	}
	
}
