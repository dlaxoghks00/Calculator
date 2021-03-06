package sonar.calculator.mod.common.recipes.machines;

import sonar.core.helpers.ValueHelper;

public class GlowstoneExtractorRecipes extends ValueHelper {

	private static final GlowstoneExtractorRecipes recipes = new GlowstoneExtractorRecipes();

	public static final ValueHelper instance() {
		return recipes;
	}

	@Override
	public void addRecipes() {
		addRecipe("dustGlowstone", 1000);
		addRecipe("glowstone", 4000);
		addRecipe("ingotGlowstone", 3000);

	}

	@Override
	public String getRecipeID() {
		return "Glowstone Values";
	}

}
