package Day9;

public class Performance {
	
	public static void performConcert(Girlband... groups) {
		System.out.println("🎤 콘서트가 시작됩니다!\n");
		for (Girlband group : groups) {
			group.sing();
	    }
		System.out.println("\n🎉 콘서트가 끝났습니다!");
	}
	
	public void perf(Girlband girlband) {
		if(girlband instanceof Aespa) {
			Aespa aespa = (Aespa) girlband;
			aespa.sing();
		} else if(girlband instanceof Lesserafim) {
			Lesserafim aespa = (Lesserafim) girlband;
			aespa.sing();
		}
	}
	
	public static void main(String[] args) {
		Girlband group1 = new Aespa();
		Girlband group2 = new Hearts2hearts();
		Girlband group3 = new Ive();
		Girlband group4 = new Lesserafim();
		Girlband group5 = new Newjeans();
		Girlband girlbandH = new Aespa();
		Girlband girlbandF = new Lesserafim();

//		performConcert(group1,group2,group3,group4,group5);
		Performance a = new Performance();
		a.perf(girlbandH);
		a.perf(girlbandF);
	}
}
