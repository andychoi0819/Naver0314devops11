package java0320;
import java.util.Random;
import java.util.Scanner;
public class Ex3_RanGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s= new Scanner(System.in);
		
		
		Exit:
		while(true) 
		{	
			int t=0;
			int n;
			System.out.println("1~100 사이 정수를 구하시오");
			n=r.nextInt(100)+1;
			
			while(true) {
				int i= s.nextInt();
				if(i<n) 
				{
					System.out.println("이거보다 큽니다");
					System.out.println("다시 입력하시오");
					t++;
				}
				else if(i>n) 
				{
					System.out.println("이거보다 작습니다");
					System.out.println("다시 입력하시오");
					t++;
				}
				else if(i==n) 
				{
					System.out.println("맞추셨습니다");
					System.out.printf("총 시도: %d\n",t);
					System.out.printf("정답: %d\n",n);
					
					System.out.println("게임을 다시 시작하겠습니까?, Y/N");
					s.nextLine();
					String ans=s.nextLine();
					if(ans.equalsIgnoreCase("y")) {
						System.out.println("새로운 게임을 시작합니다");
						break;
					}
					else {
						break Exit;
					}
				}
			}
			System.out.println("New Game");	
			}
		}
	}


