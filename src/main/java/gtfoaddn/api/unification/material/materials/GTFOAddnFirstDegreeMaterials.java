package gtfoaddn.api.unification.material.materials;

import gregtech.api.unification.material.Material;

import static gtfoaddn.api.unification.material.GTFOAddnMaterials.*;
import static gtfoaddn.api.util.GTFOAddnUtility.gtfoaddnId;

public class GTFOAddnFirstDegreeMaterials {
    public static void init() {

        LiquidNutrition = new Material.Builder(31001, gtfoaddnId("liquid_nutrition"))
                .fluid().color(0xFFF455).build();
        AdvancedLiquidNutrition = new Material.Builder(31002, gtfoaddnId("advanced_liquid_nutrition"))
                .fluid().color(0xFFC700).build();
    }
}
