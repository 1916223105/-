import java.util.Scanner;

/**
 *��һ��ɼ���60,99,85,82,63������
 *
 *ð������
 **/
public class Test11 {
	
	private static Scanner scanner;

	public static void main (String[] args){
		
		System.out.println("������Ҫ�����ѧ���ɼ�");
		
		scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		int[] scores = {60,99,85,82,63};
		
		int[] newScores = new int[scores.length+1];
		
		for(int i=0;i<scores.length;i++){
			newScores[i] = scores[i];
		}
		newScores[scores.length] = score;
		
		for(int i=0;i<newScores.length;i++){
			
			for(int j=0;j<newScores.length-i;j++){
				
				if(j+1==newScores.length)break;
				
				if(newScores[j]>newScores[j+1]){
					int tmp =newScores[j+1];
					newScores[j+1] = newScores[j];
					newScores[j] = tmp;
					
				}
				
			}
		}
			for(int i=0;i<newScores.length;i++ ){
				System.out.println(newScores[i]);
				
			}
		}
	}
	