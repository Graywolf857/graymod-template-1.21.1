package com.toltonic.graymod.item.custom;


import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

import net.minecraft.world.World;


public class TreeWand extends Item {
    public TreeWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(clickedBlock == Blocks.DIRT || clickedBlock == Blocks.GRASS_BLOCK) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), Blocks.OAK_SAPLING);
            }
        }

        return super.useOnBlock(context);
    }

}

