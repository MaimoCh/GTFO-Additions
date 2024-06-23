package gtfoaddn.loaders.recipe;

import gtfoaddn.recipe.GTFOAddnRecipeMaps;

import static gregtech.api.GTValues.LV;
import static gregtech.api.GTValues.V;
import static gtfoaddn.api.unification.material.GTFOAddnMaterials.*;

public class GTFOAddnFuelRecipes {

    public static void registerFuels() {
        // steam generator fuels
        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(FoodExtract.getFluid(1))
                .duration(1)
                .EUt((int) V[LV])
                .buildAndRegister();

    }
}