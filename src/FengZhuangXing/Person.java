package FengZhuangXing;

public class Person {
	
	private int age;
	
	public void setAge(int num){
		if(num<0|| num>130 ){
			System.out.println("你输入的年龄为："+num+",该年龄不合法。");
			return;
		}
		age=num;
	}
	
	public int getAge(){
		return age;
	}
	
	public Person(){
		age=18;
	}
	
	
	
	
	
	
	
	
	
	
	
}
