package DongWu;

public class Fish extends Animal{
	
	public Fish(){
		this.weight = 5;
		this.age = 2;
	}
	
	public void prinInfo(){
		System.out.println("����һֻ"+ this.weight +"����");
		System.out.println("�ҽ���"+ this.age +"����");
	}
	

}
