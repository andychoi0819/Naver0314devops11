package java0320;
import java.util.Scanner;
public class Ex1_MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Math.Random()을 만들기");
		System.out.println("1.random() 시 값");
		for(int i =1; i<=5; i++)
		{
			double d = Math.random();
			System.out.println(d);
		}
		
		System.out.println("2.0~9 발생");
		for(int i =1; i<=5; i++)
		{
			int n= (int)(Math.random()*10);
			System.out.printf("%4d",n);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		System.out.println("3.1~10 발생");
		for(int i =1; i<=5; i++)
		{
			int n= (int)(Math.random()*10)+1;
			System.out.printf("%4d",n);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		System.out.println("2.0~9 발생");
		for(int i =1; i<=5; i++)
		{
			int n= (int)(Math.random()*45)+1;
			System.out.printf("%4d",n);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		for(int i =1; i<=5; i++)
		{
			int n= (int)(Math.random()*26)+65;
			System.out.printf("%4c",(char)n);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		for(int i =1; i<=5; i++)
		{
			int n= (int)(Math.random()*26)+97;
			System.out.printf("%4c",(char)n);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		
	}
	

}
