package OrderSystem;

import java.util.Scanner;

public class EatAlliance {
	
	public static void main (String[] args){
		
		boolean isExit = false;//标志用户是否退出系统：true：退出
		
		//数据主体：订单信息
		String[] names = new String[4];//名称
		String[] dishMsgs = new String[4];//所选菜品
		int[] times =new int[4];//送餐日期
		String[] addresses = new String[4];//送餐地址
		int[] states = new int [4];//订单状态0：已预订     1：已完成
		double[] sumPrices = new double[4];//总金额
		
		//初始化3个订单
		names[0]="ki";
		dishMsgs[0]="澳洲大龙虾1份";
		times[0]=13;
		addresses[0]="321654";
		sumPrices[0]=788.8;
		states[0]=1;
//		
//		names[1]="ki";
//		dishMsgs[1]="澳洲大龙虾1份";
//		times[1]=13;
//		addresses[1]="321654";
//		sumPrices[1]=788.8;
//		states[1]=1;
//		
//		names[2]="ki";
//		dishMsgs[2]="澳洲大龙虾1份";
//		times[2]=13;
//		addresses[2]="321654";
//		sumPrices[2]=788.8;
//		states[2]=1;
//		
//		names[3]="ki";
//		dishMsgs[3]="澳洲大龙虾1份";
//		times[3]=13;
//		addresses[3]="321654";
//		sumPrices[3]=788.8;
//		states[3]=1;
				
		
		//供选择的菜品信息
		String[] dishNamess = {"澳洲大龙虾","惠灵顿牛排","佛跳墙","叫花鸡","面线糊"};
		double[] prices = new double[]{788.8,188.8,488.8,288.8,18.8};
		
		int[]praiseNums = new int[5];
		
		System.out.println("欢迎使用“吃货联盟订餐系统”");
		
		do{
			System.out.println(
					
					"*************************\n"
					+"1.我要订餐\n"
					+"2.查看餐袋\n"
					+"3.签收订单\n"
					+"4.删除订单\n"
					+"5.我要点赞\n"
					+"6.退出系统\n"
					+"*************************"
					);
			System.out.println("请选择：");
			
			Scanner scanner = new Scanner(System.in);
			
			if(!scanner.hasNextInt()){
				System.out.println("输入错误！请输入数字1~6！");
				return;
			}
			
			int choose =scanner.nextInt();
			
			switch(choose){
			case 1:
				System.out.println("我要订餐\n");
				
				for(int i = 0;i<names.length; i++){
					
					//找到第一个空位添加订单信息
					if(names[i]==null){ 
						
						System.out.println("请输入订餐人姓名：");
						
						String name =scanner.next();
						
						//显示菜品信息
						System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
						
						for(int j=0;j<dishNamess.length;j++){
							String price = prices[j] + "元";
							
							String praiseNum = (praiseNums[j])>0?(praiseNums[j]+"赞"):"";
							
							System.out.println(
							(j+1)+"\t"
							+dishNamess[j]+"\t"
							+price+"\t"
							+praiseNum);
						}
						
						//点菜
						System.out.println("请选择您要点的菜品编号：");
						int chooseDish = scanner.nextInt();
						while(chooseDish >6){
							System.out.println("您的输入有误，请输入1~5单个数！！！");
							chooseDish = scanner.nextInt();
						}
						
						System.out.println("请选择您需要的份数：");
						int number = scanner.nextInt();
						
						String dishMeg = dishNamess[chooseDish - 1]+" "+number+"份";
						
						double sumPrice = prices[chooseDish - 1]*number;
						
						//餐费500，送100
						double deliCharge = (sumPrice>=500)?0:100;
						
						System.out.println("请输入送餐时间（送餐时间是10:00至20:00）：");
						int time = scanner.nextInt();
						while(time<10 || time >20){
							System.out.println("您的输入有误，请输入10~20之间的整数！！！");
							time = scanner.nextInt();
						}
						
						System.out.println("请输入送餐地址：");
						String address = scanner.next();
						
						System.out.println("订餐成功！");
						System.out.println("您订的是："+dishMeg);
						System.out.println("送餐时间："+time+"点");
						System.out.println("送餐地址："+address);
						System.out.println(
						"餐费："+sumPrice+"元，送餐费"
						+deliCharge+"元，总计："
						+(sumPrice+deliCharge)+"元。");
						
						//添加数据
						
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
				//查看餐袋
				System.out.println("查看餐袋！");
				
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t\t送餐地址\t\t总金额\t订餐状态");
				
				for(int i=0 ;i<names.length;i++){
					
					if(names[i]!=null){
						String state = (states[i]==0)?"已预订":"已完成";
						String date = times[i]+"点";
						String sumPrice = sumPrices[i]+"元";
						
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
				//签收订单
				System.out.println("签收订单！");
				System.out.println("请选择要签收的订单序号：");
				int sigOrderId = scanner.nextInt();
				
				boolean signFind = false;
				
				for(int i=0;i<names.length;i++){
					//已预订可签收
					//已完成不可以
					
					if(names [i] != null && states[i]==0 && sigOrderId==i+1){
						states[i] = 1;//将状态置为已完成
						System.out.println("订单签收成功！！！");
						signFind = true;
						
					}else if(names [i] != null && states[i]==1 && sigOrderId==i+1){
						System.out.println("您选择的订单已签收，不能再次签收！！！");
						signFind = true;
						
					}
					
				}
				
				//未找到订单，不可签收
				if(!signFind){
					System.out.println("您选择的订单不存在！！！");
					
				}
				
				break;
			case 4:
				//删除订单
				System.out.println("删除订单！");
				System.out.println("请选择要删除的订单序号：");
				int delId = scanner.nextInt();
				
				boolean flag = false;//判断是否有满足删除条件订单
				
				for(int i=0;i<names.length;i++){
					//已完成可删
					//已预订不可删
					if(names[i] != null && states[i]==1 && delId==i+1){
						//删除,删除后元素向前移动
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
						
						//最后一位清空
						names[names.length-1] = null;
						dishMsgs[names.length-1] = null;
						times[names.length-1] = 0;
						addresses[names.length-1] = null;
						states[names.length-1] = 0;
						
						System.out.println("订单删除成功！！！");
						break;
						
					}else if(names [i] != null && states[i]==0 && delId==i+1){
						//已预订
						System.out.println("该订单未签收，无法删除！！！");
						flag = true;
						break;
					}
					
				}
				if(!flag){
					System.out.println("您要删除的订单不存在！！！！！");
				}
			
				break;
			case 5:
				//我要点赞
				System.out.println("我要点赞！");
				
				//显示菜品
				System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
				
				for(int j =0;j<dishNamess.length;j++){
					String price = prices[j] + "元";
					
					String praiseNum = (praiseNums[j])>0?(praiseNums[j]+"赞"):"";
					
					System.out.println(
					(j+1)+"\t"
					+dishNamess[j]+"\t"
					+price+"\t"
					+praiseNum);
				}
				System.out.println("请选择您要点赞的菜品编号：");
				int praiseNum = scanner.nextInt();
				praiseNums[praiseNum - 1]++;//赞数加1
				System.out.println("点赞成功");
				
				break;
			case 6:
				//退出系统
				System.out.println("退出系统！");
				isExit = true;
				break;
			default:
				System.out.println("输入错误！请输入数字1~6！");
				break;
			
			}
		}while(!isExit);
		
		System.out.println("谢谢使用，欢迎下次光临！");
		                       
		
	}

}
