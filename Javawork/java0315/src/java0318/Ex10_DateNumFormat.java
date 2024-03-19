package java0318;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;

public class Ex10_DateNumFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd-HH-mm:ss EEE");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEEE");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3= new SimpleDateFormat("yyyy년 MM일 dd일 HH시 mm분 ");
		System.out.println(sdf3.format(date));
		
		//숫자 포멧 양식 지정하기
		
		int money=56789000;
		double average=98.7295;
		
		NumberFormat nf1= NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(money));
		
		//따로 생성없이 바로 메ㅓ드 호출해도 됨
		
		System.out.println(NumberFormat.getInstance().format(money));
	
	    //평균값을 소수점이하 1자리 출력하기
		NumberFormat nf2= NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(1);
		System.out.println(nf2.format(average));
	}

}
