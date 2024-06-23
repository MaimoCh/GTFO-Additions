package gtfoaddn.common.metatileentities;

import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.metatileentities.electric.MetaTileEntitySingleCombustion;
import gtfoaddn.api.util.GTFOAddnLog;
import gtfoaddn.client.renderer.texture.GTFOAddnTextures;
import gtfoaddn.common.metatileentities.electric.MetaTileEntitySingleBurning;
import gtfoaddn.recipe.GTFOAddnRecipeMaps;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gtfoaddn.api.util.GTFOAddnUtility.gtfoaddnId;

public class GTFOAddnMetaTileEntities {
    //generators
    public static final SimpleGeneratorMetaTileEntity[] FAT_BURNING_GENERATOR = new SimpleGeneratorMetaTileEntity[4];

    public static void init() {
        GTFOAddnLog.logger.info("Registering MetaTileEntities");
        /*
         * FOR ADDON DEVELOPERS:
         *
         * GTCEu will not take more than 2000 IDs. Anything past ID 1999
         * is considered FAIR GAME, take whatever you like.
         *
         * If you would like to reserve IDs, feel free to reach out to the
         * development team and claim a range of IDs! We will mark any
         * claimed ranges below this comment. Max value is 32767.
         *
         * - Gregicality / Shadows of Greg: 2000-3999
         * - Reserved for Integration Modules in GTCEu: 4000-4499
         * - GregTech Food Option: 8500-8999
         * - HtmlTech: 9000-9499
         * - PCM's Ore Addon: 9500-9999
         * - GCM: 10000-10099
         * - MechTech: 10100-10499
         * - MBT 10500 - 10999
         * - CT(MBT) 32000 - ~
         * - FREE RANGE 11000-32767
         */

        FAT_BURNING_GENERATOR[0] = registerMetaTileEntity(31001,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.lv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 1,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[1] = registerMetaTileEntity(31002,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.mv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 2,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[2] = registerMetaTileEntity(31003,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.hv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 3,
                        GTUtility.genericGeneratorTankSizeFunction));
    }
}