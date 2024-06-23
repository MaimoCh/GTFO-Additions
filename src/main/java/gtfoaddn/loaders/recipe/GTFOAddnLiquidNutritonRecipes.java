package gtfoaddn.loaders.recipe;

import gregtechfoodoption.item.GTFOMetaItem;

import static gtfoaddn.api.unification.material.GTFOAddnMaterials.*;
import static gtfoaddn.recipe.GTFOAddnRecipeMaps.NUTRITION_EXTRACTOR_RECIPES;


public class GTFOAddnLiquidNutritonRecipes {

    public static void init(){
        NUTRITION_EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(GTFOMetaItem.OLIVE.getStackForm())
                .fluidOutputs(LiquidNutrition.getFluid(1))
                .duration(20).EUt(30).buildAndRegister();
    }
}
