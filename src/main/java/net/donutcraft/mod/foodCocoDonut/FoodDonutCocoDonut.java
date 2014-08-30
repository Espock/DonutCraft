package net.donutcraft.mod.foodCocoDonut;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class FoodDonutCocoDonut extends ItemFood {

	public FoodDonutCocoDonut(int heal, float saturation, boolean wolfmeat) {
		super(6, 4, false);

		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
