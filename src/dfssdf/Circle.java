package dfssdf;

class Circle {
	
	private double radius;
	public static String name = "这是一个圆";
//	public static String getName(){
//		return name;
//	}
	public Circle(double radius){
		this.radius = radius;
		name = "这是一个 半径是："+radius+"的圆";
	}
	public double findArea(){
		return Math.PI * radius * radius;
	}
	public void display(){
		System.out.println("name:"+name+"radius:"+radius);
	}

}
