package dev.mucks.tutorialmod.data;

import java.util.concurrent.CompletableFuture;

import dev.mucks.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class ModWorldGenerator extends FabricDynamicRegistryProvider {

    public ModWorldGenerator(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return TutorialMod.MOD_ID;
    }

    @Override
    protected void configure(WrapperLookup registries, Entries entries) {
        // Here goes future world gen!
    }

}
