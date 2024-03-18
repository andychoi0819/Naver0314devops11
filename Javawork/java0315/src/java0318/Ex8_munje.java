package java0318;
import java.util.Scanner;
public class Ex8_munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sang;
		int su;
		int dan;
		double total;
		double dctotal;
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("상품명?: ");
		sang=sc.nextLine();
		System.out.printf("수량?: ");
		su=sc.nextInt();
		System.out.printf("단가?: ");
		dan=sc.nextInt();
		total=dan*su;
		dctotal=total*0.9;
		System.out.println("");
		
		if(su>=5) {
			
			System.out.println("****출력****");
			System.out.println(sang+" "+su+"개의 총금액: "+total);
			System.out.println("10프로 할인입니다");
			System.out.printf("할인된 금액: %.2f " , dctotal);
		}
		else {
			System.out.println("****출력****");
			System.out.println(sang+" "+su+"개의 총금액"+total);
		
			
		}
		
		
		
		
	}

}
