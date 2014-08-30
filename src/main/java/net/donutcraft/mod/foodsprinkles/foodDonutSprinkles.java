package net.donutcraft.mod.foodsprinkles;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.item.ItemFood;

public class foodDonutSprinkles extends ItemFood {

	public foodDonutSprinkles(int heal, float saturation, boolean wolfmeat) {
		super(1, 2, false);
		
		this.setPotionEffect(1, 30, 0, 1F);this.setPotionEffect(8, 30, 0, 1F);
		
		this.setTextureName(DonutCraft.modid + ":" + this.getUnlocalizedName().substring(5));

	}

}
