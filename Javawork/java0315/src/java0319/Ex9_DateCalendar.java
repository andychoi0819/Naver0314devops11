package java0319;
import java.util.Date;
import java.util.Calendar;

public class Ex9_DateCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt= new Date();
		int date = dt.getDay() ;
		String day="?";
		System.out.println("=".repeat(20));
		System.out.printf(dt.getYear()+1900+"년"+" ");
		System.out.printf(dt.getMonth()+1+"월"+" ");
		System.out.printf(dt.getDate()+"일"+" ");
		//		System.out.println(dt.getDay());
		System.out.println("");
		System.out.println(dt.getHours()+"시 "+dt.getMinutes()+"분 "+dt.getMinutes()+"초 ");
		System.out.printf("요일: ");
		switch(date-1)
		{
			case 0:
				day="월요일";
				System.out.println(day);
				break;
			case 1:
				day="화요일";
				System.out.println(day);
				break;
			case 2:
				day="수요일";
				System.out.println(day);
				break;
			case 3:
				day="목요일";
				System.out.println(day);
				break;
			case 4:
				day="금요일";
				System.out.println(day);
				break;
			case 5:
				day="토요일";
				System.out.println(day);
				break;
			case 6:
				day="일요일";
				System.out.println(day);
				break;
			default: 
				break;
		}
		System.out.println("=".repeat(20));
		
		//Calendar
		Calendar cal =Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		date=cal.get(Calendar.DATE);
		int dayOf=cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d년 %d월 %d일 %d입니다\n",year,month,date,dayOf);


	}

}
