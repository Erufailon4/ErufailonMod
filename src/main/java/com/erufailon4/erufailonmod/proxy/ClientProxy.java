package com.erufailon4.erufailonmod.proxy;

import com.erufailon4.erufailonmod.ErufailonMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ErufailonMod.MODID + ":" + id, "inventory"));
    }

}
