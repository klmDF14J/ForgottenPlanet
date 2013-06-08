package com.roboyobo.forgottenPlanet.block;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.item.ForgottenPlanetMultiBlockItem;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class Blocks {
		public static Block emblazonedGrass;
		public static Block enchantedGrass;
		public static Block forgottenSand;
		public static Block forgottenDirt;
		public static Block emblazonedLog;
		public static Block forgottenLeaves1;
		public static Block forgottenLeaves2;
    	public static Block forgottenLeaves3;
    	public static Block genericBlock;
    	public static Block emblazonedStone, emblazonedCobble, emblazonedStoneBrick;
    	public static Block emblazonedCoalOre, emlazonedDustOre, emblazonedGemOre;
    	public static ForgottenPortal portal;
	   
    	
    	public static void initBlocks() {
    		emblazonedGrass = new EmblazonedGrass(BlockID.emblazonedGrass, Material.grass).setUnlocalizedName("Emblazoned Grass");
    		enchantedGrass = new EnchantedGrass(BlockID.enchantedGrass, Material.grass).setUnlocalizedName("Enchanted Grass"); 
    		forgottenSand = new ForgottenPlanetBlock(BlockID.forgottenSand, Material.sand).setUnlocalizedName("Forgotten Sand");
    		forgottenDirt = new ForgottenPlanetBlock(BlockID.forgottenDirt, Material.grass).setUnlocalizedName("Forgotten Dirt");
    		emblazonedLog = new EnchantedLog(BlockID.emblazonedLog, Material.wood).setUnlocalizedName("Emblazoned Log");
    		forgottenLeaves1 = new ForgottenLeaves(BlockID.forgottenLeaves1, Material.leaves).setUnlocalizedName("Forgotten Leaves 1");
    		forgottenLeaves2 = new ForgottenLeaves(BlockID.forgottenLeaves2, Material.leaves).setUnlocalizedName("Forgotten Leaves 2");
    		forgottenLeaves3 = new ForgottenLeaves(BlockID.forgottenLeaves3, Material.leaves).setUnlocalizedName("Forgotten Leaves 3");
    		portal = (ForgottenPortal) new ForgottenPortal(BlockID.portal, 0).setUnlocalizedName("Portal");
    		genericBlock = new ForgottenPlanetMultiBlock(BlockID.portalframe, Material.wood).setUnlocalizedName("genericBlock");
    		emblazonedStone = new ForgottenPlanetStoneBlock(BlockID.emblazonedStone).setUnlocalizedName("Emblazoned Stone");
    		emblazonedCobble = new ForgottenPlanetBlock(BlockID.emblazonedCobble, Material.rock).setUnlocalizedName("Emblazoned Cobble");
    		emblazonedCoalOre = new ForgottenOre(BlockID.forgottenFuelOre, Material.rock).setUnlocalizedName("Emblazoned Fuel");
    	}
    	
    	public static void registerBlocks() {
    		GameRegistry.registerBlock(emblazonedGrass, ForgottenPlanet.modid + emblazonedGrass.getUnlocalizedName2());
            GameRegistry.registerBlock(enchantedGrass, ForgottenPlanet.modid + enchantedGrass.getUnlocalizedName2());
            GameRegistry.registerBlock(forgottenSand, ForgottenPlanet.modid + forgottenSand.getUnlocalizedName2());
            GameRegistry.registerBlock(forgottenDirt, ForgottenPlanet.modid + forgottenDirt.getUnlocalizedName2());
            GameRegistry.registerBlock(emblazonedLog, ForgottenPlanet.modid + emblazonedLog.getUnlocalizedName2());
            GameRegistry.registerBlock(forgottenLeaves1, ForgottenPlanet.modid + forgottenLeaves1.getUnlocalizedName2());
            GameRegistry.registerBlock(forgottenLeaves2, ForgottenPlanet.modid + forgottenLeaves2.getUnlocalizedName2());
            GameRegistry.registerBlock(forgottenLeaves3, ForgottenPlanet.modid + forgottenLeaves3.getUnlocalizedName2());
            GameRegistry.registerBlock(portal, ForgottenPlanet.modid + portal.getUnlocalizedName2());
            GameRegistry.registerBlock(genericBlock, ForgottenPlanetMultiBlockItem.class, ForgottenPlanet.modid + genericBlock.getUnlocalizedName2());
            GameRegistry.registerBlock(emblazonedStone, ForgottenPlanet.modid + emblazonedStone.getUnlocalizedName2());
            GameRegistry.registerBlock(emblazonedCobble, ForgottenPlanet.modid + emblazonedCobble.getUnlocalizedName2());
            GameRegistry.registerBlock(emblazonedCoalOre, ForgottenPlanet.modid + emblazonedCoalOre.getUnlocalizedName2());
    	}
    	
    	public static void addNames() {
    		LanguageRegistry.addName(emblazonedGrass, "Emblazoned Grass");
            LanguageRegistry.addName(enchantedGrass, "Enchanted Grass");
            LanguageRegistry.addName(forgottenSand, "Forgotten Sand");
            LanguageRegistry.addName(forgottenDirt, "Forgotten Dirt");
            LanguageRegistry.addName(emblazonedLog, "Enchanted log");
            LanguageRegistry.addName(forgottenLeaves1, "Forgotten Leaves");
            LanguageRegistry.addName(forgottenLeaves2, "Forgotten Leaves");
            LanguageRegistry.addName(forgottenLeaves3, "Forgotten Leaves");
            LanguageRegistry.addName(portal, "Forgotten Portal");
            LanguageRegistry.addName(new ItemStack(genericBlock, 1, 0), "Forgotten Portal Frame");
            LanguageRegistry.addName(new ItemStack(genericBlock, 1, 1), "Emblazoned Stone Brick");
            LanguageRegistry.addName(emblazonedStone, "Emblazoned Stone");
            LanguageRegistry.addName(emblazonedCobble, "Emblazoned Cobble");
            LanguageRegistry.addName(emblazonedCoalOre, "Forgotten Fuel Ore");
    	}
    	

    	public static void setupBlocks() {
    		initBlocks();
    		registerBlocks();
    		addNames();
    	}
}
