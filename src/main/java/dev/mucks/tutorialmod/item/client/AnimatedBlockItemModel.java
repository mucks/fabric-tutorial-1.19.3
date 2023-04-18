package dev.mucks.tutorialmod.item.client;

import dev.mucks.tutorialmod.TutorialMod;
import dev.mucks.tutorialmod.item.custom.AnimatedBlockItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockItemModel extends GeoModel<AnimatedBlockItem> {

    @Override
    public Identifier getModelResource(AnimatedBlockItem animatable) {
        return new Identifier(TutorialMod.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockItem animatable) {
        return new Identifier(TutorialMod.MOD_ID, "textures/block/animated_block.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockItem animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/animated_block.animation.json");
    }

}
