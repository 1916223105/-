package src;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("输入被除数：");
		int numl1 = in.nextInt();
		System.out.println("输入除数：");
		int numl2 = in.nextInt();
		
		System.out.println("num1 / num2 = "+ numl1/numl2);
		
		System.out.println("感谢使用！");
	}

}
