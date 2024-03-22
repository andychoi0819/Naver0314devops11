package java0322;

import java.util.Scanner;

public class Ex7_Munje {

	//입력하는 메서드
	static public void inputSawonArray(Sawon[]sa)
	{
		
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<sa.length; i++) {
			System.out.println("사원명은?");	
			String name=sc.nextLine();	
			System.out.println("기본급은?");	
			int gibon=sc.nextInt();	
			System.out.println("수당은?");	
			int sudang =sc.nextInt();	
			sc.nextLine();
			sa[i]= new Sawon();
			sa[i].setSawon(name, sudang, gibon);
			System.out.println();
		}
		
		
	}
	
	//출려하는 메서드
	static public void outputSawonArray(Sawon[]sa){
		System.out.println("=".repeat(40));
		System.out.printf("순서\t|이름\t|기본급\t|수당\t|실수령액\t\n");
		for(int i=0; i<sa.length; i++) {
		System.out.printf("%d\t|%S\t|%d\t|%d\t|%d\t", i+1,
				sa[i].getName(),sa[i].getGibon(),sa[i].getSudang(),sa[i].getNetPay());
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon [] sawon=null;
		int inwon;
		String name;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("직원 인원수는?");
		inwon=sc.nextInt();
		//인원수만큼 메모리 할당
		sawon=new Sawon[inwon];//인원수만큼 객체 할당, 초기값 널
		
		inputSawonArray(sawon);
		outputSawonArray(sawon);
		
	}

}
