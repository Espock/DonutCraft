package net.donutcraft.mod;

import net.donutcraft.mod.armor.BaconArmor;
import net.donutcraft.mod.armor.DonutArmor;
import net.donutcraft.mod.blocks.DonutBlock;
import net.donutcraft.mod.blocks.DonutOre;
import net.donutcraft.mod.blocks.OreBlock;
import net.donutcraft.mod.blocks.SprinkleBlock;
import net.donutcraft.mod.entity.EntityGoldenPig;
import net.donutcraft.mod.foodCocoDonut.FoodDonutCocoDonut;
import net.donutcraft.mod.foodCocoSDonut.foodCocoSDonut;
import net.donutcraft.mod.foodCookedBacon.FoodCookedBacon;
import net.donutcraft.mod.foodGodDonut.FoodGodDonut;
import net.donutcraft.mod.foodPlainDonut.foodDonutPlainDonut;
import net.donutcraft.mod.foodRawBacon.FoodRawBacon;
import net.donutcraft.mod.foodSprinkleDonut.foodDonutSprinkleDonut;
import net.donutcraft.mod.foodsprinkles.foodDonutSprinkles;
import net.donutcraft.mod.handlers.EntityHandler;
import net.donutcraft.mod.items.BaconAxe;
import net.donutcraft.mod.items.BaconHoe;
import net.donutcraft.mod.items.BaconPick;
import net.donutcraft.mod.items.BaconPick;
import net.donutcraft.mod.items.BaconSpade;
import net.donutcraft.mod.items.BaconSword;
import net.donutcraft.mod.items.DonutAxe;
import net.donutcraft.mod.items.DonutHoe;
import net.donutcraft.mod.items.DonutPick;
import net.donutcraft.mod.items.DonutSpade;
import net.donutcraft.mod.items.DonutSword;
import net.donutcraft.mod.items.NCItems;
import net.donutcraft.mod.worldgen.DonutCraftWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



@Mod(modid = DonutCraft.modid, version = DonutCraft.version)
public class DonutCraft {

	public static final String modid = "DonutCraft";
	public static final String version = "Release v0.2.0";
	
	public static CreativeTabs donutcraftTab;
	
	@Instance(modid)
	public static DonutCraft instance;
	
	
	public static Item itemDonutPlainDough;
	public static Item itemDonutCocoDough;
	public static Item foodDonutGodDonut;
	public static Item foodDonutRawBacon;
	public static Item foodDonutCookedBacon;
	public static Item foodDonutPlainDonut;
	public static Item foodDonutCocoDonut;
	public static Item foodDonutSprinkles;
	public static Item foodDonutSprinkleDonut;
	public static Item foodDonutCocoSDonut;
	
	public static ToolMaterial BaconMaterial = EnumHelper.addToolMaterial("BaconMaterial", 2, 575, 6.5F, 2.8F, 14);
	public static ToolMaterial DonutMaterial = EnumHelper.addToolMaterial("DonutMaterial", 4, 2250, 8.3F, 3.2F, 10);
	
	public static Item itemBaconSword;
	public static Item itemBaconPick;
	public static Item itemBaconSpade;
	public static Item itemBaconAxe;
	public static Item itemBaconHoe;
	
	public static Item itemDonutSword;
	public static Item itemDonutPick;
	public static Item itemDonutSpade;
	public static Item itemDonutAxe;
	public static Item itemDonutHoe;
	
	public static ArmorMaterial BaconArmourMaterial = EnumHelper.addArmorMaterial("BaconArmour", 45, new int[]{3, 7, 10, 5}, 25);
	public static ArmorMaterial DonutArmourMaterial = EnumHelper.addArmorMaterial("DonutArmour", 45, new int[]{4, 9, 15, 6}, 10);
	
	
	public int armorBaconHelmID;
	public int armorBaconChestID;
	public int armorBaconLegsID;
	public int armorBaconBootsID;
	
	public static Item BaconHelm;
	public static Item BaconChest;
	public static Item BaconLegs;
	public static Item BaconBoots;
	
	public int armorDonutHelmID;
	public int armorDonutChestID;
	public int armorDonutLegsID;
	public int armorDonutBootsID;
	
	public static Item DonutHelm;
	public static Item DonutChest;
	public static Item DonutLegs;
	public static Item DonutBoots;
	
