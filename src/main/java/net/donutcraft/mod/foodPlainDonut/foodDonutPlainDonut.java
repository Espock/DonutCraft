package net.donutcraft.mod.foodPlainDonut;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class foodDonutPlainDonut extends ItemFood {

	public foodDonutPlainDonut(int heal, float saturation, boolean wolfmeat) {
		super(6, 4, false);
		
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
