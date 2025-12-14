package com.ashlynnmods.itemmergebegone.mixin;

import net.minecraft.world.entity.item.ItemEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public class ItemEntityMixin {
	// farewell item merge
    // we're interrupting mergeWithNeighbours so that the game doesnt even look for nearby items to merge with
	// yeah screw those guys, let those items be independent
    @Inject(method = "mergeWithNeighbours", at = @At("HEAD"), cancellable = true)
    private void disableItemMerging(CallbackInfo ci) {
        ci.cancel();
    }
}