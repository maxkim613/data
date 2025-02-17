package Day6;

public class Execution {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Bird hummingBird = new Humming("벌새","1살","벌꿀");
		Bird penguinBird = new Penguin("펭귄","2살","물고기");
		
		zoo.setHummingBird(hummingBird);
		zoo.setPenguinBird(penguinBird);	
		
		zoo.getHummingBird().setGender("암컷");
		zoo.getPenguinBird().setGender("수컷");	
		
		zoo.getBird(zoo.getHummingBird());
		zoo.getBird(zoo.getPenguinBird());
		
	}
}
