package FengZhuangXing;

public class Person {
	
	private int age;
	
	public void setAge(int num){
		if(num<0|| num>130 ){
			System.out.println("�����������Ϊ��"+num+",�����䲻�Ϸ���");
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
