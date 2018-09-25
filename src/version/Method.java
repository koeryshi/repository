package version;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Method {
	List<Student> vs = new ArrayList<Student>();
	Scanner input = new Scanner(System.in);

	/*
	 * 匹配下标
	 * 
	 */
	public int getper(int num) {
		for (int i = 0; i < vs.size(); i++) {
			Student one = vs.get(i);
			if (num == one.getId()) {
				return i;
			}
		}
		return -1;

	}

	
	
	/*
	 * 打印学生
	 * 
	 */
	public void show() {
		System.out.println("学生信息为：\n\tID\t姓名\t性别\t班级");
	}

	
	/*
	 * 增加
	 * 
	 */
	public void inset() {
		System.out.println("请输入学生id：");
		int num = input.nextInt();
		System.out.println("请输入学生姓名：");
		String name = input.next();
		System.out.println("请输入学生性别：");
		String sex = input.next();
		System.out.println("请输入学生所在班级：");
		String banji = input.next();

		Student student = new Student(num, name, sex, banji);
		if (vs.contains(student)) {
			System.out.println("该学生已存在！");
		} else {
			vs.add(student);
			System.out.println("添加成功");
		}
	}
	
	
	/*
	 * 删除
	 * 
	 */

	public void delate() {
		System.out.println("请输入要删除的学生id：");
		int num = input.nextInt();
		boolean t = false;
		for (int i = 0; i < vs.size(); i++) {
			Student one = vs.get(i);
			if (num == one.getId()) {
				show();
				System.out.println(one);
				System.out.println("是否确定删除（Y/N）？");
				String answer = input.next();
				if ("Y".equalsIgnoreCase(answer)) {
					vs.remove(i);
					System.out.println("删除成功!");
				}
				t = true;
				break;
			}
		}
		if (!t) {
			System.out.println("该学生不存在！");
		}
	}
	
	
	/*
	 *查找 
	 *
	 */

	public void search() {
		System.out.println("请输入要查询的学生id：");
		int num = input.nextInt();
		Student i = vs.get(num - 1);
		System.out.println(i);

	}
	
	
	
	/*
	 *修改    根据id修改
	 * 
	 */

	public void change() {
		System.out.println("请输入编号：");
		int num = input.nextInt();
		int Id = getper(num);
		if (Id != -1) {
			System.out.println("请输入姓名:");
			String name = input.next();
			System.out.println("请输入性别:");
			String banji = input.next();
			System.out.println("请输入班级:");
			String sex = input.next();

			Student anyone = vs.get(Id);
			anyone.setName(name);
			anyone.setBanji(banji);
			anyone.setSex(sex);

			show();
			System.out.println(anyone);

			System.out.println("修改成功！");

		} else {
			System.out.println("ID不存在！");
		}

	}

	
	
	/*
	 * 浏览，迭代器遍历集合
	 * 
	 */
	public void showall() {
		System.out.println("所有学生信息：");
		for (ListIterator<Student> li = vs.listIterator(); li.hasNext();) {
			System.out.println(li.next());
		}
	}

	
	
	/*
	 * 退出
	 * 
	 */
	public boolean exit() {
		System.out.println("是否确定退出（Y/N）？");
		return !"Y".equalsIgnoreCase(input.next()) ? true : false;
	}

}
