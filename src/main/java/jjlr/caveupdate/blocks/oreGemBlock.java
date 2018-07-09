package jjlr.caveupdate.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreGemBlock extends basicBlock {

	public oreGemBlock(String name, Material material, float resistance, float hardness) {
		
		super(name, material);
		
		setHardness(hardness);
		setResistance(resistance);
		
		/* Debug start
		if(Config.debugStatus == true) {
			System.out.println(references.MODID + ": " + name + " created.");
		}
		Debug end */
	}
	
	@Override
	public oreGemBlock setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}
}
