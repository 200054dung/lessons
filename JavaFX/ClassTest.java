public class ClassTest {
	public static void main ( String[] args){

		Yoshino yt = new  Yoshino();
		yt.hello();
	}
}
class Yoshino {
	private String msg;
	public void hello(){
		msg ="Hello";
		System.out.println(msg);
	}
}