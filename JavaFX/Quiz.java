import java.util.Random;
   import java.util.Scanner;
   
   public class Quiz {
     // スキャナをつくる
    static  Scanner sc = new Scanner( System.in );
     
     public static void main ( String[] args ) {
       // 最初の画面を表示する
       startGame();
       printMenu();
        String userChoice = sc.nextLine();
        if ( "1".equals( userChoice ) ) {
         playGame();
       }
   }
   public static void startGame() {
       System.out.println( "########################" );
       System.out.println( "#    My First Game     #" );
       System.out.println( "#    ver.1             #" );
       System.out.println( "#    by mr luffy       #" );
       System.out.println( "########################" );
     }  
   public static void printMenu() {
       System.out.println( "1: play     2: end" );
       System.out.print( "select: " );
     }
   public static void playGame() {
   	System.out.println("いつかわたしは宝くじが当たる？");
   	System.out.println("1: 今日　2:来週　3:no never");
   		String userChoice = sc.nextLine();
   		if ( "2".equals( userChoice ) ) {
   			System.out.println("おめでとう！宝くじが当たる");
   		}else{
   			System.out.println( "ちがいます。当たることはないです。" );
   		}
   		}
		}  	   	
