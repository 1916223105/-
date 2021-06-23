package calotator;

public class Calculate {
	
//	public int add(int a,int b) {
//		return a + b;
//	}
//	public float add(float a,float b,float c){
//		return a + b + c;
//	}
	
	public int jiechen (int n){
		
		if (n==0)return 0;
		
		int result = 1;
		
		for(int i=n;i>0;i--){
			result*=i;
		}
		return result;
	}
	
}
