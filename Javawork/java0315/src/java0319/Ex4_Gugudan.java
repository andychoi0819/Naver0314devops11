package java0319;

public class Ex4_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%30s\n\n", "[구구단]");
		for(int dan=2; dan<=9; dan++)
		{
			System.out.printf("**%d단**\t", dan);
		}
		System.out.println();
		for(int i=1; i<10; i++) {
			for(int x=2; x<=9; x++)
			{
				System.out.printf("%dx%d=%2d\t", x,i,x*i);	
			}
		System.out.println();
		}
	}

}

