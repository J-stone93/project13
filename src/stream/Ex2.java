package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		
		// 1.한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		Stream<Integer> stream = list.stream();
		// forEach: 반복적인 작업을 수행함
		
		// Consumer를 람다식 함수로 구현해서 인자로 넣음
		stream.forEach( n -> System.out.print(n) );

		// 2.스트림 연산은 원본데이터를 변경하지 않는다
		// sorted: 요소들을 정렬하여 새로운 스트림을 생성 (중간연산자(sorted,filter...)는 스트림을 반환)
		// collect: 스트림을 list로 변환
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list); // 원보 데이터가 그대로 있음
		System.out.println(sortedList);
		
		// 3.중간연산은 여러번 할 수 있고, 최종연상은 마지막에 한버만 할 수 있다
		// filter: 조건을 만족하는 요소만 추출
		// sorted: 순서대로 정렬
		// forEach: 특정작업을 반복적으로 수행
		// 3보다 큰 값만 찾아서, 순서대로 정렬 한 후에 출력
		list.stream()
		.filter(n -> n >= 3).sorted() // 중간연산자는 여러개 사용 가능
		.forEach(n -> System.out.print(n)); // 최종연산자는 꼭 필요하고 마지막에 한번만 사용 가능 
		
		
		// 중간연산이 끝나고 다시 스트림을 반환하기 때문에,
		// 계속해서 중간연산을 사용할 수 있음
		
		// 스트림 생성
		Stream<Integer> stream2 = list.stream();
		
		// 값을 조작하고 새로운 스트림 생성
		Stream<Integer> stream3 = stream2.sorted();
			
	
	}

}








