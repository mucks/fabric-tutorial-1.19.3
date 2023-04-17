package dev.mucks.tutorialmod.world.tree;

import dev.mucks.tutorialmod.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class RedMapleSaplingGenerator extends SaplingGenerator {

    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random arg0, boolean arg1) {
        return ModConfiguredFeatures.RED_MAPLE_KEY;
    }

}
