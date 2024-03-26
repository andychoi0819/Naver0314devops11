package java0326;

abstract class Animal
{
	
//abstract 매서드는 오버라이트 목적으로  body({}) 업익 구현하고자 할경우
//앞에 abstract를 붙혀서 추상 메서드로 만든다 
//abstract 매서든를 한이상 포함하고 있는 클래스는 클래스 역시 추상화시켜야 핟나.
//딘, 추상클래스는 그 자체로는 생성할수 없다
//추상클래스는 그 자레노느 생성할수 없다. 
//추상클래스를 상속바은 서브 클래슨ㄴ 반드시 추상 매서드를 오버라이드해야하는데
//만약 오버라이드하지 않아을 경우 서브클래스 역시 추상화시킨다
//	public void sound() {
//		System.out.println("딱히 하는일이 없음");
//	}
	
	abstract public void sound();
	//추상 클래스에는 추상 매서드뿐 아니라 이반 매서드로 포함할수 있다
	
	public void showTitle()
	{
		System.out.println("추상 클래스 공부중!!");
	}
}


class Dog extends Animal{

	@Override
	public void sound() {
		//super.sound();
		System.out.println("멍멍!!");
	}
	
}

class Chick extends Animal{
	@Override
	public void sound() {
		//super.sound();
		System.out.println("삐약삐약!!");
	}
}

class Cat extends Animal{
		@Override
		public void sound() {
			//super.sound();
			System.out.println("냐오냐옹!!");
	}
}

public class Ex1_Abstract {

	public static void hello(Animal ani){
		ani.sound();
		ani.showTitle();
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello(new Cat());
		hello(new Dog());
		hello(new Chick());
		//hello(new Animal());
		
	}

}
