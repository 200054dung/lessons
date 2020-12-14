import java.util.Scanner;

public class Geeting {
 public static void main(String[] args) {
		String msg = getGeeting();
		System.out.println(msg);

	}
	 public static String  getGeeting() {
	 	Scanner sc = new  Scanner (System.in);
	 	System.out.print("your name ?");
	 	String name = sc.nextLine();

	 	String msg ="Hello, " + name + "!";
	 	return msg;
	 }
}