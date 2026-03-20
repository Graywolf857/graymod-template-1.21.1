package com.toltonic.graymod.item;

import com.toltonic.graymod.GrayMod;
import com.toltonic.graymod.item.custom.TreeWand;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LAVA_WAND = registerItem("lava_wand", new Item(new Item.Settings()));

    public static final Item TREE_WAND = registerItem("tree_wand", new TreeWand(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GrayMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        GrayMod.LOGGER.info("Registering Mod Items for " + GrayMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(LAVA_WAND);
            entries.add(TREE_WAND);



        });


    }

}
