package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz2 {
	
	// fiter 함수의 인자는 Predicate
	// Predicate 인터페이스를 람다식 함수로 구현하기
	// 1.추상메소드를 구현한다 2.람다식함수로 바꾼다
//	boolean test(T t) {
//		return t.endsWith(".txt");
//	}

	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img");
		
		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };
		
		
		// 1.파일 목록 중에서 txt 파일만 찾으세요
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.filter(s -> s.endsWith(".txt")).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 2.확장자별로 파일의 개수를 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
		long l1 = stream2.filter(s -> s.endsWith(".txt")).count();
		System.out.println("txt: " + l1);
		
		Stream<String> stream3 = Arrays.stream(arr);
		long l2 = stream3.filter(s -> s.endsWith(".pdf")).count();
		System.out.println("pdf: " + l2);
		
		Stream<String> stream4 = Arrays.stream(arr);
		long l3 = stream4.filter(s -> s.endsWith(".img")).count();
		System.out.println("img: " + l3);
		
		
		// 3.파일의 확장자만 추출하여 출력하세요
		System.out.println("인터넷 서칭");
		Stream<String> stream5 = Arrays.stream(arr);
		stream5.filter(s -> s.indexOf('.')!=-1)   
        .map(s -> s.substring(s.indexOf('.')+1)) 
        .map(String::toUpperCase)    
        .distinct()			      
        .forEach(System.out::println);
		
		System.out.println("선생님 풀이");
		Stream<String> stream6 = Arrays.stream(arr);
		stream6.map(s -> {String[] strArr = s.split("\\.");
						return strArr[1];
		}).distinct().forEach(s -> System.out.println(s));
		
	}

}







