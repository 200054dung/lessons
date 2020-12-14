public class People{
 public static void main(String[] args) {
 	Teacher ta = new  Teacher("先生T","genkidesuka","10");
 	Teacher ya = new Teacher("先生Ya","出席たりますか","8");
 	Teacher yo = new Teacher("先生Yo","hawai","5");
 	ta.hello();
 	ya.hello();
 	yo.hello();
 	attack(ta,yo);
 	attack(ya,ta);
 	attack(ta,ya);
 	attack(yo,ta);	
	}
	public void attack(Teacher a ,Teacher b){
		System.out.println(a.name +"の攻撃！");
		System.out.println(b.name +"に５のダメージ！");
		int newHp = b.hp -5;
		b.hp =newHp;
		if(b.hp<=0) {
			System.out.println(b.name +"は倒れた！");
		}
	}
}

class Teacher {
	String  name = "";
	String msg ="";
	int hp = 10;
	Teacher(String namee,String kotoba,int value ){
		name = namee; 
		msg =kotoba; 
		hp=value;
	}
	public void hello(){
		System.out.println(name + "desu"+msg);
	}
}



