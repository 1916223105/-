
public class Zoo {
	
	public static void main(String[] args){
		
		//����һ���µĶ���
		Animals changjinglu = new Animals();
		changjinglu.legs = 4;
		
		changjinglu.move();
		
		changjinglu.eat();
		
		//�����ڶ�������
		Animals ki = new Animals();
		ki.legs = 2;
		ki.move();
		ki.eat();
	}

}
