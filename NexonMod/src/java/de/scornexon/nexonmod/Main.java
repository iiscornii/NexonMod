package de.scornexon.nexonmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION)
public class Main {
	
	public static final String MODID = "nexonmod";
	public static final String MODNAME = "Nexon Mod";
	public static final String MODVERSION = "0.0.1";
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(serverSide = "de.scornexon.nexonmod.CommonProxy", clientSide = "de.scornexon.nexonmod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
}
