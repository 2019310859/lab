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
		return "��Ա���: "+this.id+"  ����: "+this.name+"  �Ա�: "+this.sex;
	}
}
