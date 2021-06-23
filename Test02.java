import java.util.Scanner;
/**
 * 使用for循环，实现1+...+100
 * @author student
 */
public class Test02 {
	
	private static Scanner scanner;

	public static void main(String[] args){
		
		System.out.println("请输入一个整数计算从1到该整数的值：");
		
		scanner = new Scanner(System.in);
		
		long last = scanner.nextInt();
	
		int sum = 0 ;
		
		for(int i = 1 ; i<=last ; i++){
			sum += i;
	}
		System.out.println(sum);
	}
	
	
}