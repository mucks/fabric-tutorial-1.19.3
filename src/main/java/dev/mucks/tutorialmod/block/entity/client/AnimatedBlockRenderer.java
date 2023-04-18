package dev.mucks.tutorialmod.block.entity.client;

import dev.mucks.tutorialmod.block.entity.AnimatedBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class AnimatedBlockRenderer extends GeoBlockRenderer<AnimatedBlockEntity> {

    public AnimatedBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new AnimatedBlockModel());
    }

}
