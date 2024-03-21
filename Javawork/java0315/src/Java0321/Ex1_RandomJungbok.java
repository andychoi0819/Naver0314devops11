package Java0321;

public class Ex1_RandomJungbok {
	public static void main(String[] args) {
		int[]rand=new int[10];
		
		for(int i=0; i<rand.length; i++) {
			int n =(int)((Math.random()*30)+1);
			rand[i]=n;
			
			for(int j=0; j<i; j++)
			{
				if(rand[i]==rand[j])
					{i--;
					
					}
				
			}
		}
	    //순차적 정렬(오름차순)
		
		
		System.out.println("1~30 사이 중복되지않은 난수 구하기");
		for(int i=0; i<rand.length; i++) 
		{
			System.out.printf("%4d",rand[i]);
		}
	}
}

