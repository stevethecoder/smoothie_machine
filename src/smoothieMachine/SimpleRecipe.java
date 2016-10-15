package smoothieMachine;

import java.util.Collection;

public class SimpleRecipe {
	String name;
	Collection<String[]> ingredients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<String[]> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Collection<String[]> ingredients) {
		this.ingredients = ingredients;
	}
	
	public SimpleRecipe buildRecipe(String[] items){
		SimpleRecipe recipe = new SimpleRecipe();
		recipe.setName(items[0]);
		
		
		return recipe;
	}
	

}
