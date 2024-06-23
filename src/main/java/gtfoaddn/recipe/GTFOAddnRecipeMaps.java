package gtfoaddn.recipe;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.FuelRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.gtfoaddn.recipe.GTFOAddnRecipeMaps")
@ZenRegister
public final class GTFOAddnRecipeMaps {

    @ZenProperty
    public static final RecipeMap<FuelRecipeBuilder> BURNING_GENERATOR_FUELS = new RecipeMap<>(
            "burning_generator", 0, 0, 1, 0, new FuelRecipeBuilder(), false)
                .setSlotOverlay(false, true, GuiTextures.FURNACE_OVERLAY_2)
                .allowEmptyOutput()
                .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.COMBUSTION);
}
