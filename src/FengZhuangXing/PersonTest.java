package FengZhuangXing;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���������䣺");
		
		int customAge = input.nextInt();
		
		Person b=new Person();
		b.setAge(customAge);
		
		System.out.println("����˵������ǣ�"+b.getAge());
		
		
		
		
	}

}
