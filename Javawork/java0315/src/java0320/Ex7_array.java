package java0320;

public class Ex7_array {
	public static void main(String[] args) {
		int []data= {23,100,24,5,6,12,4,-1};
		System.out.println(data.length);
		int max=data[0];
		int min=data[0];
		for(int i=0; i<data.length; i++) 
		{
			if(max<=data[i]) 
			{
			max=data[i];	
			}
			else if(min>=data[i])
				min=data[i];
		}
		System.out.println("max num"+max);
		System.out.println("min num"+min);
		
		int pcnt=0,ncnt=0;
		for(int i=0; i<data.length; i++) 
		{
			if(data[i]>0) 
			{
			pcnt++;	
			}
			if(data[i]<0) 
			{
			ncnt++;	
			}
			
			
		}
		System.out.println("Positive"+pcnt);
		System.out.println("Negative"+ncnt);
	}
}
