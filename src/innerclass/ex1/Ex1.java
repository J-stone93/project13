package innerclass.ex1;


class A {
	int num = 10;
}

class B {
	
	void method() {
		A a = new A(); // A클래스에 객체 생성 후 사용 가능(일반적인 사용 방법)
		System.out.println(a.num);
	}
}