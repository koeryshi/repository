package version;



public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Menu m=new Menu();
		Method vs = new Method();
		boolean flag=true;
		while(flag) {
			int slt=m.showMenu();
			switch(slt) {
			case 1:vs.inset();//增加
			break;
			case 2:vs.delate();//删除
			break;
			case 3:vs.search();//查询
			break;
			case 4:vs.change();//修改
			break;
			case 5:vs.showall();//浏览
			break;
			case 6:				//退出
				flag=vs.exit();
				if(!flag)
				System.out.println("谢谢使用！");
			break;
			}									
		}
		
	}

}
