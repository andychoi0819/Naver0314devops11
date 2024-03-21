package Java0321;

import java.util.Scanner;

public class Ex6_Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		int a[]=new int [7];
		int money;
		int x;
		int count;

		while(true) 
		{
			System.out.println("\n입력할 금액은?");
			money=sc.nextInt();
			if(money==-1) {
				System.out.println("종료중");
				break;}
			else if(money>=1000) 
			{
				count=money/1000;
				//숫자 출력
				for(int c=1; c<=count; c++) 
				{	
					for(int i=0; i<a.length; i++)
					{
						a[i]=(int)((Math.random()*45)+1);
						//중복수 배제
						for(int j=0; j<i; j++) 
						{
							if(a[i]==a[j])
								i--;
						}
					}

					//정리
					for(int i=0; i<a.length; i++) 
					{
						for(int j=0; j<i; j++) 
						{
							if(a[j]>a[i]) {
								x=a[j];
								a[j]=a[i];
								a[i]=x;
							}
						}
					}
					//출력
					System.out.println("\n생성된 번호는");
					System.out.printf("%d차 ",c);
					for(int b=0; b<a.length; b++) 
					{
						System.out.printf("%2d, ", a[b]);

					}
				}
			}
			else 
			{
				System.out.println("부족한 금액입니다");
				continue;
			}
		}
	}
}

