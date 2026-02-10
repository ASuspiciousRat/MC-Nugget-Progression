package net.suspiciousrat.rawnuggets.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.suspiciousrat.rawnuggets.item.ModItems;
import net.suspiciousrat.rawnuggets.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.NUGGETS)
                .add(ModItems.COPPER_NUGGET)
                .add(ModItems.RAW_COPPER_NUGGET)
                .add(ModItems.RAW_GOLD_NUGGET)
                .add(ModItems.RAW_IRON_NUGGET);
    }
}