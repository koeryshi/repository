package version;

public class Student {
		public Student(){}
		
		public Student(int id,String name,String sex,String banji) {
			this.id=id;
			this.name=name;
			this.sex= sex;
			this.banji=banji;
			
		}
		
		
		private int id;
		private String name;
		private String sex;
		private String banji;
		
		
		
		public String getBanji() {
			return banji;
		}



		public void setBanji(String banji) {
			this.banji = banji;
		}



		public String getSex() {
			return sex;
		}



		public void setSex(String sex) {
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
		public String toString() {
			return "\t"+id+"\t"+name+"\t"+sex+"\t"+banji;	
		}

		
		}

