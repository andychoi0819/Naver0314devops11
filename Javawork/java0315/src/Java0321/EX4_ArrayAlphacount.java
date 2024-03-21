package Java0321;
import java.util.Scanner;
public class EX4_ArrayAlphacount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("영어문장 입력하시오");
		String a= sc.nextLine();
		int [] alpha=new int[26];
		a=a.toUpperCase();
		for(int i=0; i<a.length(); i++) 
		{
			if(a.charAt(i)=='A')
				alpha[0]++;
			if(a.charAt(i)=='B')
				alpha[1]++;
			if(a.charAt(i)=='C')
				alpha[2]++;			
			if(a.charAt(i)=='D')
				alpha[3]++;
			if(a.charAt(i)=='E')
				alpha[4]++;
			if(a.charAt(i)=='F')
				alpha[5]++;
			if(a.charAt(i)=='G')
				alpha[6]++;
			if(a.charAt(i)=='H')
				alpha[7]++;
			if(a.charAt(i)=='I')
				alpha[8]++;
			if(a.charAt(i)=='J')
				alpha[9]++;
			if(a.charAt(i)=='K')
				alpha[10]++;
			if(a.charAt(i)=='L')
				alpha[11]++;
			if(a.charAt(i)=='M')
				alpha[12]++;
			if(a.charAt(i)=='N')
				alpha[13]++;
			if(a.charAt(i)=='O')
				alpha[14]++;
			if(a.charAt(i)=='P')
				alpha[15]++;
			if(a.charAt(i)=='Q')
				alpha[16]++;
			if(a.charAt(i)=='R')
				alpha[17]++;
			if(a.charAt(i)=='S')
				alpha[18]++;
			if(a.charAt(i)=='T')
				alpha[19]++;
			if(a.charAt(i)=='U')
				alpha[20]++;
			if(a.charAt(i)=='V')
				alpha[21]++;
			if(a.charAt(i)=='W')
				alpha[22]++;
			if(a.charAt(i)=='X')
				alpha[23]++;
			if(a.charAt(i)=='Y')
				alpha[24]++;
			if(a.charAt(i)=='Z')
				alpha[25]++;
		}
		for(int i=0; i<alpha.length; i++)
		    if(alpha[i]>0)
		    	System.out.printf("%c의 수는 %d 입니다\n",i+65,alpha[i]);
		
		
		int [] cha=new int[26];
		for(int i=0; i<a.length(); i++)
		{
			char ch=a.toUpperCase().charAt(i);
			if(ch>'A'&&ch<'Z') {
				cha[ch-'A']++;
			}
		}
		
		for(int i=0; i<cha.length; i++)
		    if(cha[i]>0)
		    	System.out.printf("%c의 수는 %d 입니다\n",i+65,cha[i]);
		
	}

}
