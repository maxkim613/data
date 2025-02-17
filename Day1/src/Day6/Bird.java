package Day6;

public class Bird {

	//종
	private String species;
	//나이
	private String age;
	//성별
	private String gender;

	public Bird() {
	System.out.println("Bird 호출");
	}

	public Bird(String species, String age) {
	this.species = species;
	this.age = age;
	System.out.println("Bird 호출");
	}

	public void eat() {
	System.out.println("부모가 먹다");
	}

	public String getSpecies() {
	return species;
	}

	public void setSpecies(String species) {
	this.species = species;
	}

	public String getAge() {
	return age;
	}

	public void setAge(String age) {
	this.age = age;
	}

	public String getGender() {
	return gender;
	}

	public void setGender(String gender) {
	this.gender = gender;
	}

	}
