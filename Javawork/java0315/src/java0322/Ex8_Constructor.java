package java0322;
/*
 * 생성자(constructor) 특징
 * 1. 클래스명과 동일한 메서드명으로 만들어야 한다.
 * 2.리터 타입이 없다
 * 3. overloading 이 가능하다(여러개 생성가능)
 * 4.생성하랟 단 한번 호출된다.
 * 5.멤버변수의 초기화를 담당한다
 */

class Kiwi{
	String name,addr;
	Kiwi(){
		System.out.println("default constructor");
	}
	
	Kiwi(String name){
		this.name=name;
		addr="서울";
	}
	
	Kiwi(String name ,String addr){
		this.name=name;
		this.addr=addr;
	}
	
	public void show() 
	{
		System.out.println(name+"님은"+addr+"에 살고있어요");
	}
}
public class Ex8_Constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kiwi k1= new Kiwi();
		k1.show();
		
		Kiwi k2= new Kiwi("a");
		k2.show();
		
		Kiwi k3= new Kiwi("a","b");
		k3.show();
	}

}
