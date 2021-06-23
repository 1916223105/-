
public class Test {
	public static void main(String[] args){
		//创建一个学生
		Student stu = new Student();
		stu.name = "ki晨";
		stu.age = 12;
		stu.major = "电焊";
		stu.interest = "造飞机";
		stu.say();
		
		//创建一个教师
		Teacher teacher = new Teacher();
		teacher.name = "老王";
		teacher.age = 35;
		teacher.teachAge = 10;
		teacher.coutse = "电焊与造飞机";
		teacher.asy();
	}

}
