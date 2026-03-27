package com.toltonic.graymod.item.custom;

import net.minecraft.item.Item;

public class WandItem extends Item {

		private int mana;

    public WandItem(Settings settings) {
        super(settings);
    }

    public static int getMana(){
			
			return mana;
		}

		public void addMana(int manaAdded){
				this.mana = mana + manaAdded;
		}

		public void removeMana(int manaRemoved){
				this.mana = mana - manaRemoved;
		}
}
