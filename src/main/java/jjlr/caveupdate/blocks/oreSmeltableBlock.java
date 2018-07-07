package jjlr.caveupdate.blocks;

/*
 * Created by jjlr ; 6/25/2018 5:46 AM UTC
 * Currently unused;
 */

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreSmeltableBlock extends basicBlock {

	public oreSmeltableBlock(String name, Material material, float resistance, float hardness) {
		
		super(name, material);
		
		setHardness(hardness);
		setResistance(resistance);
	}
	
	@Override
	public oreSmeltableBlock setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}
	
}
