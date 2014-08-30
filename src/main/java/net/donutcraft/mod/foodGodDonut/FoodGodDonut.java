package net.donutcraft.mod.foodGodDonut;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class FoodGodDonut extends ItemFood {

	public FoodGodDonut(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
		this.setPotionEffect(10, 180, 1, 1F);
		
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
		

}
