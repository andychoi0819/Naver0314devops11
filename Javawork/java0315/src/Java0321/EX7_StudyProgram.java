package Java0321;

public class EX7_StudyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]members= {"강하윤","공병현","김도훈","김우형","김정호",
				"김창인","민경진","박민지","박보민","박주용",
				"박한경","배동우","서정현","손가원","시바타유니",
				"신완철","우태형","유상곤","이가현","이병현",
				"이장우","이현성","정민석","정상혁","정진욱",
				"정환용","최시현","허승필","황재웅"};	


		String [][]team=new String[5][6];

		int []rnd = new int[30];
		Loop:
			for(int i=0; i<members.length; i++) 
			{
				rnd[i]=(int)(Math.random()*29);
				for(int j=0; j<i; j++) 
				{
					if(rnd[i]==rnd[j]) {
						i--;
						continue Loop;
					}
				}
			}
		
		
		int index=0;
		for(int i=0; i<team.length; i++) 
		{
			for(int j=0; j<team[i].length;j++) 
			{
				team[i][j]=members[rnd[index++]];
			}
		}

		
		for(int i=0; i<team.length; i++) 
		{
			for(int j=0; j<team[i].length;j++) 
			{
				System.out.printf("%S ", team[i][j]);
			}
			System.out.println("\n");

		}
	}
}


