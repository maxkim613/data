package Day8;

public class IceSports {
	protected String sportName;
	protected String venue;
	
	public IceSports() {
	}
	public IceSports(String sportName,String venue) {
	}	
	
	public void startGame() {
		System.out.println("경기 시작!"+ sportName +" 경기가 "+venue+"에서 열립니다!");
	}
}
