package jjlr.caveupdate.items;

import jjlr.caveupdate.caveUpdateMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class basicItem extends Item {
	
	protected String name;

	public basicItem(String name, String modid) {
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	// Register item renderer with proxy.
	public void registerItemModel() {
		
		caveUpdateMain.proxy.registerItemRenderer(this, 0, name);
		
	}
	
	// Set creative tab.
	@Override
	public basicItem setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}

}
