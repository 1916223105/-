
public class Zoo {
	
	public static void main(String[] args){
		
		//创建一个新的动物
		Animals changjinglu = new Animals();
		changjinglu.legs = 4;
		
		changjinglu.move();
		
		changjinglu.eat();
		
		//创建第二个动物
		Animals ki = new Animals();
		ki.legs = 2;
		ki.move();
		ki.eat();
	}

}
