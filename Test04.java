import java.util.Scanner;

public class Test04 {
	
	private static Scanner scanner;

	public static void main(String[] args){
		
		int ABC ;
		
		System.out.println("�������Ա���ţ�");
		
		scanner = new Scanner(System.in);
		ABC = scanner.nextInt();
		
		if (ABC >= 10000){
			System.out.println("��Ա��������4λ");
		}else{
		
		System.out.println("��Ա�����ǣ�" + ABC);
		
		int gewei = ABC % 10 ;
		
		int shiwei = ABC / 10 % 10 ;
		
		int baiwei = ABC / 100 % 10 ;
		
		int qianwei = ABC / 1000;
		
		System.out.println("ǧλ�ǣ�" + qianwei + ",��λ�ǣ�" + baiwei + ",ʮλ�ǣ�" + shiwei + ",��λ�ǣ�" + gewei);
		
		int sum = gewei + shiwei + baiwei + qianwei;
		
		System.out.println("��Ա����" + ABC + "��λ֮�ͣ�" + sum);
		
		if ( sum > 20 ){
			System.out.println("��Ա����" + ABC + "�Ļ�Ա�����н��ˣ���Ʒ��MP4��");	
		}else{
			System.out.println("��Ա����" + ABC + "�Ļ�Ա����û���н�");
			
		}
		
		}
		  
		
	}

}
