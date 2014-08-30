package net.donutcraft.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.donutcraft.mod.DonutCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class DonutOre extends Block {

	public DonutOre(Material material) {
		super(material);
		
		this.setHardness(10F);
		this.setResistance(8.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(DonutCraft.donutcraftTab);

	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
