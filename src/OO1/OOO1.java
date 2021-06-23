package OO1;

public class OOO1 {
	
	public int number;
	
	public int state;
	
	public int score;
	
	
	public OOO1(){
		System.out.println("");
		
		
	}
	public OOO1(int number){
		this.number = number;
		
		//Äê¼¶
		long ranState = Math.round(Math.random()*10)%3+1;
		this.state=(int)ranState;
		
		
		//³É¼¨
		long ranScore = Math.round(Math.random()*100);
		this.score=(int)ranScore;
		
		
		
	}
	
	
}
	 


