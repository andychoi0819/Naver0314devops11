package java0318;

public class Ex9_for {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();

		for(int a=10;a>=1;a--) {
			System.out.printf("%4d",a);
		}
		System.out.println();
		for(int i=1;i<=31000;i+=10000) {
			System.out.printf("%10d",i);
		}
		System.out.println();

		for(int i='a';i<'z';i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();

		for(int i=1; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}

			for(int i=1; i<10; i++) {
				
				if(i%2==0) {
					continue;
				}
				System.out.println(i);
			}
			
		}
	}

