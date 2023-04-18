package dev.mucks.tutorialmod.item.client;

import dev.mucks.tutorialmod.item.custom.AnimatedBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedBlockItemRenderer extends GeoItemRenderer<AnimatedBlockItem> {

    public AnimatedBlockItemRenderer() {
        super(new AnimatedBlockItemModel());
    }

}
