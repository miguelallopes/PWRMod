package com.pwrscript.pwrmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LogoBlock extends Block {

    public LogoBlock() {
        super(Block.Properties.create(Material.SHULKER).lightValue(15).hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.SLIME));
    }
}
