
public class Hongshui {
	
	public static void main(String[] args){
		
		//时间
		int shijian = 89;
		
		//一天24小时
		int yitian = 24;
		
		int day = shijian / yitian;
		
		int hours = shijian % yitian;
		
		System.out.println("总共作战了" + day + "天,"+hours +"个小时。");
	}

}
