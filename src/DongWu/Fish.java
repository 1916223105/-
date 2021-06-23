package DongWu;

public class Fish extends Animal{
	
	public Fish(){
		this.weight = 5;
		this.age = 2;
	}
	
	public void prinInfo(){
		System.out.println("我是一只"+ this.weight +"的鱼");
		System.out.println("我今年"+ this.age +"岁了");
	}
	

}
