package net.donutcraft.mod.foodCookedBacon;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class FoodCookedBacon extends ItemFood {

	public FoodCookedBacon(int heal, float saturation, boolean wolfmeat) {
		super(10, 6, false);
		
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));

	}

}
