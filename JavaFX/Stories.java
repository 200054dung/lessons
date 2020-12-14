import java.util.Random;
public class Stories{
   public static void main(String[] args) {
		Random random = new  Random();
		String[] subjects = {"takano","susanoo","obito"};
		String[] places ={ "セブンイレブンで", "船の中で", "クラスの中で" };
		String[] done = {  "ご飯を食べた", "きれいな女とあそび", "料理した"};
		String story = "";
		int num = random.nextInt(3);
		story = story + subjects[num];
		num = random.nextInt(3);
		story = story + places[num];
		num  = random.nextInt(3);
		story=story+done[num];
		System.out.println(story);

	}
}