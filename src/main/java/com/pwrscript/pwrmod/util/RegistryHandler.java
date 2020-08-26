package com.pwrscript.pwrmod.util;

import com.pwrscript.pwrmod.PWRMod;
import com.pwrscript.pwrmod.blocks.BlockItemBase;
import com.pwrscript.pwrmod.blocks.PWRBlock;
import com.pwrscript.pwrmod.items.PWRCard;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PWRMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PWRMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // PWRMod Items
    public static final RegistryObject<Item> PWR_CARD = ITEMS.register("pwr_card", PWRCard::new);

    // PWRMod Blocks
    public static final RegistryObject<Block> PWR_BLOCK = BLOCKS.register("pwr_block", PWRBlock::new);

    // PWRMod Blocks Items
    public static final RegistryObject<Item> PWR_BLOCK_ITEM = ITEMS.register("pwr_block",() -> new BlockItemBase(PWR_BLOCK.get()));
}
