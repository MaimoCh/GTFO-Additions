package gtfoaddn.common;

import gtfoaddn.api.GTFOAddnValues;
import gtfoaddn.loaders.GTFOAddnRecipeManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = GTFOAddnValues.MODID)
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {}
}
