package com.toltonic.graymod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LavaWand extends Item {

    public LavaWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        BlockPos pos = context.getBlockPos().offset(context.getSide());

        if(!world.isClient){
            world.setBlockState(pos, Blocks.LAVA.getDefaultState());
        }
        return super.useOnBlock(context);
    }
}
