package com.pwrscript.pwrmod;

import com.pwrscript.pwrmod.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("pwrmod")
public class PWRMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "pwrmod";

    public PWRMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doChatPostProcessing);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    private void doChatPostProcessing(final ServerChatEvent event) {

    }


    public static final ItemGroup TAB = new ItemGroup("PWRTab") {
        @Override
        public ItemStack createIcon() {
                return new ItemStack(RegistryHandler.PWR_BLOCK.get());
            }

    };
}
