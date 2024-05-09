package innerclass.ex4;

class Outer {
	
	private int a = 10;
	private static int b = 20;
	
	// 인스턴스 내부클래스
	class InClass {
		
		int i1 = a; // private와 같은 접근제어자와 상관없이 외부클래스의 private 멤버도 사용 가능
		int i2 = b;
		
	}
	// 정적 내부클래스
	static class InStaticClass {
		// 스택틱메모리에 static이 객체 없이 먼저 생성된 상태라서 (new)객체의 생성이 필요한
		// 인스턴스 객체들을 (위에 Outer의 a변수 같은) 사용 불가하다
		int i2 = b;
		
	}
	
	
}
