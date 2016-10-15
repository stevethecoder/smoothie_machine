package smoothieMachine;

public class Main {

	public static void main(String[] args) {
		
		
		Recipe smoothie = new Recipe ("Just because");
		smoothie.addFruit(new Cherries());
		smoothie.addFruit(new Peach());
		smoothie.addFruit(new Orange());
		smoothie.addFruit(new Grapefruit());
		
		Cherries Cherries = new Cherries();
		Peach Peach = new Peach();
		Orange Orange = new Orange();
		Grapefruit Grapefruit = new Grapefruit();
		
		System.out.println(Cherries.getName());
		System.out.println(Peach.getName());
		System.out.println(Orange.getName());
		System.out.println(Grapefruit.getName());
	}
		
	
}
