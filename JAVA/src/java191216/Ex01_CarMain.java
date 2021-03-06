package java191216;

public class Ex01_CarMain {

	public static void main(String[] args) {
		// Car 클래스를 객체로 선언
		// 객체 선언 문법
		// 클래스이름 객체이름 = new 클래스이름();
		//					    생성자이름();
		Ex01_Car car = new Ex01_Car(); // car() : 기본 생성자
		Ex01_Car car1 = new Ex01_Car();
		Ex01_Car car2 = new Ex01_Car();
		// car, car1, car2는 각각 다른 객체화
		Ex01_Car car3 = null; // 변수 선언
		car3 = new Ex01_Car();
		
		// Car 클래스에 있는 필드 사용
		car.color = "검정";
		System.out.println(car.color);
		System.out.println(car.speed);
		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(car3.color);
		// 초기값을 안줘도 기본값으로 정수는 0, 실수는 0.0, 스트링은 null로 되있음
		
		car.company = "BMW";
		System.out.println(car.company);
		System.out.println(car1.company);
		System.out.println(car2.company);
		System.out.println(car3.company);
		
		car.speed = 100;
		int speedUP = car.speed + 50;
		System.out.println(speedUP);
		
		System.out.println(car.type);
		
		// 매개변수가 있는 생성자를 호출하여 객체 선언
		Ex01_Car car4 = new Ex01_Car("빨강", 150);
		
		// car4 객체가 가지고 있는 필드값 모두 출력
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		// Car 클래스에 color와 company를 매개변수로 하는 생성자를 선언하고
		// main 클래스에서 이 생성자를 이용하여 객체를 선언 후 전체 필드값 출력
		Ex01_Car car5 = new Ex01_Car("화이트", "SM6");
		System.out.println(car5.color);		
		System.out.println(car5.company);
		System.out.println(car5.model);
		System.out.println(car5.speed);
		System.out.println(car5.type);
		
		// 필드값 전체를 보여주는 것
		System.out.println(car5.toString());
		
		/* Car 클래스의 모든 필드를 매개값으로 하는 생성자를 선언하고
		 * 이 생성자 호출로 객체를 선언하여 모든 필드값 출력
		*/
		Ex01_Car car6 = new Ex01_Car("레드", 200, "LPG", "하이브리드", "SM6");
		System.out.println(car6.toString());
		
		
	}

}