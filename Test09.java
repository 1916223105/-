/***
 * 一班学生成绩是，98,54,67,32；
 * 二班，87,92,8；
 * 三班，76,60,79,88
 * 计算每个班总成绩，并输出
 *
 */
public class Test09 {
	public static void main (String[] args){
		//定义二维数组、分配空间、赋值
		int[][] a1 = new int[][]{{98,54,67,32},{87,92,8},{76,60,79,88}};
		//保存总成绩
		int b2 = 0;		
		for(int i = 0;i<a1.length;i++){
			String c3 = (i+1) + "班";
			//每次循环归0
			for(int j=0;j<a1[i].length;j++){
				//成绩累加
				b2 +=a1[i][j];
			}
			System.out.println(c3+"总成绩:"+b2);	
			b2=0;
		}			
	}
}
