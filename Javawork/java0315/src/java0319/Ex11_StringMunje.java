package java0319;
import java.util.Scanner;
public class Ex11_StringMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg;
		int up=0,low=0,num=0; 
		int msc=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("입력하시오");
		msg=sc.nextLine();
		
		
		for(int i=0; i<msg.length(); i++) 
		{
			
			if(msg.charAt(i)>='A'&& msg.charAt(i)<='Z')
			{
				up++;
			}
			if(msg.charAt(i)>='a'&& msg.charAt(i)<='z')
			{
				low++;
			}
			if((msg.charAt(i)>='0'&& msg.charAt(i)<='9')) 
			{
				num++;
			}
			else 
			{
				msc++;
			}
			
			
		}
		
		System.out.printf("대문자:%d, 소문자: %d, 숫자: %d, 그외: %d",up, low,num,msc);
			
	}

}
