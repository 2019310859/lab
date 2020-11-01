package xuanke;

public class People {
	public String id;
	public String name;
	public String sex;
	public People(String id,String name,String sex)
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public String toString() {
		return "人员编号: "+this.id+"  姓名: "+this.name+"  性别: "+this.sex;
	}
}
