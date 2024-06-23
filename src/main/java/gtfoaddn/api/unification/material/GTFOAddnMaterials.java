package gtfoaddn.api.unification.material;

import gregtech.api.unification.material.Material;
import gtfoaddn.api.unification.material.materials.GTFOAddnFirstDegreeMaterials;

public class GTFOAddnMaterials {

    public static Material LiquidNutrition;
    public static Material AdvancedLiquidNutrition;

    public static void registerMaterialsLow() {
        GTFOAddnFirstDegreeMaterials.init(); // 31001 - 31100
    }

}
