package version;

import java.util.Scanner;

public class Menu {
	Scanner input=new Scanner(System.in);
	public Menu() {}
	public int showMenu() {
		System.out.println("***********************************");
		System.out.println("学生管理系统");
		System.out.println("===================================");
		System.out.println("[1]增加");
		System.out.println("[2]删除");
		System.out.println("[3]查询");
		System.out.println("[4]修改");
		System.out.println("[5]浏览");
		System.out.println("[6]退出");
		System.out.println("***********************************");	
		System.out.print("请选择操作：");
		
		return input.nextInt();
	}

}
