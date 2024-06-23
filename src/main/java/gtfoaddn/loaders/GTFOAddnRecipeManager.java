package gtfoaddn.loaders;

import gtfoaddn.common.items.GTFOAddnMetaItems;
import gtfoaddn.loaders.recipe.GTFOAddnMachineRecipeLoader;

public class GTFOAddnRecipeManager {

    private GTFOAddnRecipeManager() {}

    public static void preLoad() {}

    public static void load() {
        GTFOAddnMachineRecipeLoader.init();
        GTFOAddnMetaItems.init();
    }

    public static void loadLow() {
    }

    public static void loadLowest() {
    }
}
