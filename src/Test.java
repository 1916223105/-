
public class Test {
	public static void main(String[] args){
		//����һ��ѧ��
		Student stu = new Student();
		stu.name = "ki��";
		stu.age = 12;
		stu.major = "�纸";
		stu.interest = "��ɻ�";
		stu.say();
		
		//����һ����ʦ
		Teacher teacher = new Teacher();
		teacher.name = "����";
		teacher.age = 35;
		teacher.teachAge = 10;
		teacher.coutse = "�纸����ɻ�";
		teacher.asy();
	}

}
