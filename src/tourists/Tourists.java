package tourists;

public class Tourists {
	
	//����
	public String name;
	
	//����
	private int age;
	
	public void aetAge(int age){
		this.age=age;
		
	}
	
	//�������������ӦƱ�ۣ�12��������ѣ�65���������
	public void ticketPrice(){
	
		if(age > 12 && age < 65){
			System.out.println(this.name + "������Ϊ" + age +"Ԫ");
		}else{
			System.out.println(this.name + "������Ϊ" + age +"��Ʊ���");
		}
	}
	
	
	
}
