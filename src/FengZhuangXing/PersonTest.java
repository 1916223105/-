package FengZhuangXing;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入年龄：");
		
		int customAge = input.nextInt();
		
		Person b=new Person();
		b.setAge(customAge);
		
		System.out.println("这个人的年龄是："+b.getAge());
		
		
		
		
	}

}
