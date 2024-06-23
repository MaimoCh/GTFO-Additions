package gtfoaddn.loaders.recipe;

import gtfoaddn.recipe.GTFOAddnRecipeMaps;

import static gregtech.api.GTValues.*;
import static gtfoaddn.api.unification.material.GTFOAddnMaterials.*;

public class GTFOAddnFuelRecipes {

    public static void registerFuels() {
        // steam generator fuels
        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(LiquidNutrition.getFluid(1))
                .duration(20)
                .EUt((int) V[LV])
                .buildAndRegister();
        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(AdvancedLiquidNutrition.getFluid(1))
                .duration(20)
                .EUt((int) V[IV])
                .buildAndRegister();
    }
}