package gtfoaddn.recipe;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.FuelRecipeBuilder;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

import static gregtech.api.gui.GuiTextures.EXTRACTOR_OVERLAY;

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

    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> NUTRITION_EXTRACTOR_RECIPES = new RecipeMap<>(
            "nutrition_extractor", 1, 0, 0, 1, new SimpleRecipeBuilder(), false)
            .setSlotOverlay(false,false,EXTRACTOR_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_EXTRACT, ProgressWidget.MoveType.HORIZONTAL)
            .setSound(GTSoundEvents.COMPRESSOR);
}
