package gtfoaddn.common;

import gregtech.api.unification.material.event.MaterialEvent;
import gtfoaddn.api.GTFOAddnValues;
import gtfoaddn.api.unification.material.GTFOAddnMaterials;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GTFOAddnValues.MODID)
public class GTFOAddnEventHandlers {

    public GTFOAddnEventHandlers() {}

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterialsHigh(MaterialEvent event) {
        //GTFOAddnMaterials.registerMaterialsHigh();
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerMaterialsLow(MaterialEvent event) {
        GTFOAddnMaterials.registerMaterialsLow();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerMaterialsLowest(MaterialEvent event) {
        //GTFOAddnMaterials.registerMaterialsLowest();
    }
}
