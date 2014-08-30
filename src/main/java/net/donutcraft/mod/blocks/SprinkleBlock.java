package net.donutcraft.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class SprinkleBlock extends Block {

	public SprinkleBlock(Material material) {
		super(material);
		
		this.setStepSound(soundTypeMetal);
	}

}
