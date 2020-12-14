import java.util.Scanner;
  
  public class Test {
    public static void main( String[] args ) {
      // ↓　Scanner を new する
      Scanner sc = new Scanner( System.in );
      
      // ↓　名前を入力する
      System.out.print( "input name: " );
      String name = sc.nextLine();
      
      // ↓　ALOHA!メッセージを出力する
      System.out.println( "ALOHA! " + name + "!" );
    }
  }