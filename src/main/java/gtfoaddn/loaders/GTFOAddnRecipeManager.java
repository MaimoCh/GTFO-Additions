package gtfoaddn.loaders;

import gtfoaddn.common.items.GTFOAddnMetaItems;

public class GTFOAddnRecipeManager {

    private GTFOAddnRecipeManager() {}

    public static void preLoad() {}

    public static void load() {
        GTFOAddnMetaItems.init();
    }

    public static void loadLow() {
    }

    public static void loadLowest() {
    }
}
