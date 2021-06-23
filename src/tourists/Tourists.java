package tourists;

public class Tourists {
	
	//名字
	public String name;
	
	//年龄
	private int age;
	
	public void aetAge(int age){
		this.age=age;
		
	}
	
	//根据年龄输出对应票价，12岁以下免费，65岁以上免费
	public void ticketPrice(){
	
		if(age > 12 && age < 65){
			System.out.println(this.name + "的年龄为" + age +"元");
		}else{
			System.out.println(this.name + "的年龄为" + age +"门票免费");
		}
	}
	
	
	
}
