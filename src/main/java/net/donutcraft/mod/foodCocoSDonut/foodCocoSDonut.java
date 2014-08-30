package net.donutcraft.mod.foodCocoSDonut;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class foodCocoSDonut extends ItemFood {

	public foodCocoSDonut(int heal, float saturation, boolean wolfmeat) {
		super(3, 8, false);
		
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));

	}

}