	public static Block blockCobbleStoneTable;
	public static Block blockDonutBlock;
	public static Block blockSprinkleBlock;
	
	DonutCraftWorldGen eventWorldGen = new DonutCraftWorldGen();
	
	public static Block oreSprinkleOre;
	public static Block oreDonutOre;
	public static Item itemDonutGem;
	
	@EventHandler
	public void PreIit(FMLPreInitializationEvent preEvent){
		
		donutcraftTab = new CreativeTabs("DonutCraft"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(DonutCraft.oreDonutOre);
			}
		};
		//Materials 
		itemDonutPlainDough = new NCItems().setUnlocalizedName("PlainDough");
		GameRegistry.registerItem(itemDonutPlainDough, "PlainDough");
		
		itemDonutCocoDough = new NCItems().setUnlocalizedName("CocoDough");
		GameRegistry.registerItem(itemDonutCocoDough, "CocoDough");
		
		
		//Food
		foodDonutGodDonut = new FoodGodDonut(8, 0.6F, true).setUnlocalizedName("GodDonut").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":GodDonut");
		GameRegistry.registerItem(foodDonutGodDonut, "GodDonut");
		
		foodDonutRawBacon = new FoodRawBacon(2, 0.4F, true).setUnlocalizedName("RawBacon").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":RawBacon");
		GameRegistry.registerItem(foodDonutRawBacon, "RawBacon");
		
		foodDonutCookedBacon = new FoodCookedBacon(5, 0.9F, true).setUnlocalizedName("CookedBacon").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":CookedBacon");
		GameRegistry.registerItem(foodDonutCookedBacon, "CookedBacon");
		
		foodDonutPlainDonut = new foodDonutPlainDonut(3, 0.8F, true).setUnlocalizedName("PlainDonut").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":PlainDonut");
		GameRegistry.registerItem(foodDonutPlainDonut, "PlainDonut");
		
		foodDonutCocoDonut = new FoodDonutCocoDonut(3, 0.8F, true).setUnlocalizedName("CocoDonut").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":CocoDonut");
		GameRegistry.registerItem(foodDonutCocoDonut, "CocoDonut");
		
		foodDonutSprinkles = new foodDonutSprinkles(2, 0.3F, true).setUnlocalizedName("Sprinkles").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":Sprinkles");
		GameRegistry.registerItem(foodDonutSprinkles, "Sprinkles");
		
		foodDonutSprinkleDonut = new foodDonutSprinkleDonut(5, 0.9F, true).setUnlocalizedName("SprinkleDonut").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":SprinkleDonut");
		GameRegistry.registerItem(foodDonutSprinkleDonut, "Sprinkled Donut");
		
		foodDonutCocoSDonut = new foodCocoSDonut(5, 0.9F, true).setUnlocalizedName("CocoS").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":CocoS");
		GameRegistry.registerItem(foodDonutCocoSDonut, "Coco Sprinkled Donut");
		
		// Jems and Ingots
		itemDonutGem = new NCItems().setUnlocalizedName("DonutGem");
		GameRegistry.registerItem(itemDonutGem, "DonutGem");
		
		//Ores
		oreDonutOre = new OreBlock(Material.iron).setBlockName("DonutOre");
		GameRegistry.registerBlock(oreDonutOre, "DonutOre");
		
		oreSprinkleOre = new OreBlock(Material.iron).setBlockName("SprinkleOre");
		GameRegistry.registerBlock(oreSprinkleOre, "SprinkleOre");
		
		//Spawn
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		
		itemBaconSword = new BaconSword(BaconMaterial).setUnlocalizedName("BaconSword").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":BaconSword");
		GameRegistry.registerItem(itemBaconSword, "BaconSword");
		itemBaconAxe = new BaconAxe(BaconMaterial).setUnlocalizedName("BaconAxe").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":BaconAxe");
		GameRegistry.registerItem(itemBaconAxe, "BaconAxe");
		itemBaconPick = new BaconPick(BaconMaterial).setUnlocalizedName("BaconPick").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":BaconPick");
		GameRegistry.registerItem(itemBaconPick, "BaconPick");
		itemBaconSpade = new BaconSpade(BaconMaterial).setUnlocalizedName("BaconSpade").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":BaconSpade");
		GameRegistry.registerItem(itemBaconSpade, "BaconSpade");
		itemBaconHoe = new BaconHoe(BaconMaterial).setUnlocalizedName("BaconHoe").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":BaconHoe");
		GameRegistry.registerItem(itemBaconHoe, "BaconHoe");
		
		itemDonutSword = new DonutSword(DonutMaterial).setUnlocalizedName("DonutSword").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":DonutSword");
		GameRegistry.registerItem(itemDonutSword, "DonutSword");
		itemDonutAxe = new DonutAxe(DonutMaterial).setUnlocalizedName("DonutAxe").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":DonutAxe");
		GameRegistry.registerItem(itemDonutAxe, "DonutAxe");
		itemDonutPick = new DonutPick(DonutMaterial).setUnlocalizedName("DonutPick").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":DonutPick");
		GameRegistry.registerItem(itemDonutPick, "DonutPick");
		itemDonutSpade = new DonutSpade(DonutMaterial).setUnlocalizedName("DonutSpade").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":DonutSpade");
		GameRegistry.registerItem(itemDonutSpade, "DonutSpade");
		itemDonutHoe = new DonutHoe(DonutMaterial).setUnlocalizedName("DonutHoe").setCreativeTab(donutcraftTab).setTextureName(DonutCraft.modid + ":DonutHoe");
		GameRegistry.registerItem(itemDonutHoe, "DonutHoe");
		
		//Blocks
		
		blockSprinkleBlock = new SprinkleBlock(Material.iron).setBlockName("SprinkleBlock").setCreativeTab(donutcraftTab).setBlockTextureName(DonutCraft.modid + ":SprinkleBlock");
		GameRegistry.registerBlock(blockSprinkleBlock, "SprinkleBlock");
		
		blockDonutBlock = new DonutBlock(Material.iron).setBlockName("DonutBlock").setCreativeTab(donutcraftTab).setBlockTextureName(DonutCraft.modid + ":DonutBlock");
		GameRegistry.registerBlock(blockDonutBlock, "DonutBlock");
		
		//Renderers

		//Armour
		
		BaconHelm = new BaconArmor(BaconArmourMaterial, armorBaconHelmID, 0).setUnlocalizedName("BaconHelm");
		GameRegistry.registerItem(BaconHelm, "BaconHelm");
		BaconChest = new BaconArmor(BaconArmourMaterial, armorBaconChestID, 1).setUnlocalizedName("BaconChest");
		GameRegistry.registerItem(BaconChest, "BaconChest");
		BaconLegs = new BaconArmor(BaconArmourMaterial, armorBaconLegsID, 2).setUnlocalizedName("BaconLegs");
		GameRegistry.registerItem(BaconLegs, "BaconLeg");
		BaconBoots = new BaconArmor(BaconArmourMaterial, armorBaconBootsID, 3).setUnlocalizedName("BaconBoots");
		GameRegistry.registerItem(BaconBoots, "BaconBoots");
		
		DonutHelm = new DonutArmor(DonutArmourMaterial, armorDonutHelmID, 0).setUnlocalizedName("DonutHelm");
		GameRegistry.registerItem(DonutHelm, "DonutHelm");
		DonutChest = new DonutArmor(DonutArmourMaterial, armorDonutChestID, 1).setUnlocalizedName("DonutChest");
		GameRegistry.registerItem(DonutChest, "DonutChest");
		DonutLegs = new DonutArmor(DonutArmourMaterial, armorDonutLegsID, 2).setUnlocalizedName("DonutLegs");
		GameRegistry.registerItem(DonutLegs, "DonutLeg");
		DonutBoots = new DonutArmor(DonutArmourMaterial, armorDonutBootsID, 3).setUnlocalizedName("DonutBoots");
		GameRegistry.registerItem(DonutBoots, "DonutBoots");
	
	
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		//Recipes
		GameRegistry.addRecipe(new ItemStack(foodDonutGodDonut), new Object[]{"GGG", "GPG", "GGG", 'G', itemDonutGem,'P', foodDonutPlainDonut });
		GameRegistry.addRecipe(new ItemStack (foodDonutPlainDonut), new Object[]{" C ", "C C", " C ", 'C' , itemDonutPlainDough});
		GameRegistry.addRecipe(new ItemStack (foodDonutCocoDonut), new Object[]{" C ", "C C", " C ", 'C' , itemDonutCocoDough});
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutPlainDough, 16), new Object[]{"MWM", "W W", "MWM", 'M' , Items.milk_bucket, 'W', Items.wheat});
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutCocoDough, 16), new Object[]{"MWM", "WCW", "MWM", 'M' , Items.milk_bucket, 'W', Items.egg, 'C', Items.cookie});
		GameRegistry.addShapedRecipe(new ItemStack (foodDonutSprinkleDonut), new Object[]{"   ", " S ", " D ", 'S', foodDonutSprinkles, 'D', foodDonutPlainDonut});
		GameRegistry.addShapedRecipe(new ItemStack (foodDonutCocoSDonut), new Object[]{"   ", " S ", " D ", 'S', foodDonutSprinkles, 'D', foodDonutCocoDonut});
		
		GameRegistry.addShapedRecipe(new ItemStack (foodDonutRawBacon, 16), new Object []{ "PPP", "PPP", "PPP", 'P', Items.porkchop});
		
		GameRegistry.addShapedRecipe(new ItemStack (DonutHelm), new Object []{"XXX", "X X", 'X' , itemDonutGem});
		GameRegistry.addShapedRecipe(new ItemStack (DonutChest), new Object []{"X X", "XXX", "XXX", 'X' , itemDonutGem});
		GameRegistry.addShapedRecipe(new ItemStack (DonutLegs), new Object []{"XXX", "X X", "X X", 'X' , itemDonutGem});
		GameRegistry.addShapedRecipe(new ItemStack (DonutBoots), new Object []{"X X", "X X", 'X' , itemDonutGem,});
		
		GameRegistry.addShapedRecipe(new ItemStack (BaconHelm), new Object []{"YYY", "Y Y", 'Y' , foodDonutCookedBacon});
		GameRegistry.addShapedRecipe(new ItemStack (BaconChest), new Object []{"Y Y", "YYY", "YYY", 'Y' , foodDonutCookedBacon});
		GameRegistry.addShapedRecipe(new ItemStack (BaconLegs), new Object []{"YYY", "Y Y", "Y Y", 'Y' , foodDonutCookedBacon});
		GameRegistry.addShapedRecipe(new ItemStack (BaconBoots), new Object []{"Y Y", "Y Y", 'Y' , foodDonutCookedBacon});
		
		GameRegistry.addShapedRecipe(new ItemStack (itemBaconSword), new Object []{" Z ", " Z ", " A ",  'Z' , foodDonutCookedBacon, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemBaconPick), new Object []{"ZZZ", " A ", " A ",  'Z' , foodDonutCookedBacon, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemBaconAxe), new Object []{"ZZ ", "ZZA ", " A ",  'Z' , foodDonutCookedBacon, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemBaconSpade), new Object []{" Z ", " A ", " A ",  'Z' , foodDonutCookedBacon, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemBaconHoe), new Object []{"ZZ ", " A ", " A ",  'Z' , foodDonutCookedBacon, 'A', Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutSword), new Object []{" Z ", " Z ", " A ",  'Z' , foodDonutPlainDonut, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutPick), new Object []{"ZZZ", " A ", " A ",  'Z' , foodDonutPlainDonut, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutAxe), new Object []{"ZZ ", "ZZA ", " A ",  'Z' , foodDonutPlainDonut, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutSpade), new Object []{" Z ", " A ", " A ",  'Z' , foodDonutPlainDonut, 'A', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack (itemDonutHoe), new Object []{"ZZ ", " A ", " A ",  'Z' , foodDonutPlainDonut, 'A', Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack (blockSprinkleBlock), new Object []{"ZZZ", "ZZZ", "ZZZ",  'Z' , foodDonutSprinkles});
		GameRegistry.addShapedRecipe(new ItemStack (blockDonutBlock), new Object []{"ZZZ", "ZZZ", "ZZZ",  'Z' , itemDonutGem});
		
		//Smelting
		GameRegistry.addSmelting(oreDonutOre, new ItemStack(itemDonutGem), 15);
		GameRegistry.addSmelting(foodDonutRawBacon, new ItemStack(foodDonutCookedBacon), 23);
		GameRegistry.addSmelting(oreSprinkleOre , new ItemStack (foodDonutSprinkles), 25);
		
		//IC2 Recipes
		
		//Entities
		EntityHandler.registerEntities(EntityGoldenPig.class, "Golden Pig");
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
}
