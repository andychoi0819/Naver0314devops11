package java0320;
import java.util.Scanner;
public class Ex12_ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("인원수 입력하시오");
		int inwon=sc.nextInt();
		
		String[] name = new String[inwon];
		int [] kor=new int[inwon];
		int [] eng=new int[inwon];
		int [] tot=new int[inwon];
		int [] rank=new int[inwon];
		sc.nextLine();
		
		
		for(int i=0; i< inwon; i++) 
		{
			System.out.println(i+1+"."+"이름을 입력하시오");
			name[i]=sc.nextLine();
			
		}
		for(int i=0; i< inwon; i++) 
		{
			System.out.println(i+1+"."+"국어점수를 입력하시오");
			kor[i]=sc.nextInt();
		}
		for(int i=0; i< inwon; i++) 
		{
			System.out.println(i+1+"."+"영어점수를 입력하시오");
			eng[i]=sc.nextInt();
			tot[i]=kor[i]+eng[i];
		}
		
		for(int i=0; i<tot.length; i++) {
			rank[i]=1;
			for(int j=0; j<tot.length; j++) {
				if(tot[i]<tot[j]) {
					rank[i]++;
				}				
			}
		}
		
		//출력
		System.out.println("=".repeat(45));
		System.out.printf("번호\t이름\t국어\t영어\t총점\t등수\n");
		System.out.println("=".repeat(45));
			for(int i=0; i<rank.length; i++) {
				System.out.printf("%d\t%S\t%d\t%d\t%d\t%d\n",i+1,name[i],kor[i],eng[i],tot[i],rank[i]);
			}
		
		
	}
}


