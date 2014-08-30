package net.donutcraft.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.donutcraft.mod.DonutCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class DonutAxe extends ItemAxe {

	public DonutAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);

	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
