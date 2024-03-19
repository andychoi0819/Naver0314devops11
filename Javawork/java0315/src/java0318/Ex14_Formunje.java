package java0318;
import java.util.Scanner;
public class Ex14_Formunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   5개의 점수(score)를 입력하면 갯수(count)와 합계(sum) 출력하기
		 *   (단, 1~100 아 아닐경우는 갯수에서 제외하고 합계에서도 제외하기-continue 사용)
		 *   
		 *   (예)
		 *   
		 *   점수는? 80
		 *   점수는? 120
		 *   점수는? 70
		 *   점수는? 60
		 *   점수는? 100

		 *   입력한 점수 갯수 : 4
		 *   총 합계 : 310		 *   
		 */

		Scanner sc= new Scanner(System.in);

		int n1,n2,n3,n4,n5;
		int count=0;
		int sum=0;

		for(int i=1; i<=5; i++) {
			System.out.printf("점수는? ");
			n1=sc.nextInt();

			if(n1>100||n1<1) {
				continue;
			}
			sum+=n1;
			count++;


		}
		System.out.println("입력한 점수 갯수: "+count);
		System.out.println("총 합계 : "+sum);
		
	}

}
