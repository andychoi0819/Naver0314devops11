package java0320;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex10_ArraySearchStartswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="have";
		
		String []members= {"강호동","한가인","유재석","이승민","강하나","손미나","손예진","한지혜",};
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.printf("검색할 이름은?(종료 원할시 Q 누르세요) ");
			String name=sc.nextLine();
			int count=0;
			
			if(name.equalsIgnoreCase("q")) {
				System.out.println("End Program");
				break;
			}
			
			for(int i=0; i<members.length; i++) 
			{
				if(members[i].startsWith(name)) {
					count=count+1;
					System.out.printf("\t%d번쨰 : %s\n",i+1,members[i]);
					
				}
				
		
					
		
			}
			if(count!=0)
				System.out.printf("\t총 %d 명 검색\n",count);
			    System.out.println("");
			if (count==0){
				System.out.println(name+"로 시작하는 멤버는 없습니다");
				System.out.println("");
			}
		}
	}

}


