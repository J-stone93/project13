package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {
		
		String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};
		
		
		// 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요
		Stream<String> stream1 = Arrays.stream(arr);
//		System.out.println(stream1.map(s -> s.length()).filter(n -> n > 2).mapToInt(n -> n.intValue()).count());
		
		// 선생님 풀이
		long count = stream1.filter(s -> s.length() > 2).count();
		// count()의 자료형은 int가 아니라 long이다
		System.out.println(count);
		
		// 2. 모든 문자열의 길이를 더한 합을 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
//		System.out.println(stream2.map(s -> s.length()).mapToInt(n -> n.intValue()).sum());
		
		// 선생님 풀이
		int sum = stream2.mapToInt(s -> s.length()).sum();
		// 처음부터 자료형 타입을 정하지 말고 식 정리 후에 최종연산자의 타입을 확인하고 정해도 됨
		System.out.println(sum);
		
		
		// 3. 가장 길이가 짧은 문자열의 길이를 구하세요
		Stream<String> stream3 = Arrays.stream(arr);
//		IntStream intStream = stream3.map(s -> s.length()).mapToInt(n -> n.intValue());
//		OptionalInt min = intStream.min();
//		System.out.println(min.getAsInt());
		
		// 선생님 풀이
		OptionalInt min = Arrays.stream(arr).mapToInt(s -> s.length()).min();
		System.out.println(min);
		
		// 4. 중복을 제거한 리스트를 만드세요 (풀이 동일)
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> strArr = stream4.distinct().collect(Collectors.toList());
		System.out.println(strArr);
	}

}
