package person;

public class Test02 {
	public static void main(String[] args){
		
		Person ki = new Person();
		ki.name = "ki";
		ki.age = 18;
		
		ki.study();
		
		ki.showAge();
		
		int kiNewAge = ki.addAge();
		
		System.out.println(kiNewAge);
		ki.showAge();

	}

}
