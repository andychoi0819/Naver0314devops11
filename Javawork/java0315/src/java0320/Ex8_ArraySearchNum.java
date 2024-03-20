package java0320;

import java.util.Scanner;

public class Ex8_ArraySearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*숫자 입력하여 배열에 몇번쨰에 있는지 출력
		 * 없을경우 없다고 출력
		 */
		
		Scanner sc=new Scanner(System.in);
		int []data= {12,3,61,23,4,5,1,42};
		int searchIndex=-1;
		while(true)
		{
	      searchIndex=-1;
		  System.out.println("검색할 숫자를 입력하세요");
		  System.out.println("검색을 종료할려면 0을 눌러주세요"); 
		  int num=sc.nextInt();
		  if(num==0) 
		  {
			  break;
		  }
		  for(int i=0; i<data.length; i++) {
			if(num==data[i])
			{
				searchIndex=i;
				break;
			}
		  }
		  if (searchIndex==-1)
			  System.out.println("\t"+num+"은 데이터에 없습니다.");
		  else
			  System.out.println("\t"+num+"은 "+(searchIndex+1)+ " 번째에 있습니다.");
		  System.out.println();
		  
		}
	}

}
