package gtfoaddn.api.modules;

import gregtech.api.modules.ModuleStage;
import gtfoaddn.api.util.GTFOAddnUtility;
import net.minecraft.util.ResourceLocation;

public interface IModuleManager {

    default boolean isModuleEnabled(String containerID, String moduleID) {
        return isModuleEnabled(new ResourceLocation(containerID, moduleID));
    }

    default boolean isModuleEnabled(String moduleID) {
        return isModuleEnabled(GTFOAddnUtility.gtfoaddnId(moduleID));
    }

    boolean isModuleEnabled(ResourceLocation id);

    void registerContainer(IModuleContainer container);

    IModuleContainer getLoadedContainer();

    ModuleStage getStage();

    boolean hasPassedStage(ModuleStage stage);
}
