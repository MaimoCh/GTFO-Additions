package gtfoaddn.api.unification.material.materials;

import gregtech.api.unification.material.Material;

import static gtfoaddn.api.unification.material.GTFOAddnMaterials.*;
import static gtfoaddn.api.util.GTFOAddnUtility.gtfoaddnId;

public class GTFOAddnFirstDegreeMaterials {
    public static void init() {

        FoodExtract = new Material.Builder(31001, gtfoaddnId("food_extract"))
                .fluid().color(0xFFF404).build();

    }
}
