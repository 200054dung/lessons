import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// String[] names = {"aaa","bbb","ccc"};
		String[]names =  {"aaa","bbb","ccc"};
		for(int i = 0;i<3;i++){
			System.out.print("inpput name:");
			names[i] = sc.nextLine();
		}
		for(int i = 0;i<3;i++){
			System.out.println(names[i]);
		}
		}
	}

