package jjlr.caveupdate.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreGemBlock extends basicBlock {

	public oreGemBlock(String name, Material material, float resistance, float hardness) {
		
		super(name, material);
		
		setHardness(hardness);
		setResistance(resistance);
	}
	
	@Override
	public oreGemBlock setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}
}
