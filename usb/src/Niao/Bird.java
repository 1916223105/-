package Niao;

public abstract class Bird {
	//鸟叫的方式
	ShoutAbility shout_ability;
	
	//鸟类的构造方法，初始化鸟叫的行为
	public Bird(ShoutAbility shout_ability){
		this.shout_ability = shout_ability;
	}
	


	//叫
	public void shout(){
		shout_ability.shout();
	}
	
	//飞行
	public void fly(){
		System.out.println("弹射飞");
	}
	
	public abstract void attack();
	
	
}
