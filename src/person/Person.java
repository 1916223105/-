package person;

public class Person {
	
	//名字
	public String name;
	
	//年龄
	public int age;
	
	//姓别
	public int sex;
	
	
	public void study(){
		System.out.println("studying");
	}
	public void showAge(){
		System.out.println(name+"的年龄是"+age+"岁");
	}
	public int addAge(){
		 age +=2;
		return age;
	}
}


