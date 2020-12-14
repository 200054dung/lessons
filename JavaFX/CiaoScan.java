import java.util.Scanner;
public class CiaoScan {
    public static void main( String[] args ) {
    	Scanner sc = new Scanner( System.in );
    	System.out.print( "input your name: " );
    	 String name = sc.nextLine();
    	  System.out.print( "input your msg: " );
    	  String msg = sc.nextLine();
    	  int loop = 10;
    	for ( int i=0; i<loop; i++ ) {
    		System.out.println( i + ": " + msg + "! from " + name );
    	}
    	 
    }
}