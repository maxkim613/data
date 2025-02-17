package Day6;

public class Zoo {
	//필드 다형성
	//펭귄
	private Bird penguinBird;
	//부모 타입의 벌새
	private Bird hummingBird;
	//매개 변수 다형성
	public void getBird(Bird bird) {
	//부모 변수 찍기
	System.out.println(
	"Bird [species=" +
	bird.getSpecies() +
	", age=" +
	bird.getAge() +
	", gender=" +
	bird.getGender() + "]");
	//함수 실행
	bird.eat();
	}
	
	public Bird getPenguinBird() {
	return penguinBird;
	}
	
	public void setPenguinBird(Bird penguinBird) {
	this.penguinBird = penguinBird;
	}

	public Bird getHummingBird() {
	return hummingBird;
	}

	public void setHummingBird(Bird hummingBird) {
	this.hummingBird = hummingBird;
	}

	}