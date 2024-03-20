package java0320;

public class Ex11_ArrayRank {
	public static void main(String[] args) {
		int [] score = {70,90,89,90,60};
		int [] rank=new int[5];
		
		/*
		 * 등수를 구하는데 동점일 경우 등수
		 */
		System.out.println("=".repeat(10));
		for(int x=0; x<score.length; x++) {
			
			rank[x]=1;
			for(int y=0; y<score.length; y++) {
				if(score[y]>score[x]) {
					rank[x]=rank[x]+1;
				}
				else {
					rank[x]=rank[x];
				}
			}
			System.out.printf("번호: "+(x+1)+"\n");
			System.out.printf("점수: "+score[x]+" ");
			System.out.printf(rank[x]+"등"+" ");
			System.out.println("");
			System.out.println("=".repeat(10));
		}
		
		
		
		
	}
}
