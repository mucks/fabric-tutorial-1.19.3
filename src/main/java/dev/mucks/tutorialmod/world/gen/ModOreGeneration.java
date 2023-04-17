package dev.mucks.tutorialmod.world.gen;

import dev.mucks.tutorialmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep.Feature;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                Feature.UNDERGROUND_ORES, ModPlacedFeatures.CITRINE_ORE_PLACED_KEY);
    }

}
