package com.toltonic.graymod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LavaWand extends Item {

    private int mana;
	private int manaAdded;

    public LavaWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        BlockPos pos = context.getBlockPos().offset(context.getSide());
		Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

		if(mana >= 1){
				if(!world.isClient){
						world.setBlockState(pos, Blocks.LAVA.getDefaultState());

						mana--;

				}
		}else if(!world.isClient && clickedBlock == Blocks.DIAMOND_BLOCK){
				addMana(1);
		}else if(mana == 0){
				mana = 0;
		}

        return super.useOnBlock(context);
    }


	public int getMana(){
			
		return mana;
    }

	public int addMana(int manaAdded){
			mana = mana + manaAdded;
			return mana;
	}

}
