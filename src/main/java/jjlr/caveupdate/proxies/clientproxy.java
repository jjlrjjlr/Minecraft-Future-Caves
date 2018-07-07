package jjlr.caveupdate.proxies;

import jjlr.caveupdate.references;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.util.ResourceLocation;

public class clientproxy extends commonproxy {

	/*
	 * Used to render items in game.
	 */
	public void registerItemRenderer(Item item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(references.MODID + ":" + id, "inventory"));
	}
	
}
