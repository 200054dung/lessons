class Student{
	private String name;
	private String drink;
	public void sayHello(){
		System.out.println("Hello! My name is"+this.name);
}
public void setName(String data){
	this.name = data;
}
public void sayFavorite(){
	System.out.println("I love "+this.drink);
}
public void setFavorite(String data1){
	this.drink = data1;
}
}
public class Test11{
  public static void main(String[] args) {
  	System.out.println("Hello");
  	Student yamada = new Student();
  	// yamada.name ="Yamada Taro";
  	yamada.setName("Yamada Taro");
  	yamada.setFavorite("coffee !");
  	Student tanaka = new Student();
  	// tanaka.name ="Tanaka Masahiko";
  	tanaka.setName("Tanaka Masahiko");
  	tanaka.setFavorite("mascha!");
  	// System.out.println(yamada.name);
  	// System.out.println(tanaka.name);
  	yamada.sayHello();
  	yamada.sayFavorite();
	tanaka.sayHello();
	tanaka.sayFavorite();	
		}
	}
