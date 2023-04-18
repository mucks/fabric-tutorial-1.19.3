package dev.mucks.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import software.bernie.geckolib.GeckoLib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.mucks.tutorialmod.block.ModBlocks;
import dev.mucks.tutorialmod.block.ModFlammableBlockRegistry;
import dev.mucks.tutorialmod.block.entity.ModBlockEntities;
import dev.mucks.tutorialmod.entity.ModEntities;
import dev.mucks.tutorialmod.entity.custom.TigerEntity;
import dev.mucks.tutorialmod.item.ModItemGroup;
import dev.mucks.tutorialmod.item.ModItems;
import dev.mucks.tutorialmod.world.gen.ModWorldGeneration;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	public static final String MOD_ID = "tutorialmod";

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		ModBlockEntities.registerAllBlockEntities();

		GeckoLib.initialize();

		ModFlammableBlockRegistry.registerFlammableBlocks();

		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);

		FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());

	}
}
