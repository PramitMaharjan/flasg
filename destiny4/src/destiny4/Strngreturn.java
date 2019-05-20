package destiny4;

class Frog {
	String name;
	int age;

	public void setName (String newName) {
		name = newName;}
	
	public void setAge (int newAge) {
	age= newAge;
		
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Strngreturn {
	public static void main(String[] args) {
Frog frog1 = new Frog();
//frog1.name = "Boxi";
//frog1.age = 2;

frog1.setName ("Boxi");
frog1.setAge (2);
System.out.println(frog1.getName());
	}
}
