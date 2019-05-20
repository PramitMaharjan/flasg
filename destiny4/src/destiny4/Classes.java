package destiny4;

class Person {
	// Instance variable (data or "state")
	String name;
	int age;

	// Classes a=can contain
	// 1. data
	// 2. Subroutines (methods)
	void speak() {
		for (int i=0; i<3; i++) {
			System.out.println("My name is:" + name + "and I am: " + age + " years old");
		}
	}
	void sayHello() {
		System.out.println("hello there!");
	}
}

public class Classes {
	public static void main(String[] args) {
		Person Person1 = new Person();
		Person1.name = "pramit maharjan";
		Person1.age = 25;
		Person1.speak();
Person1.sayHello();
		
		Person Person2 = new Person();
		Person2.name = "Ritu Maharjan";
		Person2.age = 24;
		Person2.speak();
Person2.sayHello();

		System.out.println(Person1.name);
	}
}
