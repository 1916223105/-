import java.util.Scanner;

public class Test01 {
	
	private static Scanner input;

	public static void main(String[] args){
		
		int month = 0 ;
		
		System.out.println("�������·ݣ�");
		
		input = new Scanner(System.in);
		
		month = input.nextInt();
		
		String season ="";
		
		int[][] months = {{3,4,5},{6,7,8},{9,10,11},{12,1,2}};
				
		for(int i=0; i<months.length;i++){
			
			for(int j = 0; j<3 ; j++){
				
				if(month ==months [i][j]){
					
					switch(i){
					
					case 0:
						season = "����";
						break;
					
					case 1:
						season = "�ļ�";
						break;
						
					case 2:
						season = "�＾";
						break;
						
					case 3:
						season = "����";
						break;
						
						
					}
					
					System.out.println(month + "��Ӧ�ļ����ǣ�" + season);
					
					break;
				}
					
				}
			}
		}

	
	}