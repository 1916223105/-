import java.util.Scanner;

public class Test {
	
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args){
		
		int ABC ;
		
		System.out.println("�������Ա���ţ�");
		
		ABC = SCANNER.nextInt();
		
		if (ABC >= 10000){
			System.out.println("��Ա��������4λ");
		}else{
		
		System.out.println("��Ա�����ǣ�" + ABC);
		}
	}

}
