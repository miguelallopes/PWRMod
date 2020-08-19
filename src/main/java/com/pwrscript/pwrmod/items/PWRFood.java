package com.pwrscript.pwrmod.items;

import com.pwrscript.pwrmod.PWRMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PWRFood extends Item {
    public PWRFood() {
        super(new Item.Properties().group(PWRMod.TAB).food(new Food.Builder().hunger(10).saturation(2.0f).effect(new EffectInstance(Effects.INSTANT_HEALTH,40,1),0.75f).effect(new EffectInstance(Effects.NIGHT_VISION,200,1),0.6f).effect(new EffectInstance(Effects.SPEED,300,2),0.5f).effect(new EffectInstance(Effects.JUMP_BOOST,310,2),0.4f).effect(new EffectInstance(Effects.INVISIBILITY,1000,1),0.3f).effect(new EffectInstance(Effects.LUCK,200,2),0.3f).effect(new EffectInstance(Effects.MINING_FATIGUE,1500,1),0.1f).setAlwaysEdible().build()));
    }
}

