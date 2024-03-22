package java0322;

public class Ex5_Callby {
	
	public static void changeNum(int n) {
		n=10;
	}
	
	public static void changeArray(int []a) {
		a[1]=200;
	}
	
	public static void changeHome(String home) 
	{
		home="제주도";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		changeNum(n);//기본형은 call by value
		System.out.println(n);
		
		int[]arr= {3,5,7};
		changeArray(arr);//주소가 전달, Call by Reference
			for(int a:arr) {
				System.out.printf("%d,",a);}
			System.out.println();
			String home="서울";
			changeHome(home);
			System.out.println(home);
	}


}
