package com.epic312.enhanced_mushrooms.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class AlphaAbnormalsStemBlock extends AbnormalsStemBlock {
    public AlphaAbnormalsStemBlock (Supplier<Block> strippedBlock, MaterialColor verticalColor, Properties properties) {
        super(strippedBlock, verticalColor, properties);
    }

    @OnlyIn(value= Dist.CLIENT)
    @Override
    public boolean isSideInvisible(BlockState bs1, BlockState bs2, Direction side) {
        return super.isSideInvisible(bs1, bs2, side) || bs2.getBlock() == this ;
    }
}
