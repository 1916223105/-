import java.util.Scanner;
/**
 *����ɼ����ҵ���߷֣�����ɼ��ȼ� 
 * @author student
 *
 */
public class Test08 {
	private static Scanner scanner;

	public static void main (String[] args){
		//�洢����
		int count = 0;
		System.out.println("������ѧ��������");
		scanner = new Scanner(System.in);
		count = scanner.nextInt();
		System.out.println("������" + count + "��ѧ���ɼ���");
		//����һ�����飬����ѧ���ɼ�
		int[] scores = new int[count];
		//��ѭ���ṹ�����û�����ɼ�
		int max1 = 0;
		for(int i = 0; i < count; i++){
			scores[i] = scanner.nextInt();
			
			if(scores[i]>max1){
				max1 = scores[i];
		
			}
		}
		System.out.println("��߷��ǣ�" + max1);
		/**
		 * max - 10 = A
		 * max - 20 = B
		 * max - 30 = C
		 * ����D
		 */
		for(int i = 0; i < scores.length; i++){
			if ((max1 - 10) < scores[i]&&scores[i] <= max1){				
				//A
				System.out.println("��" + i +"��ѧ���ɼ��ǣ�"+scores[i]+"�ȼ��ǣ�A");
			}else if ((max1 - 20) < scores[i]&&scores[i] <= max1 - 10){
				//B
				System.out.println("��" +i+"��ѧ���ɼ��ǣ�"+scores[i]+"�ȼ��ǣ�B");
			}else if ((max1 - 30) < scores[i]&&scores[i] <= max1 - 20){
				//C
				System.out.println("��" +i+"��ѧ���ɼ��ǣ�"+scores[i]+"�ȼ��ǣ�C");
			}else{
				//D
				System.out.println("��" +i+"��ѧ���ɼ��ǣ�"+scores[i]+"�ȼ��ǣ�D");
			}
		}	
	}
}
