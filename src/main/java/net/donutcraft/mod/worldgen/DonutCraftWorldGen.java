package net.donutcraft.mod.worldgen;

import java.util.Random;

import net.donutcraft.mod.DonutCraft;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class DonutCraftWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0 :
			//Generate our surface world
			generateSurface(world, random, chunkX*16, chunkZ*16);
		
		case -1 :
			//Generate our surface world
			generateNether(world, random, chunkX*16, chunkZ*16);
		
		case 1 :
			//Generate our surface world
			generateEnd(world, random, chunkX*16, chunkZ*16);
	}


		
	}

	private void generateNether(World world, Random random, int x, int z) {
		
		
	}
	

	private void generateEnd(World world, Random random, int x, int z) {

	
	}


	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(DonutCraft.orewhatever, world, random, x=blockXPos, z= blockZPos, maxX, maxZ, MaxVeinSize. chancetospawn, min Y, maxY
		this.addOreSpawn(DonutCraft.oreDonutOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 5, 38, 100);
		this.addOreSpawn(DonutCraft.oreSprinkleOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 13, 38, 100);
	
	}

	private void addOreSpawn(Block oreDonutOre, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int  maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++ ) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(oreDonutOre, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}
			
			private void addOreSpawn1(Block oreSprinkleOre, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int  maxVeinSize, int chanceToSpawn, int minY, int maxY) {
				for(int i = 0; i < chanceToSpawn; i++ ) {
					int posX = blockXPos + random.nextInt(maxX);
					int posY = minY + random.nextInt(maxY - minY);
					int posZ = blockZPos + random.nextInt(maxZ);
					(new WorldGenMinable(oreSprinkleOre, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}


}
