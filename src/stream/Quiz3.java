package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Quiz3 {
	
	// map 함수의 인자는 Function
		// 인터페이스를 구현하는 방법은 3가지
		// 함수형 인터페이스는 람다식 함수로 구현 가능
		// Function 인터페이스를 람다식 함수로 구현하기
		// 1.추상메소드 구현한다 2.람다식함수로 바꾼다
		// 추상메소드의 기능은 해당 연산자(map...)의 기능과 같다
		// 이함수는 요소를 다른값으로 바꿔서 반환하는 함수
		// 리턴타입 R? 제네릭 타입이라는거. 여러분들이 정해주시면 됨

//		R apply(T t) { //요소는 주문 객체
//			return t.orderNo; //주문 번호로 바꿔서 반환
//		}

	public static void main(String[] args) {

		ArrayList<Order> list = new ArrayList<Order>();
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));

		// 1. 주문번호만 출력하기
		Stream<Order> stream1 = list.stream();
		stream1.map(s -> s.orderNo).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// 2. 주문년도가 2022인 합계와 건수 출력
		// sum을 사용해야하므로 기본형으로 바꿔줘야함(mapToInt)
		int sum1 = list.stream().filter(s -> s.year == 2022).mapToInt(s -> s.price).sum();
		System.out.println("2022년도 합계: " + sum1);
		
		long i1 = list.stream().map(s -> s.year).filter(n -> n == 2022).count();
		System.out.println("2022년도 판매 건수: " + i1);
		
		// 3. 주문년도가 2023인 합계와 건수 출력
		// sum을 사용해야하므로 기본형으로 바꿔줘야함(mapToInt)
		int sum2 = list.stream().filter(s -> s.year == 2023).mapToInt(s -> s.price).sum();
		System.out.println("2023년도 합계: " + sum2);
		
		long i2 = list.stream().map(s -> s.year).filter(n -> n == 2023).count();
		System.out.println("2023년도 판매 건수: " + i2);

	}

}

class Order {

	int orderNo;
	int year;
	int price;

	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

}