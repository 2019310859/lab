package xuanke;

public class Text {
	public static void main(String args[]){
		Student stu1 = new Student("2019310849","刘佳阳","男","Java");
		Teacher tea1 = new Teacher("002004****","张老师","男","Java");
		Course cou1 = new Course("1","Java","教306","第9~10节","张老师");
		People peo1 = new People("2019310849","刘佳阳","男");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
		System.out.println("选课学生："+stu1.name+cou1.toString());
	}
}
