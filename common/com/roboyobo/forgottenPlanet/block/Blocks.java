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
import net.minecraftforge.common.MinecraftForge;

public class Blocks {
		public static Block emblazonedGrass, enchantedGrass, toxifiedGrass, forgottenGrass;
		public static Block forgottenSand;
		public static Block forgottenDirt;
		public static Block log1, log2, log3;
		public static Block forgottenLeaves1, forgottenLeaves2, forgottenLeaves3;
		public static Block portalFrame, plank1, plank2, plank3, brick1, brick2, brick3, dungeonCobble1, dungeonCobble2, dungeonCobble3;
    	public static Block stone1, stone2, stone3, stone4; 
    	public static Block cobble1, cobble2, cobble3, cobble4;
    	public static Block emblazonedCoalOre, emlazonedDustOre, emblazonedGemOre;
    	public static ForgottenPortal portal;
	   
    	
    	public static void initBlocks() {
    		emblazonedGrass = new EmblazonedGrass(BlockID.emblazonedGrass, Material.grass).setUnlocalizedName("Emblazoned Grass");
    		enchantedGrass = new EnchantedGrass(BlockID.enchantedGrass, Material.grass).setUnlocalizedName("Enchanted Grass"); 
    		toxifiedGrass = new ToxifiedGrass(BlockID.toxifiedGrass, Material.grass).setUnlocalizedName("Toxified Grass"); 
    		forgottenGrass = new ForgottenGrass(BlockID.forgottenGrass, Material.grass).setUnlocalizedName("Forgotten Grass");
    		
    		forgottenSand = new ForgottenPlanetBlock(BlockID.forgottenSand, Material.sand).setUnlocalizedName("Forgotten Sand");
    		forgottenDirt = new ForgottenPlanetBlock(BlockID.forgottenDirt, Material.grass).setUnlocalizedName("Forgotten Dirt");
    		
    		log1 = new EnchantedLog(BlockID.emblazonedLog, Material.wood).setUnlocalizedName("Emblazoned Log");
    		log2 = new EnchantedLog(BlockID.enchantedLog, Material.wood).setUnlocalizedName("Enchanted Log");
    		log3 = new EnchantedLog(BlockID.toxifiedLog, Material.wood).setUnlocalizedName("Toxified Log");
    		
    		forgottenLeaves1 = new ForgottenLeaves(BlockID.forgottenLeaves1, Material.leaves).setUnlocalizedName("Emblazoned Leaves");
    		forgottenLeaves2 = new ForgottenLeaves(BlockID.forgottenLeaves2, Material.leaves).setUnlocalizedName("Enchanted Leaves");
    		forgottenLeaves3 = new ForgottenLeaves(BlockID.forgottenLeaves3, Material.leaves).setUnlocalizedName("Toxified Leaves");
    		
    		portal = (ForgottenPortal) new ForgottenPortal(BlockID.portal, 0).setUnlocalizedName("Portal");
    		portalFrame = new ForgottenPlanetBlock(BlockID.portalframe, Material.rock).setUnlocalizedName("Portal Frame");
    		
    		plank1 = new ForgottenPlanetBlock(BlockID.emblazonedPlank, Material.wood).setUnlocalizedName("Emblazoned Planks");
    		plank2 = new ForgottenPlanetBlock(BlockID.enchantedPlank, Material.wood).setUnlocalizedName("Enchanted Planks");
    		plank3 = new ForgottenPlanetBlock(BlockID.toxifiedPlank, Material.wood).setUnlocalizedName("Toxified Planks");
    		
    		brick1 = new ForgottenPlanetBlock(BlockID.brick1, Material.rock).setUnlocalizedName("Emblazoned Brick");
    		brick2 = new ForgottenPlanetBlock(BlockID.brick2, Material.rock).setUnlocalizedName("Enchanted Brick");
    		brick3 = new ForgottenPlanetBlock(BlockID.brick3, Material.rock).setUnlocalizedName("Toxified Brick");
    		
    		dungeonCobble1 = new ForgottenPlanetBlock(BlockID.dungeonCobble1, Material.rock).setUnlocalizedName("Emblazoned Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F);
    		dungeonCobble2 = new ForgottenPlanetBlock(BlockID.dungeonCobble2, Material.rock).setUnlocalizedName("Enchanted Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F);
    		dungeonCobble3 = new ForgottenPlanetBlock(BlockID.dungeonCobble3, Material.rock).setUnlocalizedName("Toxified Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F);
    		
    		stone1 = new ForgottenPlanetStoneBlock(BlockID.stone1, 0).setUnlocalizedName("Forgotten Stone");
    		stone2 = new ForgottenPlanetStoneBlock(BlockID.stone2, 1).setUnlocalizedName("Emblazoned Stone");
    		stone3 = new ForgottenPlanetStoneBlock(BlockID.stone3, 2).setUnlocalizedName("Enchanted Stone");
    		stone4 = new ForgottenPlanetStoneBlock(BlockID.stone4, 3).setUnlocalizedName("Toxified Stone");
    		
    		cobble1 = new ForgottenPlanetBlock(BlockID.cobble1, Material.rock).setUnlocalizedName("Forgotten Cobble");
    		cobble2 = new ForgottenPlanetBlock(BlockID.cobble2, Material.rock).setUnlocalizedName("Emblazoned Cobble");
    		cobble3 = new ForgottenPlanetBlock(BlockID.cobble3, Material.rock).setUnlocalizedName("Enchanted Cobble");
    		cobble4 = new ForgottenPlanetBlock(BlockID.cobble4, Material.rock).setUnlocalizedName("Toxified Cobble");
    		
    		emblazonedCoalOre = new ForgottenOre(BlockID.forgottenFuelOre, Material.rock).setUnlocalizedName("Emblazoned Fuel");
    	}
    	
    	public static void registerBlocks() {
    		GameRegistry.registerBlock(forgottenGrass, ForgottenPlanet.modid + forgottenGrass.getUnlocalizedName());
    		GameRegistry.registerBlock(emblazonedGrass, ForgottenPlanet.modid + emblazonedGrass.getUnlocalizedName());
            GameRegistry.registerBlock(enchantedGrass, ForgottenPlanet.modid + enchantedGrass.getUnlocalizedName());
            GameRegistry.registerBlock(toxifiedGrass, ForgottenPlanet.modid + toxifiedGrass.getUnlocalizedName());
            
            GameRegistry.registerBlock(forgottenSand, ForgottenPlanet.modid + forgottenSand.getUnlocalizedName());
            GameRegistry.registerBlock(forgottenDirt, ForgottenPlanet.modid + forgottenDirt.getUnlocalizedName());
            
            GameRegistry.registerBlock(log1, ForgottenPlanet.modid + log1.getUnlocalizedName());
            GameRegistry.registerBlock(log2, ForgottenPlanet.modid + log2.getUnlocalizedName());
            GameRegistry.registerBlock(log3, ForgottenPlanet.modid + log3.getUnlocalizedName());
            
            GameRegistry.registerBlock(forgottenLeaves1, ForgottenPlanet.modid + forgottenLeaves1.getUnlocalizedName());
            GameRegistry.registerBlock(forgottenLeaves2, ForgottenPlanet.modid + forgottenLeaves2.getUnlocalizedName());
            GameRegistry.registerBlock(forgottenLeaves3, ForgottenPlanet.modid + forgottenLeaves3.getUnlocalizedName());
            
            GameRegistry.registerBlock(portal, ForgottenPlanet.modid + portal.getUnlocalizedName());
            GameRegistry.registerBlock(portalFrame, ForgottenPlanet.modid + portalFrame.getUnlocalizedName());
            
            GameRegistry.registerBlock(plank1, ForgottenPlanet.modid + plank1.getUnlocalizedName());
            GameRegistry.registerBlock(plank2, ForgottenPlanet.modid + plank2.getUnlocalizedName());
            GameRegistry.registerBlock(plank3, ForgottenPlanet.modid + plank3.getUnlocalizedName());
            
            GameRegistry.registerBlock(brick1, ForgottenPlanet.modid + brick1.getUnlocalizedName());
            GameRegistry.registerBlock(brick2, ForgottenPlanet.modid + brick2.getUnlocalizedName());
            GameRegistry.registerBlock(brick3, ForgottenPlanet.modid + brick3.getUnlocalizedName());
            
            GameRegistry.registerBlock(dungeonCobble1, ForgottenPlanet.modid + dungeonCobble1.getUnlocalizedName());
            GameRegistry.registerBlock(dungeonCobble2, ForgottenPlanet.modid + dungeonCobble2.getUnlocalizedName());
            GameRegistry.registerBlock(dungeonCobble3, ForgottenPlanet.modid + dungeonCobble3.getUnlocalizedName());
            
            GameRegistry.registerBlock(stone1, ForgottenPlanet.modid + stone1.getUnlocalizedName());
            GameRegistry.registerBlock(stone2, ForgottenPlanet.modid + stone2.getUnlocalizedName());
            GameRegistry.registerBlock(stone3, ForgottenPlanet.modid + stone3.getUnlocalizedName());
            GameRegistry.registerBlock(stone4, ForgottenPlanet.modid + stone4.getUnlocalizedName());
            
            GameRegistry.registerBlock(cobble1, ForgottenPlanet.modid + cobble1.getUnlocalizedName());
            GameRegistry.registerBlock(cobble2, ForgottenPlanet.modid + cobble2.getUnlocalizedName());
            GameRegistry.registerBlock(cobble3, ForgottenPlanet.modid + cobble3.getUnlocalizedName());
            GameRegistry.registerBlock(cobble4, ForgottenPlanet.modid + cobble4.getUnlocalizedName());
            
            GameRegistry.registerBlock(emblazonedCoalOre, ForgottenPlanet.modid + emblazonedCoalOre.getUnlocalizedName());
    	}
    	
    	public static void addNames() {
            LanguageRegistry.addName(forgottenGrass, "Forgotten Grass");
    		LanguageRegistry.addName(emblazonedGrass, "Emblazoned Grass");
            LanguageRegistry.addName(enchantedGrass, "Enchanted Grass");
            LanguageRegistry.addName(toxifiedGrass, "Toxified Grass");
            
            LanguageRegistry.addName(forgottenSand, "Forgotten Sand");
            LanguageRegistry.addName(forgottenDirt, "Forgotten Dirt");
            
            LanguageRegistry.addName(log1, "Emblazoned log");
            LanguageRegistry.addName(log2, "Enchanted log");
            LanguageRegistry.addName(log3, "Toxified log");
            
            LanguageRegistry.addName(forgottenLeaves1, "Emblazoned Leaves");
            LanguageRegistry.addName(forgottenLeaves2, "Enchanted Leaves");
            LanguageRegistry.addName(forgottenLeaves3, "Toxified Leaves");
            
            LanguageRegistry.addName(portal, "Forgotten Portal");
            LanguageRegistry.addName(portalFrame, "Forgotten Portal Frame");
            
            LanguageRegistry.addName(plank1, "Emblazoned Wood Planks");
            LanguageRegistry.addName(plank2, "Enchanted Wood Planks");
            LanguageRegistry.addName(plank3, "Toxified Wood Planks");
            
            LanguageRegistry.addName(brick1, "Emblazoned Brick");
            LanguageRegistry.addName(brick2, "Enchanted Brick");
            LanguageRegistry.addName(brick3, "Toxified Brick");
            
            LanguageRegistry.addName(dungeonCobble1, "Emblazoned Dungeon Cobblestone");
            LanguageRegistry.addName(dungeonCobble2, "Enchanted Dungeon Cobblestone");
            LanguageRegistry.addName(dungeonCobble3, "Toxified Dungeon Cobblestone");
            
            LanguageRegistry.addName(stone1, "Forgotten Stone");
            LanguageRegistry.addName(stone2, "Emblazoned Stone");
            LanguageRegistry.addName(stone3, "Enchanted Stone");
            LanguageRegistry.addName(stone4, "Toxified Stone");
            
            LanguageRegistry.addName(cobble1, "Forgotten Cobble");
            LanguageRegistry.addName(cobble2, "Emblazoned Cobble");
            LanguageRegistry.addName(cobble3, "Enchanted Cobble");
            LanguageRegistry.addName(cobble4, "Toxified Cobble");
            
            LanguageRegistry.addName(emblazonedCoalOre, "Forgotten Fuel Ore");
    	}
    	
    	private static void setHarvestLevels() {
    		Block[] grass = {forgottenGrass, emblazonedGrass, enchantedGrass, toxifiedGrass, forgottenDirt};
    		for(int var1 = 0; var1 < grass.length; var1++) {
    			MinecraftForge.setBlockHarvestLevel(grass[var1], "shovel", 0);
    		}
    		
    	}
    	

    	public static void setupBlocks() {
    		initBlocks();
    		registerBlocks();
    		addNames();
    		setHarvestLevels();
    	}
}
