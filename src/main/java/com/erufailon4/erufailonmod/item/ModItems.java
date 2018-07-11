package com.erufailon4.erufailonmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase mashedPotato = new ItemBase("mashed_potato").setCreativeTab(CreativeTabs.FOOD);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                mashedPotato
        );
    }

    public static void registerModels() {
        mashedPotato.registerItemModel();
    }

}
