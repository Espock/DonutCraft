package net.donutcraft.mod.armor;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BaconArmor extends ItemArmor{

	public BaconArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(DonutCraft.donutcraftTab);
		

		if(slot == 0){
			this.setTextureName(DonutCraft.modid + ":BaconHelm");
		}else if (slot == 1){
			this.setTextureName(DonutCraft.modid + ":BaconChest");
		}else if (slot == 2){
			this.setTextureName(DonutCraft.modid + ":BaconLegs");
		}else if (slot == 3){
			this.setTextureName(DonutCraft.modid + ":BaconBoots"); 
			}
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if (itemstack.getItem() == DonutCraft.BaconHelm || itemstack.getItem() == DonutCraft.BaconChest || itemstack.getItem() == DonutCraft.BaconBoots) {
				return DonutCraft.modid +":textures/model/armor/Bacon_layer_1.png";
		} else if (itemstack.getItem() == DonutCraft.BaconLegs) {
			return DonutCraft.modid +":textures/model/armor/Bacon_layer_2.png";}
		else{
			return null;
			
		}
	}
}