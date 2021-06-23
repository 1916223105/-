package usb;

public class Computer {
	
	public static void main(String[] args){
		
		//U盘
		USBInterface upan = new UPan();
		upan.service();
		
		//USB风扇
		USBInterface usbFan = new USBFan();
		usbFan.service();
		
	}

}
