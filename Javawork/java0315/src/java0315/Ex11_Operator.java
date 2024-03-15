package java0315;

import java.util.Scanner;

public class Ex11_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건(삼항) 연산자
		//조건식?참: 거짓
		//두수를 입력후 더 큰숫자를 출력하시오
		Scanner sc= new Scanner(System.in);
//		int su1,su2,max,min;
//		System.out.println("두개의 숫자 입력");
//		su1=sc.nextInt();
//		su2=sc.nextInt();
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("max="+max);
//		
//		Scanner sc= new Scanner(System.in);//		System.out.println("min="+min);
		
		//세개의수를 입력후 더 큰숫자를 출력하시오
		int num1, num2, num3, max;
		System.out.println("3개의 숫자 입력");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
	
		max=num1>num2&&num1>num3?num1:
			num2>num1&&num2>num3?num2:num3;
			
		System.out.println("max="+max);
	
	}
	

}
