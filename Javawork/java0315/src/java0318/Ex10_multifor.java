package java0318;

public class Ex10_multifor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=5; i++) {
			System.out.println("Hello ");
			for(int j=0; j<3;j++) {
				System.out.printf("World ");
			}
			System.out.println("");
		}

		System.out.println("-------------------------------");

		for(int i=1; i<=5; i++) {
			for(int j=1; j<5;j++) {
				System.out.printf("%d,%d: ",i,j);
				
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------------");

		
		for(int i=1; i<=5; i++) {
			Exit:
			for(int j=1; j<5;j++) {
				System.out.printf("i=%d,j=%d. ",i,j);
				if(j==2) {
					break Exit;
				}
				
			}
			System.out.println("");

		}
	}
}
