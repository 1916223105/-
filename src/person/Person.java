package person;

public class Person {
	
	//����
	public String name;
	
	//����
	public int age;
	
	//�ձ�
	public int sex;
	
	
	public void study(){
		System.out.println("studying");
	}
	public void showAge(){
		System.out.println(name+"��������"+age+"��");
	}
	public int addAge(){
		 age +=2;
		return age;
	}
}


