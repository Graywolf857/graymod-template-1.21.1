package com.toltonic.graymod.item.custom;


import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class TreeWand extends WandItem {

    public TreeWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos().offset(context.getSide());
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(clickedBlock == Blocks.DIRT || clickedBlock == Blocks.GRASS_BLOCK) {
            if(!world.isClient()) {
                world.setBlockState(pos, Blocks.OAK_SAPLING.getDefaultState());

            }
        }

        return super.useOnBlock(context);
    }

}

