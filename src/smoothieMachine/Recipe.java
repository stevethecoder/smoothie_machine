package smoothieMachine;

import java.util.ArrayList;
import java.util.Collection;

public class Recipe {

	final String name;
	final Collection<Fruit> fruitIngredients;

	public Recipe(String name) {
		this.name = name;
		fruitIngredients = new ArrayList<>();

	}

	public Recipe(String name, Collection<Fruit> fruit) {
		this.name = name;
		fruitIngredients = fruit;

	}

	public void addFruit(Fruit fruit) {
		fruitIngredients.add(fruit);
	}

	public void addFruit(Cherries cherries) {
		
	}

	public void addFruit(Peach peach) {
		
	}

	public void addFruit(Orange orange) {
		
	}

	public void addFruit(Grapefruit grapefruit) {
		
	}
	
}
