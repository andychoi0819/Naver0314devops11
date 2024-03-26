package java0326;

interface Tire{
	void roll();
}

class HanKooktire implements Tire
{
	public void roll(){
	System.out.println("한국타이어가 굴러갑니다");	
	}
}

class KumHotire implements Tire
{
	public void roll(){
	System.out.println("금호타이어가 굴러갑니다");	
	}
}

class Car{
	Tire tire1= new HanKooktire();
	Tire tire2= new KumHotire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}


public class Ex8_Book376 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car myCar= new Car();
     myCar.run();
     
     myCar.tire1 = new HanKooktire();
     myCar.tire2 = new KumHotire();
     
     myCar.run();	}

}
