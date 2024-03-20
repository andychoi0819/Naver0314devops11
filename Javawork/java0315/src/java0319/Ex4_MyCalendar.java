package java0319;

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Ex4_MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.내가 입력한 년도 월의 1일 무슨 요일인가?
		//2. 내가 입력한 년도 월이 몇일까지 있는가?
		
		Scanner s= new Scanner(System.in);
		int endday;
		
		
		System.out.println("달력은 조회할 년도와 월을 입력하시오");
		int year=s.nextInt();
		int month=s.nextInt();
		
		if(month<1||month>12) 	{
			System.out.println("wrong month");
			return;
		}
		
		System.out.printf("%10d 년 %d 월 달력\n\n", year,month);
		System.out.println("=".repeat(50));
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=".repeat(50));
		
		Date dt= new Date(year-1900,month-1,1);
		int week=dt.getDay();
		//System.out.println(week);
		//2.내가 입력한 년도-월이 몇일까지 있는가?
		switch(month) 
		{
		case 2: 
			endday=year%4==0&&year%100!=0||year%400==0?29:28;
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			endday=30;
			break;
		default:
			endday=31;
		}
		for(int i=1;i<=week;i++) 
		{
			System.out.print("\t");
		}
		
		for(int i =1; i<=endday; i++) 
		{
			System.out.printf("%2d\t",i);
			++week;
			if(week%7==0) 
			{
				System.out.println("\n");
			}
		}
		System.out.println("");
		System.out.println("=".repeat(50));
	}

}
