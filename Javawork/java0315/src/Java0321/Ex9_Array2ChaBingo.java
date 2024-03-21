package Java0321;

import java.util.Scanner;

public class Ex9_Array2ChaBingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		int bingo; 
		Scanner sc= new Scanner(System.in);
		while(true) 
		{
			bingo=0;
			
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr[i].length;j++) 
				{
					arr[i][j]=(int)(Math.random()*3)+1;
				
				}
			}
			
			
			
			System.out.println("=".repeat(15));
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr[i].length;j++) 
				{
					System.out.printf("%4d",arr[i][j]);
				}
				System.out.println("\n");
			}

			
			for(int i=0; i<3; i++) 
			{
				if(arr[i][0]==arr[i][1]&&arr[i][2]==arr[i][1])
					bingo++;
			}

			for(int i=0; i<3; i++) 
			{
				if(arr[0][i]==arr[1][i]&&arr[2][i]==arr[1][i])
					bingo++;
			}
			
			
			
			if(arr[0][0]==arr[2][2]&&arr[1][1]==arr[2][2])
			{
				bingo++;
			}
			
			if(arr[0][2]==arr[1][1]&&arr[2][0]==arr[1][1])
			{
				bingo++;
			}
			
			
		
			
			
			System.out.println("=".repeat(15));
			if(bingo==0)
				System.out.println("꽝");
			else
				System.out.println(bingo);
			
			String ans=sc.nextLine();
			
			if(ans.equalsIgnoreCase("x"))
			{
				System.out.println("***Starting Bingo*****");
				break;
			}
			
			
		}
			
	}
}

