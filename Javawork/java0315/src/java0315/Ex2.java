package java0315;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a= 127;
		byte b=(byte) 200; // 캐스트 연산자
		System.out.println(a);
		System.out.println(b);//값손실이 일어날경우 내부적으로 2의 보수값 츨력 -56 
		
		//실수타입
		float x = 30.234325f; //f 꼭 넣기
		double y = 20.4141231;
		System.out.println((int)x);
		System.out.println(y);
		
		//문자형
		char c= 'c';
		String d= "Home";
		System.out.println(c);
		System.out.println(d);
		
		// 문자열 지정하는 방법
		String str1= new String("Happy");
		String str2="Happy";
		System.out.println(str1);
		System.out.println(str2);
		
		String str3= "Today is Friday and i have nothing to do.";
		System.out.println(str3);
		//JDK 15 부터 가능, 텍스트 블록
		String str5="""
				나는 오늘ㄷ 자바를 공부한다..
				오늘도 즐거운 금요일인데 할일이 없다.
				어쩌고 저쩌고
				""";
		System.out.println(str5);
	}

}
