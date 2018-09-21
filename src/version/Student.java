package version;

public class Student {
		public Student(){}
		
		public Student(int id,String name,char sex,String banji) {
			this.id=id;
			this.name=name;
			this.sex= sex;
			this.banji=banji;
			
		}
		
		
		private int id;
		private String name;
		private char sex;
		private String banji;
		
		
		
		public String getBanji() {
			return banji;
		}



		public void setBanji(String banji) {
			this.banji = banji;
		}



		public char getSex() {
			return sex;
		}



		public void setSex(char sex) {
			this.sex = sex;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}




		
		}

