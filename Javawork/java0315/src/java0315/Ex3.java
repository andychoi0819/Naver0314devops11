package java0315;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		int month=3;
		int day=5;
		
		String msg="Have a Nice day!!";
		char blood= 'B';
		double avg= 97.4567;
		
		System.out.println("** 출력 1 **");
		System.out.println("날짜"+year+"-"+ month + "-" + day);
		System.out.print("혈액형:" + blood + "형"); //print는 개행을 안함
		System.out.println("\t 평균:"+ avg);
		
		//printf 를 이용해서 출력해보자
		//변환기호를 이용해서 출력한다
		//정수 %d, 실수:%f, 문자;%c, 문자열:%s
		
		System.out.printf("**%40s**\n\n",msg);//40칸만큼 우측으로 출력
		System.out.printf("**%-40s**\n\n",msg);//40칸만큼 좌측으로 출력
		System.out.printf("날짜: %d-%d-%d\n", year, month, day);
		System.out.printf("날짜: %2d-%2d-%2d\n", year, month, day);
		System.out.printf("날짜: %02d-%02d-%02d\n", year, month, day);
		System.out.printf("나의 혈액형은 %c형입니다\n", blood);
		System.out.printf("평균:%f\n", avg);
		System.out.printf("평균:%10.2f\n", avg);
		System.out.printf("평균:%10.2f점\n", avg);
		System.out.printf("평균:%-10.2f점\n", avg);

	}

}
