package xuanke;

public class Teacher {
	public String id;	 
	public String name;
	public String sex;
	public String teach;
	public Teacher(String id,String name,String sex,String teach)
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.teach = teach;
	}
	public String toString() {
		return "教师编号: "+this.id+"  姓名: "+this.name+"  性别: "+this.sex+"  教授课程:"+this.teach;
	}
}