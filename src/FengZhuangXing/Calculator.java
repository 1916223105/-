package FengZhuangXing;

import java.util.Scanner;

public class Calculator {
	
	public static double showLoan(int choose,long sumPrice){
		
		double perYear = 0;
		int years = 1;
		
		switch(choose){
		case 1 :
			perYear = 0.0603;
			years = 36;
			break;
		case 2 :
			perYear = 0.0612;
			years = 60;
			break;
		case 3 :
			perYear = 0.0639;
			years = 240;
			break;
		}
		
		double intrest = sumPrice * perYear;
		
		double result = (sumPrice + intrest)/years;
		
		return result;
	}
	
	public static void main(String[] args){
		
		System.out.println("����������");
		
		Scanner input = new Scanner(System.in);
		long sum = input.nextLong();
		
		System.out.println("��ѡ��������ڣ�3�꣩ ��5�꣩��20�꣩��");
		int choose = input.nextInt();
		
		System.out.println("�¹�Ϊ��"+showLoan(choose,sum));
	}
	

}
