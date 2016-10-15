package smoothieMachine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ReadRecipes {

	public static void main(String[] args) {
		ReadRecipes readRecipes = new ReadRecipes();
	
		final Collection<Recipe> recipes = readRecipes.loadRecipes("recipes.csv");
		
		System.out.println(recipes);
	}
		
		//System.out.println(recipeFile.getAbsolutePath());
		
		public Collection<Recipe> loadRecipes(String filename){
			final File recipeFile = new File(filename);
			final Collection<Recipe> recipes = new ArrayList<>();

		final InputStream recipeStream;
		try {
			recipeStream = new FileInputStream(recipeFile);
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file " + recipeFile.getAbsolutePath());
			return recipes;
		}

		try (Scanner input = new Scanner(recipeStream)) {
			while(input.hasNext()) {
				String[] items = input.nextLine().split(",");
				recipes.add( buildRecipe (items));

				
				//System.out.println(input.nextLine());
			}
		//}
		//System.out.println(recipes);
			
	}
		return recipes;
		
}

		public Recipe buildRecipe(String[] items) {
			Recipe recipe = new Recipe(items[0]);

			for(int i=1; i< items.length; i++){
				recipe.addFruit( createFruit( items[i]));
				
			}
		
		return recipe;
}

		public Fruit createFruit(String fruitName) {
			if("Cherries".equalsIgnoreCase(fruitName)){
				return new Cherries();
			} else if ("Grapefruit".equalsIgnoreCase(fruitName)){
				return new Grapefruit();
			} else if ("Orange".equalsIgnoreCase(fruitName)){
				return new Orange();
			} else if ("Peach".equalsIgnoreCase(fruitName)){
				return new Peach();
			}
			return null;
		}
		
		
}


