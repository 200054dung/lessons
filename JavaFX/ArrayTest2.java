import java.util.Scanner;
public class ArrayTest2 {
	public static void main(String[] args) {
		String password = "asb";
		System.out.print("Input password:");
		Scanner sc = new Scanner(System.in);
		String userData = sc.nextLine();
		if(password.equals(userData)){
			System.out.println("OK!");
		}else{
			System.out.println("invalid.");
		}
		}
	}
