package Day6;

public class Type {
	public static void main(String[] args) {
		Bird birdH = new Humming("벌새","1","벌꿀");
		Bird bird = new Penguin("펭귄","3","물고기");
		Humming humming = (Humming) birdH;
		System.out.println("Humming ?"+(birdH instanceof Humming));
		System.out.println("Humming ?"+(bird instanceof Humming));
		System.out.println("Penguin ?"+(bird instanceof Penguin));
	

	}
}
