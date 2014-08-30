package net.donutcraft.mod.foodRawBacon;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class FoodRawBacon extends ItemFood {

	public FoodRawBacon(int heal, float saturation, boolean wolfmeat) {
		super(3, 4, wolfmeat);
		
		this.setPotionEffect(9, 30, 0, 1F);

		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
