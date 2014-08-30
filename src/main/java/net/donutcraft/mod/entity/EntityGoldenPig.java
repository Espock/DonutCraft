package net.donutcraft.mod.entity;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class EntityGoldenPig extends EntityMob  {

	public EntityGoldenPig(World world) {
		super(world);
	}
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.5D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(35.0D);
	        //this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(5.0D);
	    }

}
