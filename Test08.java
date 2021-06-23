import java.util.Scanner;
/**
 *输入成绩，找到最高分，输出成绩等级 
 * @author student
 *
 */
public class Test08 {
	private static Scanner scanner;

	public static void main (String[] args){
		//存储人数
		int count = 0;
		System.out.println("请输入学生人数：");
		scanner = new Scanner(System.in);
		count = scanner.nextInt();
		System.out.println("请输入" + count + "个学生成绩：");
		//定义一个数组，储存学生成绩
		int[] scores = new int[count];
		//用循环结构接受用户输入成绩
		int max1 = 0;
		for(int i = 0; i < count; i++){
			scores[i] = scanner.nextInt();
			
			if(scores[i]>max1){
				max1 = scores[i];
		
			}
		}
		System.out.println("最高分是：" + max1);
		/**
		 * max - 10 = A
		 * max - 20 = B
		 * max - 30 = C
		 * 其他D
		 */
		for(int i = 0; i < scores.length; i++){
			if ((max1 - 10) < scores[i]&&scores[i] <= max1){				
				//A
				System.out.println("第" + i +"个学生成绩是："+scores[i]+"等级是：A");
			}else if ((max1 - 20) < scores[i]&&scores[i] <= max1 - 10){
				//B
				System.out.println("第" +i+"个学生成绩是："+scores[i]+"等级是：B");
			}else if ((max1 - 30) < scores[i]&&scores[i] <= max1 - 20){
				//C
				System.out.println("第" +i+"个学生成绩是："+scores[i]+"等级是：C");
			}else{
				//D
				System.out.println("第" +i+"个学生成绩是："+scores[i]+"等级是：D");
			}
		}	
	}
}
