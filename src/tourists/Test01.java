package tourists;
import java.util.Scanner;

public class Test01 {
	
	private static Scanner scanner;

	public static void main(String[] args){
		
		scanner = new Scanner (System.in);
		
		System.out.println("����������");
		String inputName = scanner.next();
		System.out.println("����������");
		int inputAge = scanner.nextInt();
		
		Tourists tourist = new Tourists();
		tourist.name = inputName;
		tourist.aetAge(inputAge);
		
		tourist.ticketPrice();
	}

}
