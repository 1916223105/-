import java.util.Scanner;

public class Test04 {
	
	private static Scanner scanner;

	public static void main(String[] args){
		
		int ABC ;
		
		System.out.println("请输入会员卡号：");
		
		scanner = new Scanner(System.in);
		ABC = scanner.nextInt();
		
		if (ABC >= 10000){
			System.out.println("会员卡必须是4位");
		}else{
		
		System.out.println("会员卡号是：" + ABC);
		
		int gewei = ABC % 10 ;
		
		int shiwei = ABC / 10 % 10 ;
		
		int baiwei = ABC / 100 % 10 ;
		
		int qianwei = ABC / 1000;
		
		System.out.println("千位是：" + qianwei + ",百位是：" + baiwei + ",十位是：" + shiwei + ",个位是：" + gewei);
		
		int sum = gewei + shiwei + baiwei + qianwei;
		
		System.out.println("会员卡号" + ABC + "各位之和：" + sum);
		
		if ( sum > 20 ){
			System.out.println("会员卡号" + ABC + "的会员，您中奖了！奖品是MP4！");	
		}else{
			System.out.println("会员卡号" + ABC + "的会员，您没有中奖");
			
		}
		
		}
		  
		
	}

}
