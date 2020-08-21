package com.pwrscript.pwrmod.items;

import com.pwrscript.pwrmod.PWRMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.network.play.client.CSetDifficultyPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class PWRCard extends Item {
    public PWRCard() {
        super(new Item.Properties().group(PWRMod.TAB).rarity(Rarity.EPIC).maxStackSize(1).food(new Food.Builder().hunger(10).saturation(2.0f).effect(new EffectInstance(Effects.INSTANT_HEALTH,40,1),0.75f).effect(new EffectInstance(Effects.NIGHT_VISION,200,1),0.6f).effect(new EffectInstance(Effects.SPEED,300,2),0.5f).effect(new EffectInstance(Effects.JUMP_BOOST,310,2),0.4f).effect(new EffectInstance(Effects.INVISIBILITY,1000,1),0.3f).effect(new EffectInstance(Effects.LUCK,200,2),0.3f).effect(new EffectInstance(Effects.GLOWING,1500,1),0.1f).setAlwaysEdible().build()));
    }




    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        worldIn.addParticle(ParticleTypes.EXPLOSION_EMITTER,playerIn.getPosX(),playerIn.getPosY(),playerIn.getPosZ(),1,1,1);
        worldIn.addParticle(ParticleTypes.EXPLOSION,playerIn.getPosX(),playerIn.getPosY(),playerIn.getPosZ(),1,1,1);
        worldIn.createExplosion(playerIn,playerIn.getPosX(),playerIn.getPosY(),playerIn.getPosZ(),6.0f, Explosion.Mode.BREAK);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
