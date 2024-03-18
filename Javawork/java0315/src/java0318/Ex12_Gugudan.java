package java0318;
import java.util.Scanner;
public class Ex12_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gu;
		System.out.println("구구단?");
		gu=sc.nextInt();
		
		if(gu>10||gu<1) {
			System.out.println("잘못된 숫자입니다.");
			return;
		}
		
		else {
			System.out.println("** "+gu+"단"+" **");
			for(int i=1; i<10; i++) {
				
				System.out.printf("%d x %d = %d\n",gu,i,gu*i);
			}
		}
	}

}
