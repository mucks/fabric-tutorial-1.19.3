package dev.mucks.tutorialmod;

import dev.mucks.tutorialmod.block.ModBlocks;
import dev.mucks.tutorialmod.block.entity.ModBlockEntities;
import dev.mucks.tutorialmod.block.entity.client.AnimatedBlockRenderer;
import dev.mucks.tutorialmod.entity.ModEntities;
import dev.mucks.tutorialmod.entity.client.TigerRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_MAPLE_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);

        BlockEntityRendererFactories.register(ModBlockEntities.ANIMATED_BLOCK_ENTITY, AnimatedBlockRenderer::new);
    }

}
