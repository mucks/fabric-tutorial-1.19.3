package dev.mucks.tutorialmod;

import dev.mucks.tutorialmod.data.ModLootTableGenerator;
import dev.mucks.tutorialmod.data.ModModelProvider;
import dev.mucks.tutorialmod.data.ModRecipeGenerator;
import dev.mucks.tutorialmod.data.ModWorldGenerator;
import dev.mucks.tutorialmod.world.ModConfiguredFeatures;
import dev.mucks.tutorialmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);

    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE,
                registerable -> ModConfiguredFeatures.bootstrap(registerable));
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE,
                registerable -> ModPlacedFeatures.bootstrap(registerable));
    }

}
