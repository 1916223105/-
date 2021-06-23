
public class Car {
	
	public String brand;
	
	public String model;
	
	public String color;
	
	public int price;
	
	//启动汽车
	public void startEngine(Driver driver){
		System.out.println(driver.getName()+"法拉利启动了");
	}
	
	//停止
	public void stopEngine(){
		System.out.println("法拉利停住了");
	}
	//加速
	public void acc(){
		System.out.println("法拉利加速");
	}
}
