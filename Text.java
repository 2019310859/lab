package xuanke;

public class Text {
	public static void main(String args[]){
		Student stu1 = new Student("2019310849","������","��","Java");
		Teacher tea1 = new Teacher("002004****","����ʦ","��","Java");
		Course cou1 = new Course("1","Java","��306","��9~10��","����ʦ");
		People peo1 = new People("2019310849","������","��");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
		System.out.println("ѡ��ѧ����"+stu1.name+cou1.toString());
	}
}
