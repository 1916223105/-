package Niao;

public class Test {
	
	public static void main(String[] args){
		
		ShoutAbility ao_ahout = new AoShout();
		ShoutAbility zha_shout = new ZhaZhaJiao();
		
		Bird bomb = new Bombird(zha_shout);
		Bird split = new SplitBird(ao_ahout);
		bomb.shout();
		bomb.attack();
		split.shout();
		split.attack();
	}

}
