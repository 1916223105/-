import java.util.Scanner;

public class Test {
	
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args){
		
		int ABC ;
		
		System.out.println("请输入会员卡号：");
		
		ABC = SCANNER.nextInt();
		
		if (ABC >= 10000){
			System.out.println("会员卡必须是4位");
		}else{
		
		System.out.println("会员卡号是：" + ABC);
		}
	}

}
