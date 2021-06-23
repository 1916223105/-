package DongWu;

public class Bird extends Animal{
	
	public Bird(){
		this.color = "红";
		this.age = 4;
	}
	
	public void prinInfo(){
		System.out.println("我是一只"+ this.color +"的鸟");
		System.out.println("我今年"+ this.age +"岁了");
	}
	
	

}
