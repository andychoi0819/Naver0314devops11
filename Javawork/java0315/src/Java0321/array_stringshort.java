package Java0321;

public class array_stringshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arr= {"하석진", "강호동","강호마","Candy","소넉구",};
		
		for(int i =0; i<arr.length-1; i++) 
		{
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0)
				{
					String stemp=arr[i];
					arr[i]=arr[j];
					arr[j]=stemp;
					
				}
			}
		}
		System.out.println("순서대로");
		for(String s:arr)
			System.out.println(s);
	}

}
