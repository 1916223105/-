/***
 * һ��ѧ���ɼ��ǣ�98,54,67,32��
 * ���࣬87,92,8��
 * ���࣬76,60,79,88
 * ����ÿ�����ܳɼ��������
 *
 */
public class Test09 {
	public static void main (String[] args){
		//�����ά���顢����ռ䡢��ֵ
		int[][] a1 = new int[][]{{98,54,67,32},{87,92,8},{76,60,79,88}};
		//�����ܳɼ�
		int b2 = 0;		
		for(int i = 0;i<a1.length;i++){
			String c3 = (i+1) + "��";
			//ÿ��ѭ����0
			for(int j=0;j<a1[i].length;j++){
				//�ɼ��ۼ�
				b2 +=a1[i][j];
			}
			System.out.println(c3+"�ܳɼ�:"+b2);	
			b2=0;
		}			
	}
}
