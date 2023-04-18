package dev.mucks.tutorialmod.block;

import dev.mucks.tutorialmod.TutorialMod;
import dev.mucks.tutorialmod.block.custom.AnimatedBlock;
import dev.mucks.tutorialmod.item.ModItemGroup;
import dev.mucks.tutorialmod.world.tree.RedMapleSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

        public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
                        new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block CITRINE_ORE = registerBlock("citrine_ore",
                        new ExperienceDroppingBlock(
                                        FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                                        UniformIntProvider.create(2, 6)),
                        ModItemGroup.CITRINE);

        public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
                        new ExperienceDroppingBlock(
                                        FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                                        UniformIntProvider.create(2, 6)),
                        ModItemGroup.CITRINE);

        // Read Maple

        public static final Block RED_MAPLE_LOG = registerBlock("red_maple_log",
                        new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block RED_MAPLE_WOOD = registerBlock("red_maple_wood",
                        new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
                        new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f)
                                        .requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
                        new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f)
                                        .requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block RED_MAPLE_PLANKS = registerBlock("red_maple_planks",
                        new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
                        new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
                        new SaplingBlock(new RedMapleSaplingGenerator(),
                                        FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()),
                        ModItemGroup.CITRINE);

        public static final Block ANIMATED_BLOCK = Registry.register(
                        Registries.BLOCK,
                        new Identifier(TutorialMod.MOD_ID, "animated_block"),
                        new AnimatedBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()
                                        .nonOpaque()));

        private static Block registerBlock(String name, Block block, ItemGroup group) {
                registerBlockItem(name, block, group);
                return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block, ItemGroup group) {
                Item item = Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                                new BlockItem(block, new FabricItemSettings()));

                ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));

                return item;
        }

        public static void registerModBlocks() {
                TutorialMod.LOGGER.info("Registering mod blocks");
        }

}
