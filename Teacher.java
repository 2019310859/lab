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
		return "��ʦ���: "+this.id+"  ����: "+this.name+"  �Ա�: "+this.sex+"  ���ڿγ�:"+this.teach;
	}
}