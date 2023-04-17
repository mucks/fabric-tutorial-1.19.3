package dev.mucks.tutorialmod.world.gen;

import dev.mucks.tutorialmod.world.ModConfiguredFeatures;
import dev.mucks.tutorialmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep.Feature;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.FOREST),
                Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.RED_MAPLE_PLACED_KEY);
    }
}
