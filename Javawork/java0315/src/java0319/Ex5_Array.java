package java0319;

public class Ex5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1;
		arr1=new int[5];
		arr1[0]='J';
		arr1[1]='J';
		arr1[2]='J';
		arr1[3]='J';
		arr1[4]='A';
		
		System.out.printf("%c\n",(char)arr1[0]);
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(i+":"+(char)arr1[i]);
		}
		
		System.out.println("** 다른 방법으로도 출력해보자 **");
		for(int a:arr1) 
		{
			System.out.println(a);
		}
	}

}
