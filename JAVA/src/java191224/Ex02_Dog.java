package java191224;

// Animal 클래스의 자식클래스(실체클래스)
public class Ex02_Dog extends Ex02_Animal {
	
	// 추상클래스에서 정의한 추상메소드를 구체화
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
}
