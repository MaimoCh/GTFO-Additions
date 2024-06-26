package gtfoaddn.core;

import gregtech.loaders.recipe.GTRecipeManager;
import gregtech.loaders.recipe.RecyclingRecipes;
import gtfoaddn.api.GTFOAddnValues;
import gtfoaddn.api.modules.GTFOAddnModule;
import gtfoaddn.api.modules.IGTFOAddnModule;
import gtfoaddn.client.renderer.texture.GTFOAddnTextures;
import gtfoaddn.common.CommonProxy;
import gtfoaddn.common.items.GTFOAddnMetaItems;
import gtfoaddn.common.metatileentities.GTFOAddnMetaTileEntities;
import gtfoaddn.loaders.GTFOAddnRecipeManager;
import gtfoaddn.loaders.recipe.GTFOAddnFuelRecipes;
import gtfoaddn.loaders.recipe.GTFOAddnLiquidNutritonRecipes;
import gtfoaddn.modules.GTFOAddnModules;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static gregtech.api.GregTechAPI.MTE_REGISTRY;

@GTFOAddnModule(
           moduleID = GTFOAddnModules.MODULE_CORE,
           containerID = GTFOAddnValues.MODID,
           name = "GTFOAddn Core",
           description = "Core GTFOAddn content.",
           coreModule = true)
public class GTFOAddnCoreModule implements IGTFOAddnModule {

    public static final Logger logger = LogManager.getLogger("GTFO Additions");

    @SidedProxy(modId = GTFOAddnValues.MODID,
                clientSide = "gtfoaddn.client.ClientProxy",
                serverSide = "gtfoaddn.common.CommonProxy")
    public static CommonProxy proxy;

    @Override
    public @NotNull Logger getLogger() {
        return logger;
    }

    @Override
    public void construction(FMLConstructionEvent event) {}

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        //GTFOAddnMetaBlocks.init();
        GTFOAddnMetaItems.init();
        GTFOAddnTextures.init();
        //GTFOAddnToolItems.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        GTFOAddnRecipeManager.load();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        RecyclingRecipes.init();
    }

    @Override
    public void registerBlocks(RegistryEvent.Register<Block> event) {
    }

    @Override
    public void registerItems(RegistryEvent.Register<Item> event) {
    }

    @Override
    public void registerRecipesNormal(RegistryEvent.Register<IRecipe> event) {
        //GTFOAddnToolRecipeHandler.register();
        //GTFOAddnMaterialInfoLoader.init();
        //GTFOAddnOreDictionaryLoader.init();
        GTFOAddnMetaTileEntities.init();
    }

    @Override
    public void registerRecipesLowest(RegistryEvent.Register<IRecipe> event) {
        //GTFOAddnRecipe.init();
        //GTFOAddnWoodRecipe.init();
        GTFOAddnFuelRecipes.registerFuels();
        GTFOAddnLiquidNutritonRecipes.init();
        //CEUOverrideRecipe.init();
        //VanillaOverrideRecipes.init();
    }
}
