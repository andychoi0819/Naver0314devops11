package java0319;

import java.util.StringTokenizer;

public class Ex8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 객체의 Method 공부하기");
		String str1="Have a nice day";
		String str2="Apple";
		String str3="apple";
		
		System.out.println(str1.charAt(7));
		System.out.println(str1.charAt(0));
		System.out.println(str2.charAt(4));
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.indexOf('S'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.length());
		System.out.println(str1.concat(" Andy"));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		System.out.println("apple".equals(str2));
		System.out.println("apple".equals(str3));
		System.out.println("apple".equalsIgnoreCase(str2));
		System.out.println(str2==str3);
		
		//문자열 추출
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(7,10));
		String Happy= str1.substring(7);
		System.out.println(str1.toLowerCase().startsWith("have"));
		System.out.println(str1.toLowerCase().endsWith("day"));
		System.out.println(str2.repeat(3));
		
		//일부변경
		System.out.println(str1.replace("a", "se"));
		//비교 
		System.out.println("apple".compareTo("append"));
		System.out.println("apple".compareTo("banana"));//양수가 나오면 첫문자열이 크고 음수가 나올경우 작다
		System.out.println("apple".compareTo("apple"));
		
		//문자열 분리
		String colors="red,blue,green,yellow,pink";
		String []a1=colors.split(",");
		System.out.println("분리된 배열의 갯수: "+a1.length);
		System.out.println("분리된 배열의 이름: "+ a1[0]+a1[4]);
		
		//분리된 방법
		StringTokenizer st = new StringTokenizer(colors,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		String msg="   hello   ";
		System.out.println(msg.length());
		System.out.println(msg.trim().length());
		
		//valueOf:
		System.out.println(String.valueOf(3));
		System.out.println(3+"");
		
	}

}
