package lambda;

public class Ex1 {

	public static void main(String[] args) {
	
		// 클래스로 인터페이스 구현하기
		StringConcat concat1 = new StringConcatImpl(); //변수는 부모클래스나 자식클래스 둘다 가능
		concat1.makeString("Hello", "World");
		
		
		// 람다식으로 인터페이스 구현하기
		StringConcat concat2 = (s1, s2) -> System.out.println(s1 + "," + s2);
		concat2.makeString("Hello", "World");
		// 람다식으로는 객체생성 없이도 바로 생성 가능
		
	}

}

// 함수형 인터페이스
interface StringConcat {
	
	// 두 문자열을 연결하는 추상 메소드
	public void makeString(String s1, String s2);
	
		
}

// 구현 클래스 만들기
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
	
}











