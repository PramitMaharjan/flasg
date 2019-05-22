package destiny4;

class Thing {
	public String name;
	public static String description;
	public void showName() {
		System.out.println(name);
	}
	public static void showInfo() {
		System.out.println("hello");
	}
}

public class Finalstatic {
	public static void main(String[] args) {
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "BOb";
		thing2.name = "Pramit";
		
		thing1.showName();
		thing2.showName();
		
		Thing thing3 = new Thing();
		thing3.description = "Hello Boka";
		System.out.println(thing3.description);
				
		System.out.println(Math.PI);
	}
}
