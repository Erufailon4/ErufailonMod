package com.erufailon4.erufailonmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ErufailonMod.MODID, name = ErufailonMod.NAME, version = ErufailonMod.VERSION)
public class ErufailonMod {

    public static final String MODID = "erufailonmod";
    public static final String NAME = "ErufailonMod";
    public static final String VERSION = "0.1.0";

    @Mod.Instance(MODID)
    public static ErufailonMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(NAME + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
