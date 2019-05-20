package destiny4;

public class Classextended {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("");
		
		sb.append ("My name is bob.");
		sb.append(" ");
		sb.append("i am a lion.");
		
		System.out.println(sb.toString());
		
StringBuilder s = new StringBuilder(); 
s.append("My Name Is Pramit");
s.append(" ");
s.append("I am a student");
System.out.println(s.toString());


//// formating////
System.out.println("here is some text.\t This tab.\n This newline.");
System.out.println("more text");

System.out.printf("Total cost %10d\t; quantity is %d\n", 5, 120);
for (int i=0; i<20; i++) {
	System.out.printf("%-2d: %s\n", i, "here more");
		}
	}
}
