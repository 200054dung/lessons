
import java.util.Scanner;
import java.util.Random;
public class Games2 {
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
		System.out.println("input your name:");
		String name =sc.nextLine();
		System.out.println(name+" "+"desune");
		System.out.println("  $$$$$$$$$$");
		System.out.println("$$  (^  O)  $$");
		System.out.println("  $$  ~~  $$");
		System.out.println("  $$      $$");
		System.out.println("  $$$$$$$$$$");
		System.out.println("");
		Scanner vc = new  Scanner(System.in);
		System.out.println("input your name:");
		String na = vc.nextLine();
		System.out.println(na);
		System.out.println("1 play   2 end");
		System.out.println("> ");
		Scanner cs = new  Scanner(System.in);
		int userInput = sc.nextInt();
		if(userInput ==1){
			System.out.println("Les't play !");
		}else{
		System.out.println("####################");
		System.out.println("##                ##");
		System.out.println("##   Game over    ##");
		System.out.println("##                ##");
		System.out.println("####################");
		

	 }	
}
}