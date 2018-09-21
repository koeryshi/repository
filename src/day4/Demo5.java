/**
 * 
 */
package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author zhujiahang
 *			版权所有，仅供学习参考使用
 */
public class Demo5 {

	/**
	 * @param args
	 * 编写程序，生成5个1至10之间的随机整数，存入一个list集合
	 * 编写方法对List集合进行排序，然后遍历集合输出
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List li = new ArrayList();
		int i = 0;
		while(true) {
			int s =0;
			s = (int)(1+Math.random()*9);
			if(li.contains(s)) {
				continue;
			}else {
				li.add(s);
				i++;
			}
			if(i==5) {
				break;
			}
		}
//		System.out.println(li);
/*			ListIterator list= li.listIterator();
			while(list.hasNext()) {
				System.out.print(list.next());
			}*/
		for(int x =0;x<li.size();x++) {
			for(int z=x+1;z<li.size();z++) {
				int m =(int)li.get(x);
				int n =(int)li.get(z);
				if(m<n){
					int temp = m;
					m=n;
					n=temp;
					
				}
				li.set(x, n);
				li.set(z, m);
	
			}
			System.out.print(li.get(x));
		}
		
	}

}
