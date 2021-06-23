package OO1;
import java.util.ArrayList;

public class OOO2 {
	
	public static void main(String[] args){
		
		ArrayList<OOO1> stuList=new ArrayList<OOO1>();
		
		for (int i=1;i<=20;i++){
			
			
			OOO1 stu = new OOO1(i);
			stu.number = i;
			stuList.add(stu);
		}
		for (int i=0;i<stuList.size();i++){
			OOO1 stu = stuList.get(i);
			if(stu.state==3){
				System.out.println("学生学号是："+stu.number+",年级是："+stu.state+",学生成绩是："+stu.score);
				
			}
			
			
		}
		
		
		
		
		
	}

}
