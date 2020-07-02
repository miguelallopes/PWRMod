package com.pwrscript.pwrmod.util;

import com.pwrscript.pwrmod.PWRMod;
import com.pwrscript.pwrmod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PWRMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // PWRMod Items
    public static final RegistryObject<Item> LOGO = ITEMS.register("logo", ItemBase::new);
}
