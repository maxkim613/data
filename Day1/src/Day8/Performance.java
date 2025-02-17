package Day8;

public class Performance {
	
	public static void performConcert(Girlband... groups) {
		System.out.println("🎤 콘서트가 시작됩니다!\n");
		for (Girlband group : groups) {
			group.sing();
	    }
		System.out.println("\n🎉 콘서트가 끝났습니다!");
	}
	
	public static void main(String[] args) {
		Girlband group1 = new Aespa();
		Girlband group2 = new Hearts2hearts();
		Girlband group3 = new Ive();
		Girlband group4 = new Lesserafim();
		Girlband group5 = new Newjeans();
		
		performConcert(group1,group2,group3,group4,group5);
	}
}
