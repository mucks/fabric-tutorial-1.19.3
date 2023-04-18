package dev.mucks.tutorialmod.block.entity;

import dev.mucks.tutorialmod.TutorialMod;
import dev.mucks.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<AnimatedBlockEntity> ANIMATED_BLOCK_ENTITY;

    public static void registerAllBlockEntities() {
        ANIMATED_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(TutorialMod.MOD_ID, "animated_block_entity"),
                FabricBlockEntityTypeBuilder.create(AnimatedBlockEntity::new, ModBlocks.ANIMATED_BLOCK).build());
    }

}
