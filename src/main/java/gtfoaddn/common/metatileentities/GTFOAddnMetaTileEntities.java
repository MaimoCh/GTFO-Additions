package gtfoaddn.common.metatileentities;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.metatileentities.electric.MetaTileEntitySingleCombustion;
import gtfoaddn.api.util.GTFOAddnLog;
import gtfoaddn.client.renderer.texture.GTFOAddnTextures;
import gtfoaddn.common.metatileentities.electric.MetaTileEntitySingleBurning;
import gtfoaddn.recipe.GTFOAddnRecipeMaps;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;
import static gtfoaddn.api.util.GTFOAddnUtility.gtfoaddnId;

public class GTFOAddnMetaTileEntities {
    //generators
    public static final SimpleGeneratorMetaTileEntity[] FAT_BURNING_GENERATOR = new SimpleGeneratorMetaTileEntity[6];

    //Simple Machines
    public static final SimpleMachineMetaTileEntity[] NUTRITION_EXTRACTOR = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

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

        //Generators 31000~31099
        FAT_BURNING_GENERATOR[0] = registerMetaTileEntity(31000,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.lv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 1,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[1] = registerMetaTileEntity(31001,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.mv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 2,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[2] = registerMetaTileEntity(31002,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.hv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 3,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[3] = registerMetaTileEntity(31003,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.ev"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 4,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[4] = registerMetaTileEntity(31004,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.iv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 5,
                        GTUtility.genericGeneratorTankSizeFunction));
        FAT_BURNING_GENERATOR[5] = registerMetaTileEntity(31005,
                new MetaTileEntitySingleBurning(gtfoaddnId("fat_burning_generator.luv"),
                        GTFOAddnRecipeMaps.BURNING_GENERATOR_FUELS, GTFOAddnTextures.FAT_BURNING_GENERATOR_OVERLAY, 6,
                        GTUtility.genericGeneratorTankSizeFunction));

        //Simple Machines 32000~32099
        registerSimpleMetaTileEntity(NUTRITION_EXTRACTOR, 305, "nutrition_extractor", GTFOAddnRecipeMaps.NUTRITION_EXTRACTOR_RECIPES,
                Textures.EXTRACTOR_OVERLAY, true,gtfoaddnId("nutrition_extractor"), GTUtility.hvCappedTankSizeFunction);
    }
}