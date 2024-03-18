package java0318;
import java.util.Scanner;
public class Ex4_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String color;
		System.out.println("Enter Color");
		color=sc.nextLine();
		
		switch(color)
		{
		case "Red":
		case "red":
			System.out.println("빨강색");
			break;
		case "Green":	
		case "green":
			System.out.println("초록색");
			break;
		case "Pink":	
		case "pink":
			System.out.println("분홍색");
			break;
			
		default:
			System.out.println("빨강,초록,분홍 이외의 색!");
			break;
		}
	}

}
