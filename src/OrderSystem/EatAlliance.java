package OrderSystem;

import java.util.Scanner;

public class EatAlliance {
	
	public static void main (String[] args){
		
		boolean isExit = false;//��־�û��Ƿ��˳�ϵͳ��true���˳�
		
		//�������壺������Ϣ
		String[] names = new String[4];//����
		String[] dishMsgs = new String[4];//��ѡ��Ʒ
		int[] times =new int[4];//�Ͳ�����
		String[] addresses = new String[4];//�Ͳ͵�ַ
		int[] states = new int [4];//����״̬0����Ԥ��     1�������
		double[] sumPrices = new double[4];//�ܽ��
		
		//��ʼ��3������
		names[0]="ki";
		dishMsgs[0]="���޴���Ϻ1��";
		times[0]=13;
		addresses[0]="321654";
		sumPrices[0]=788.8;
		states[0]=1;
//		
//		names[1]="ki";
//		dishMsgs[1]="���޴���Ϻ1��";
//		times[1]=13;
//		addresses[1]="321654";
//		sumPrices[1]=788.8;
//		states[1]=1;
//		
//		names[2]="ki";
//		dishMsgs[2]="���޴���Ϻ1��";
//		times[2]=13;
//		addresses[2]="321654";
//		sumPrices[2]=788.8;
//		states[2]=1;
//		
//		names[3]="ki";
//		dishMsgs[3]="���޴���Ϻ1��";
//		times[3]=13;
//		addresses[3]="321654";
//		sumPrices[3]=788.8;
//		states[3]=1;
				
		
		//��ѡ��Ĳ�Ʒ��Ϣ
		String[] dishNamess = {"���޴���Ϻ","�����ţ��","����ǽ","�л���","���ߺ�"};
		double[] prices = new double[]{788.8,188.8,488.8,288.8,18.8};
		
		int[]praiseNums = new int[5];
		
		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
		
		do{
			System.out.println(
					
					"*************************\n"
					+"1.��Ҫ����\n"
					+"2.�鿴�ʹ�\n"
					+"3.ǩ�ն���\n"
					+"4.ɾ������\n"
					+"5.��Ҫ����\n"
					+"6.�˳�ϵͳ\n"
					+"*************************"
					);
			System.out.println("��ѡ��");
			
			Scanner scanner = new Scanner(System.in);
			
			if(!scanner.hasNextInt()){
				System.out.println("�����������������1~6��");
				return;
			}
			
			int choose =scanner.nextInt();
			
			switch(choose){
			case 1:
				System.out.println("��Ҫ����\n");
				
				for(int i = 0;i<names.length; i++){
					
					//�ҵ���һ����λ��Ӷ�����Ϣ
					if(names[i]==null){ 
						
						System.out.println("�����붩����������");
						
						String name =scanner.next();
						
						//��ʾ��Ʒ��Ϣ
						System.out.println("���"+"\t"+"����"+"\t"+"����");
						
						for(int j=0;j<dishNamess.length;j++){
							String price = prices[j] + "Ԫ";
							
							String praiseNum = (praiseNums[j])>0?(praiseNums[j]+"��"):"";
							
							System.out.println(
							(j+1)+"\t"
							+dishNamess[j]+"\t"
							+price+"\t"
							+praiseNum);
						}
						
						//���
						System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int chooseDish = scanner.nextInt();
						while(chooseDish >6){
							System.out.println("������������������1~5������������");
							chooseDish = scanner.nextInt();
						}
						
						System.out.println("��ѡ������Ҫ�ķ�����");
						int number = scanner.nextInt();
						
						String dishMeg = dishNamess[chooseDish - 1]+" "+number+"��";
						
						double sumPrice = prices[chooseDish - 1]*number;
						
						//�ͷ�500����100
						double deliCharge = (sumPrice>=500)?0:100;
						
						System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10:00��20:00����");
						int time = scanner.nextInt();
						while(time<10 || time >20){
							System.out.println("������������������10~20֮�������������");
							time = scanner.nextInt();
						}
						
						System.out.println("�������Ͳ͵�ַ��");
						String address = scanner.next();
						
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�"+dishMeg);
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						System.out.println("�Ͳ͵�ַ��"+address);
						System.out.println(
						"�ͷѣ�"+sumPrice+"Ԫ���Ͳͷ�"
						+deliCharge+"Ԫ���ܼƣ�"
						+(sumPrice+deliCharge)+"Ԫ��");
						
						//�������
						
						names[i] = name;
						dishMsgs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice+deliCharge;
						
						break;
						
					}
					
				}
				
				break;
			case 2:
				//�鿴�ʹ�
				System.out.println("�鿴�ʹ���");
				
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�����\t\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				
				for(int i=0 ;i<names.length;i++){
					
					if(names[i]!=null){
						String state = (states[i]==0)?"��Ԥ��":"�����";
						String date = times[i]+"��";
						String sumPrice = sumPrices[i]+"Ԫ";
						
						System.out.println(
						(i+1)+"\t"
						+names[i]+"\t"
						+dishMsgs[i]+"\t"
						+date+"\t\t"
						+addresses[i]+"\t\t"
						+sumPrice+"\t"
						+state);
					}
				}
				
				break;
			case 3:
				//ǩ�ն���
				System.out.println("ǩ�ն�����");
				System.out.println("��ѡ��Ҫǩ�յĶ�����ţ�");
				int sigOrderId = scanner.nextInt();
				
				boolean signFind = false;
				
				for(int i=0;i<names.length;i++){
					//��Ԥ����ǩ��
					//����ɲ�����
					
					if(names [i] != null && states[i]==0 && sigOrderId==i+1){
						states[i] = 1;//��״̬��Ϊ�����
						System.out.println("����ǩ�ճɹ�������");
						signFind = true;
						
					}else if(names [i] != null && states[i]==1 && sigOrderId==i+1){
						System.out.println("��ѡ��Ķ�����ǩ�գ������ٴ�ǩ�գ�����");
						signFind = true;
						
					}
					
				}
				
				//δ�ҵ�����������ǩ��
				if(!signFind){
					System.out.println("��ѡ��Ķ��������ڣ�����");
					
				}
				
				break;
			case 4:
				//ɾ������
				System.out.println("ɾ��������");
				System.out.println("��ѡ��Ҫɾ���Ķ�����ţ�");
				int delId = scanner.nextInt();
				
				boolean flag = false;//�ж��Ƿ�������ɾ����������
				
				for(int i=0;i<names.length;i++){
					//����ɿ�ɾ
					//��Ԥ������ɾ
					if(names[i] != null && states[i]==1 && delId==i+1){
						//ɾ��,ɾ����Ԫ����ǰ�ƶ�
						flag=true;
						for(int j=delId-1;j<names.length;j++){
							
							if(j+1 == names.length){
								break;
							}
							
							names[j] = names[j+1];
							dishMsgs[j] = dishMsgs[j+1];
							times[j] = times[j+1];
							addresses[j] = addresses[j+1];
							states[j] =states[j+1];
							
						}
						
						//���һλ���
						names[names.length-1] = null;
						dishMsgs[names.length-1] = null;
						times[names.length-1] = 0;
						addresses[names.length-1] = null;
						states[names.length-1] = 0;
						
						System.out.println("����ɾ���ɹ�������");
						break;
						
					}else if(names [i] != null && states[i]==0 && delId==i+1){
						//��Ԥ��
						System.out.println("�ö���δǩ�գ��޷�ɾ��������");
						flag = true;
						break;
					}
					
				}
				if(!flag){
					System.out.println("��Ҫɾ���Ķ��������ڣ���������");
				}
			
				break;
			case 5:
				//��Ҫ����
				System.out.println("��Ҫ���ޣ�");
				
				//��ʾ��Ʒ
				System.out.println("���"+"\t"+"����"+"\t"+"����");
				
				for(int j =0;j<dishNamess.length;j++){
					String price = prices[j] + "Ԫ";
					
					String praiseNum = (praiseNums[j])>0?(praiseNums[j]+"��"):"";
					
					System.out.println(
					(j+1)+"\t"
					+dishNamess[j]+"\t"
					+price+"\t"
					+praiseNum);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int praiseNum = scanner.nextInt();
				praiseNums[praiseNum - 1]++;//������1
				System.out.println("���޳ɹ�");
				
				break;
			case 6:
				//�˳�ϵͳ
				System.out.println("�˳�ϵͳ��");
				isExit = true;
				break;
			default:
				System.out.println("�����������������1~6��");
				break;
			
			}
		}while(!isExit);
		
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
		                       
		
	}

}
