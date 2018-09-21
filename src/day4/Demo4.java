package day4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhujiahang
 * 	版权所有，仅供学习参考使用
 *
 */
public class Demo4 {

	/**
	 * 一个ArrayList对象aList存有若干个字符串元素，
	现欲遍历该ArrayList对象，删除其中所有值为“abc”的字符串元素
	请用代码实现
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List aList = new ArrayList();
		aList.add("abc");
		aList.add("274");
		aList.add("gs");
		aList.add("abc");
		aList.add("hft");
		aList.add("c");
		aList.add("abc");
		aList.add("a245");
		aList.add("abc");
		System.out.println("原集合为"+aList);
		for(int i = 0;i<=aList.size();i++) {
			if(aList.get(i)=="abc") {
				aList.remove(i);
			}else {
				continue;
			}
		}
		System.out.println("现集合为"+aList);

	}

}
