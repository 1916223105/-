import java.util.Scanner;
/**
 * ʹ��forѭ����ʵ��1+...+100
 * @author student
 */
public class Test02 {
	
	private static Scanner scanner;

	public static void main(String[] args){
		
		System.out.println("������һ�����������1����������ֵ��");
		
		scanner = new Scanner(System.in);
		
		long last = scanner.nextInt();
	
		int sum = 0 ;
		
		for(int i = 1 ; i<=last ; i++){
			sum += i;
	}
		System.out.println(sum);
	}
	
	
}