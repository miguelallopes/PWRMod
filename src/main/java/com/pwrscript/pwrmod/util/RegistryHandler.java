package com.pwrscript.pwrmod.util;

import com.pwrscript.pwrmod.PWRMod;
import com.pwrscript.pwrmod.blocks.BlockItemBase;
import com.pwrscript.pwrmod.blocks.LogoBlock;
import com.pwrscript.pwrmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PWRMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PWRMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // PWRMod Items
    public static final RegistryObject<Item> LOGO = ITEMS.register("logo", ItemBase::new);

    // PWRMod Blocks
    public static final RegistryObject<Block> LOGO_BLOCK = BLOCKS.register("logo_block", LogoBlock::new);

    // PWRMod Blocks Items
    public static final RegistryObject<Item> LOGO_BLOCK_ITEM = ITEMS.register("logo_block",() -> new BlockItemBase(LOGO_BLOCK.get()));
}
