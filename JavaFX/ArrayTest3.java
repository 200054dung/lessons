import java.util.Scanner;
public class ArrayTest3 {
	public static void main(String[] args) {
	String password ="asb";
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.print("input password:");
		String userData = sc.nextLine();
		if(password.equals(userData)){
			break;
		}
		}
		
	}
}