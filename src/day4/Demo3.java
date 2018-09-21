/**
 * 
 */
package day4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhujiahang
 * 创建一个List集合对象，添加20个30以内的随机整数，不允许重复，并打印输出
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List you = new ArrayList();
		int a = 0;
		while(true) {
			int s =0;
			s = (int)(Math.random()*30);
			if(you.contains(s)) {
				continue;
			}else {
				you.add(s);
				a++;
			}
			if(a==20) {
				break;
			}
		}
		System.out.println(you);
	}		
}


