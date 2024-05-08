package innerclass.ex3;

public class Ex3 {

	public static void main(String[] args) {
		
		Outer outer = new Outer(); // 외부 클래스 객체 먼저 생성
		Outer.InstanseInner instanseInner = outer.new InstanseInner();
		instanseInner.i1 = 300;
		instanseInner.i2 = 300;
		
		Outer outer2 = new Outer();
		Outer.InstanseInner instanseInner2 = outer2.new InstanseInner();
		instanseInner2.i1 = 400;
		instanseInner2.i2 = 400; //외부클래스 outer에 종속되므로 마지막에 실행된 400이 저장됨
		
		System.out.println("첫번째 인스턴스 내부클래스:" + instanseInner.i1 + ", " + instanseInner.i2);
		System.out.println("두번째 인스턴스 내부클래스:" + instanseInner2.i1 + ", " + instanseInner2.i2);
		
		// 정적 내부 클래스는 인스턴스 클래스와 다르게 외부 클래스 객체 생성이 필요가 없다
		Outer.StaticInner staticInner = new Outer.StaticInner();
		
		staticInner.i1 = 300;
		staticInner.i2 = 300;
		
		System.out.println("정적 내부클래스:" + staticInner.i1 + ", " + staticInner.i2);
		
		Outer.StaticInner staticInner2 = new Outer.StaticInner();
		
		staticInner2.i1 = 400;
		staticInner2.i2 = 400;
		System.out.println("정적 내부클래스:" + staticInner2.i1 + ", " + staticInner2.i2);
		
		
	}

}

class Outer {
	
	// 인스턴스 내부 클래스
	class InstanseInner {
		int i1 = 100;
		static int i2 = 200; // 정적변수는 외부 객체에 종속됨
		
	}
	
	// 정적 내부 클래스
	static class StaticInner {
		int i1 = 100;
		static int i2 = 200;
	}
	
	// 지역 내부 클래스
	void method() {
		
		class LocalInner {
			
		}
	}
	
}







