package xuanke;

public class Course {
	public String id;
	public String name;
	public String place;
	public String time;
	public String tname;
	public Course(String id,String name,String place,String time,String tname)
	{
		this.id = id;
		this.name = name;
		this.place = place;
		this.time = time;
		this.tname = tname;
	}
	public String toString() {
		return "�γ̱��: "+this.id+"  �γ�����: "+this.name+"  �Ͽεص�: "+this.place+"  �Ͽ�ʱ��:"
	+this.time+"  �ڿν�ʦ:"+this.tname;
	}
}
