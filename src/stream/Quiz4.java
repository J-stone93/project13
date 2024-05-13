package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		Stream<Customer> stream1 = list.stream();
		stream1.map(n -> n.name).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		int total = list.stream().mapToInt(s -> s.price).sum();
		System.out.println("총 여행 비용: " + total);
		
		Stream<Customer> stream2 = list.stream();
		stream2.filter(n -> n.age > 20)
		.sorted( (o1,o2) -> {if (o1.age > o2.age) { 
			return 1;
		} else {
			return -1;
		}
		})
		.forEach(n -> System.out.println(n.name + "," + n.age));
		
		// 순정렬
//		int compare(T o1, T o2) {
//			
//			if (o1.age > o2.age) { // 역정렬을 원하면 부등호 반대로
//				return 1;
//			} else {
//				return -1;
//			}
//			
//		}
		

	}

}

class Customer {
	
	String name;
	int age;
	int price;
	
	public Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
}
