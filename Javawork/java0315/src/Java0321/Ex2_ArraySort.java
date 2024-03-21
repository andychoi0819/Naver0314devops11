package Java0321;

public class Ex2_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int count=0;
		int[] a=new int[5];
		
		
		for(int i=0; i<a.length; i++) 
		{
			n=(int)(Math.random()*30+1);
			a[i]=n;
			for(int j=0; j<i; j++) 
			{
				if(a[i]==a[j]) {
					i--;
				}
			}
		}
		
		
		System.out.println("1~30 사이 중복되지않은 난수 구하기");
		for(int i=0; i<a.length; i++) 
		{
			System.out.printf("%4d",a[i]);
		}
		
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[j]<a[i]) {
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		System.out.printf("\n");
		for(int i=0; i<a.length; i++) 
		{
			System.out.printf("%4d",a[i]);
		}
		
	}

}
