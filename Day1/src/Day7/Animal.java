package Day7;

public class Animal {

	public static void main(String[] args) {
		Mouse mouse = new Mouse("자",1,0.01,true,2);
		Bull bull = new Bull("축",2,0.01,false,700);
		Tiger tiger = new Tiger("인",3,0.089,false,true);
		Rabbit rabbit = new Rabbit("묘",4,0.007,true,8);
		Dragon dragon = new Dragon("진",5,0.0,true,true);
		Snake snake = new Snake("사",6,0.0,false,true);
		Horse horse = new Horse("오",7,0.1,false,45);
		Sheep sheep = new Sheep("미",8,0.01,false,true);
		Monkey monkey = new Monkey("신",9,0.0001,true,true);
		Chicken chicken = new Chicken("유",10,0.01,false,700);
		Dog dog = new Dog("술",11,0.01,false,700);
		Pig pig = new Pig("해",12,0.01,false,700);
		
		pig.printOrder(
				dog.printOrder(
				chicken.printOrder(
				monkey.printOrder(
				sheep.printOrder(
				horse.printOrder(
				snake.printOrder(
				dragon.printOrder(
				rabbit.printOrder(
				tiger.printOrder(
				bull.printOrder(
				mouse.getOrder())))))))))));
		
		pig.printSexagenarycycle(
				dog.printSexagenarycycle(
				chicken.printSexagenarycycle(
				monkey.printSexagenarycycle(
				sheep.printSexagenarycycle(
				horse.printSexagenarycycle(
				snake.printSexagenarycycle(
				dragon.printSexagenarycycle(
				rabbit.printSexagenarycycle(
				tiger.printSexagenarycycle(
				bull.printSexagenarycycle(
				mouse.getSexagenaryCycle())))))))))));

	}

}
