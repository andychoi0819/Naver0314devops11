package Java0321;

public class EX5_ArrayAgeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {8,40,30,20,15,14,54,53,56,25,44,32,12,23,21,34,25,26,27,31};
		System.out.println("총 인원수:" +data.length);
		int [] ageCount=new int[6];
		
		for(int i=0; i<data.length;i++)
		{
			int a= data[i];
//			if(a/10==1)
//			{
//				ageCount[a/10]++;
//			}
//			else if(a/10==2)
//			{
//				ageCount[a/10]++;
//			}
//			else if(a/10==3)
//			{
//				ageCount[a/10]++;
//			}
//			else if(a/10==4)
//			{
//				ageCount[a/10]++;
//			}
//			else if(a/10==5)
//			{
//				ageCount[a/10]++;
//			}
//			else
//			{
//				ageCount[a/10]++;
//			}
			ageCount[a/10]++;
			
		}
		for(int i=0; i<ageCount.length; i++)
		    if(ageCount[i]>0)
		    	if(i==0)
		    		System.out.printf("어린이 수는 %d명 입니다\n", ageCount[i]);
		    	else
		    		System.out.printf("%d대의 수는 %d명 입니다\n",i*10,ageCount[i]);
	}
	

}
