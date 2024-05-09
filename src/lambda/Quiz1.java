package lambda;

public class Quiz1 {

	public static void main(String[] args) {

		// 구현 클래스 사용하여 max() 호출
		MyNumber number1 = new MyNumberImple();
		System.out.println(number1.max(10, 20));

		// 익명 클래스를 사용하여 max()를 호출
		MyNumber number3 = new MyNumber() {
			@Override
			public int max(int x, int y) {
				if (x > y) {
					return x;
				}
				return y;
			}
		};
		System.out.println(number3.max(50, 60));
		
		// 람다식 함수를 사용하여 max()를 호출
		MyNumber number2 = (x, y) -> {
			if (x > y) {
				return x;
			}
			return y;
		};
		System.out.println(number2.max(30, 40));


	}

}

//함수형 인터페이스
interface MyNumber {

	// 더 큰 값을 구하는 메소드
	int max(int x, int y);
}

class MyNumberImple implements MyNumber {

	@Override
	public int max(int x, int y) {

//		int max = 0;
//		if (x > y) {
//			max = x;
//		} else {
//			max = y;			
//		}
//		return max;

		if (x > y) {
			return x;
		}
		return y;

	}

}