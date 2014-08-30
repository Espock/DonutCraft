package net.donutcraft.mod.armor;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class DonutArmor extends ItemArmor{

	public DonutArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(DonutCraft.donutcraftTab);
		

		if(slot == 0){
			this.setTextureName(DonutCraft.modid + ":DonutHelm");
		}else if (slot == 1){
			this.setTextureName(DonutCraft.modid + ":DonutChest");
		}else if (slot == 2){
			this.setTextureName(DonutCraft.modid + ":DonutLegs");
		}else if (slot == 3){
			this.setTextureName(DonutCraft.modid + ":DonutBoots"); 
			}
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if (itemstack.getItem() == DonutCraft.DonutHelm || itemstack.getItem() == DonutCraft.DonutChest || itemstack.getItem() == DonutCraft.DonutBoots) {
				return DonutCraft.modid +":textures/model/armor/Donut_layer_1.png";
		} else if (itemstack.getItem() == DonutCraft.DonutLegs) {
			return DonutCraft.modid +":textures/model/armor/Donut_layer_2.png";}
		else{
			return null;
			
		}
	}
}