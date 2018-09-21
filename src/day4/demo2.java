package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList();
		list.add(12);
		list.add("af");
		list.add("d");
		list.add("dgsdb");
		System.out.println(list);
/*		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		list.clear();
	*/
		list.remove(0);
		System.out.println(list);
		
		
		System.out.println(list.get(2));
		
		list.set(1, "you");
		
		System.out.println(list);
	}
	
}
