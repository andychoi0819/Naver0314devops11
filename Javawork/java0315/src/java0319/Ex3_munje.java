package java0319;

public class Ex3_munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x=1;x<=9;x++) {
			for(int y=1; y<=9; y++) {
				int susik=(x*10+y)+(y*10+x);
				if(susik==121)
					System.out.printf("%d%d+%d%d=121\n",x,y,y,x);
			}
		}
	}

}
