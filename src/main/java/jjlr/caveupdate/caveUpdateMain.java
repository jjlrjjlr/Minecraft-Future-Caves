package jjlr.caveupdate;

import java.io.File;

import jjlr.caveupdate.items.modItems;
import jjlr.caveupdate.proxies.commonproxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = references.MODID, name = references.NAME, version = references.VERSION)
public class caveUpdateMain {
	
	//Configuration
	public static File config;
	
	@Instance
	public static caveUpdateMain instance;
	
	/*
	 * Used to setup client and common proxy.
	 */
	@SidedProxy(clientSide = references.CLIENT_PROXY, serverSide = references.COMMON_PROXY)
	public static commonproxy proxy;

	
	/*
	 * Used to register items.
	 */
	@Mod.EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			modItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItem(ModelRegistryEvent event) {
			modItems.registerModels();
		}
	}
	
	
	/*
	 * Forge preInititialization.
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(references.NAME + " is starting...");
		
		//Register configuration
		configuration.registerConfig(event);
	}
	
	/*
	 * Forge Initialization.
	 */
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
	/*
	 * Forge PostInitialization.
	 */
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(references.NAME + " started successfully...");
	}
}
