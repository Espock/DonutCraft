package net.donutcraft.mod.foodSprinkleDonut;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class foodDonutSprinkleDonut extends ItemFood {

	public foodDonutSprinkleDonut(int heal, float saturation, boolean wolfmeat) {
		super(3, 8, false);
		
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));

	}

}