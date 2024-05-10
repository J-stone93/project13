package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
		//구현 클래스 사용
		Hello hello1 = new HelloImpl();
		hello1.helloPrint();
		
		//익명 클래스 사용
		Hello hello2 = new Hello() {
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요.");
			}
		};
		hello2.helloPrint();
		
		//람다식 사용
		Hello hello3 = () -> System.out.println("안녕하세요");
		hello3.helloPrint();
		
	}

}

//함수형 인터페이스
interface Hello {
	
	// 안녕하세요를 출력하는 메소드
	void helloPrint();
}

// 인터페이스의 구현 클래스
class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요.");
	}
}










