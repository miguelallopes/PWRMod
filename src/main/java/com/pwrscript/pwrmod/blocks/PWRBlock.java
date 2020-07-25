package com.pwrscript.pwrmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PWRBlock extends Block {

    public PWRBlock() {
        super(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(4).hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.METAL));
    }
}
