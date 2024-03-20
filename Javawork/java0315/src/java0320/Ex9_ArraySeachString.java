package java0320;
import java.util.Scanner;
public class Ex9_ArraySeachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {"apple","banana","coconut","dingo",
				"eggplant","food","grain","hamburger"};
		int index=-1;
		Scanner sc= new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter a name or press q to close program");
			String name=sc.nextLine();
			
			if(name.equalsIgnoreCase("q")) {
				System.out.println("Closing Program");
				break;
			}
			
			for(int i=0; i<members.length; i++) {
				if(name.equalsIgnoreCase(members[i])) 
				{
					index=i+1;
				}	
			}
			
			if(index==-1) 
			{
				System.out.println("The person is not in the system");
			}
			else 
				System.out.println("The person is at #"+ index +" of the System" );
			System.out.println();
		}
	}

}
