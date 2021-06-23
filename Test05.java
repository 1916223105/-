import java.util.Scanner;

public class Test05 {
	
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main (String[] args){
		
		int a ;
		
		System.out.println("请输入一个整数：");
		
		a = SCANNER.nextInt();
		
		
		System.out.println(a + "以内的质数是：");
		System.out.println(1);
		System.out.println(2);
		
		for(int i=2; i < a ; i++){
			
			for(int j = 2; j <= i ; j++){
				
				if(i % j == 0) {
					
					break;
					
				}
				
				if(j == (i-1)){
					System.out.println(i);
				}
			}
			
		}
	}

}
