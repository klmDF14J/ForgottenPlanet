package com.roboyobo.forgottenPlanet.block;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.item.ForgottenPlanetMultiBlockItem;
import com.roboyobo.forgottenPlanet.item.ItemID;
import com.roboyobo.forgottenPlanet.item.Items;

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
		public static Block portalFrame, plank1, plank2, plank3, brick1, brick2, brick3, dungeonCobble1, dungeonCobble2, dungeonCobble3, dungeonCobble4;
    	public static Block stone1, stone2, stone3, stone4; 
    	public static Block cobble1, cobble2, cobble3, cobble4;
    	public static Block forgottenFuelOre, forgottenDustOre;
    	public static Block flower1;
    	public static ForgottenPortal portal;
	   
    	
    	public static void initBlocks() {
    		emblazonedGrass = new EmblazonedGrass(BlockID.emblazonedGrass, Material.grass).setUnlocalizedName("Emblazoned Grass").setStepSound(Block.soundGrassFootstep);
    		enchantedGrass = new EnchantedGrass(BlockID.enchantedGrass, Material.grass).setUnlocalizedName("Enchanted Grass").setStepSound(Block.soundGrassFootstep); 
    		toxifiedGrass = new ToxifiedGrass(BlockID.toxifiedGrass, Material.grass).setUnlocalizedName("Toxified Grass").setStepSound(Block.soundGrassFootstep); 
    		forgottenGrass = new ForgottenGrass(BlockID.forgottenGrass, Material.grass).setUnlocalizedName("Forgotten Grass").setStepSound(Block.soundGrassFootstep);
    		
    		forgottenSand = new ForgottenPlanetBlock(BlockID.forgottenSand, Material.sand).setUnlocalizedName("Forgotten Sand").setStepSound(Block.soundSandFootstep);
    		forgottenDirt = new ForgottenPlanetBlock(BlockID.forgottenDirt, Material.grass).setUnlocalizedName("Forgotten Dirt").setStepSound(Block.soundGrassFootstep);
    		
    		log1 = new EnchantedLog(BlockID.emblazonedLog, Material.wood).setUnlocalizedName("Emblazoned Log").setStepSound(Block.soundWoodFootstep);
    		log2 = new EnchantedLog(BlockID.enchantedLog, Material.wood).setUnlocalizedName("Enchanted Log").setStepSound(Block.soundWoodFootstep);
    		log3 = new EnchantedLog(BlockID.toxifiedLog, Material.wood).setUnlocalizedName("Toxified Log").setStepSound(Block.soundWoodFootstep);
    		
    		forgottenLeaves1 = new ForgottenLeaves(BlockID.forgottenLeaves1).setUnlocalizedName("Emblazoned Leaves").setStepSound(Block.soundGrassFootstep);
    		forgottenLeaves2 = new ForgottenLeaves(BlockID.forgottenLeaves2).setUnlocalizedName("Enchanted Leaves").setStepSound(Block.soundGrassFootstep);
    		forgottenLeaves3 = new ForgottenLeaves(BlockID.forgottenLeaves3).setUnlocalizedName("Toxified Leaves").setStepSound(Block.soundGrassFootstep);
    		
    		portal = (ForgottenPortal) new ForgottenPortal(BlockID.portal, 0).setUnlocalizedName("Portal");
    		portalFrame = new ForgottenPlanetBlock(BlockID.portalframe, Material.rock).setUnlocalizedName("Portal Frame").setStepSound(Block.soundMetalFootstep);
    		
    		plank1 = new ForgottenPlanetBlock(BlockID.emblazonedPlank, Material.wood).setUnlocalizedName("Emblazoned Planks").setStepSound(Block.soundWoodFootstep);
    		plank2 = new ForgottenPlanetBlock(BlockID.enchantedPlank, Material.wood).setUnlocalizedName("Enchanted Planks").setStepSound(Block.soundWoodFootstep);
    		plank3 = new ForgottenPlanetBlock(BlockID.toxifiedPlank, Material.wood).setUnlocalizedName("Toxified Planks").setStepSound(Block.soundWoodFootstep);
    		
    		brick1 = new ForgottenPlanetBlock(BlockID.brick1, Material.rock).setUnlocalizedName("Emblazoned Brick").setStepSound(Block.soundStoneFootstep);
    		brick2 = new ForgottenPlanetBlock(BlockID.brick2, Material.rock).setUnlocalizedName("Enchanted Brick").setStepSound(Block.soundStoneFootstep);
    		brick3 = new ForgottenPlanetBlock(BlockID.brick3, Material.rock).setUnlocalizedName("Toxified Brick").setStepSound(Block.soundStoneFootstep);
    		
    		dungeonCobble1 = new ForgottenPlanetBlock(BlockID.dungeonCobble1, Material.rock).setUnlocalizedName("Forgotten Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F).setStepSound(Block.soundStoneFootstep);
    		dungeonCobble2 = new ForgottenPlanetBlock(BlockID.dungeonCobble2, Material.rock).setUnlocalizedName("Emblazoned Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F).setStepSound(Block.soundStoneFootstep);
    		dungeonCobble3 = new ForgottenPlanetBlock(BlockID.dungeonCobble3, Material.rock).setUnlocalizedName("Enchanted Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F).setStepSound(Block.soundStoneFootstep);
    		dungeonCobble4 = new ForgottenPlanetBlock(BlockID.dungeonCobble4, Material.rock).setUnlocalizedName("Toxified Dungeon Cobble").setBlockUnbreakable().setResistance(6000000.0F).setStepSound(Block.soundStoneFootstep);
    		
    		stone1 = new ForgottenPlanetStoneBlock(BlockID.stone1, 0).setUnlocalizedName("Forgotten Stone").setStepSound(Block.soundStoneFootstep);
    		stone2 = new ForgottenPlanetStoneBlock(BlockID.stone2, 1).setUnlocalizedName("Emblazoned Stone").setStepSound(Block.soundStoneFootstep);
    		stone3 = new ForgottenPlanetStoneBlock(BlockID.stone3, 2).setUnlocalizedName("Enchanted Stone").setStepSound(Block.soundStoneFootstep);
    		stone4 = new ForgottenPlanetStoneBlock(BlockID.stone4, 3).setUnlocalizedName("Toxified Stone").setStepSound(Block.soundStoneFootstep);
    		
    		cobble1 = new ForgottenPlanetBlock(BlockID.cobble1, Material.rock).setUnlocalizedName("Forgotten Cobble").setStepSound(Block.soundStoneFootstep);
    		cobble2 = new ForgottenPlanetBlock(BlockID.cobble2, Material.rock).setUnlocalizedName("Emblazoned Cobble").setStepSound(Block.soundStoneFootstep);
    		cobble3 = new ForgottenPlanetBlock(BlockID.cobble3, Material.rock).setUnlocalizedName("Enchanted Cobble").setStepSound(Block.soundStoneFootstep);
    		cobble4 = new ForgottenPlanetBlock(BlockID.cobble4, Material.rock).setUnlocalizedName("Toxified Cobble").setStepSound(Block.soundStoneFootstep);
    		
    		forgottenFuelOre = new ForgottenOre(BlockID.forgottenFuelOre, Material.rock, Items.forgottenFuel.itemID).setUnlocalizedName("Forgotten Fuel Ore").setStepSound(Block.soundStoneFootstep);
    		forgottenDustOre = new ForgottenOre(BlockID.forgottenDustOre, Material.rock, Items.forgottenDust.itemID).setUnlocalizedName("Forgotten Dust Ore").setStepSound(Block.soundStoneFootstep);
    	
    		flower1 = new ForgottenFlower(BlockID.flower1, Material.leaves).setUnlocalizedName("Forgotten Flower").setStepSound(Block.soundGrassFootstep);
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
            GameRegistry.registerBlock(dungeonCobble4, ForgottenPlanet.modid + dungeonCobble4.getUnlocalizedName());
            
            GameRegistry.registerBlock(stone1, ForgottenPlanet.modid + stone1.getUnlocalizedName());
            GameRegistry.registerBlock(stone2, ForgottenPlanet.modid + stone2.getUnlocalizedName());
            GameRegistry.registerBlock(stone3, ForgottenPlanet.modid + stone3.getUnlocalizedName());
            GameRegistry.registerBlock(stone4, ForgottenPlanet.modid + stone4.getUnlocalizedName());
            
            GameRegistry.registerBlock(cobble1, ForgottenPlanet.modid + cobble1.getUnlocalizedName());
            GameRegistry.registerBlock(cobble2, ForgottenPlanet.modid + cobble2.getUnlocalizedName());
            GameRegistry.registerBlock(cobble3, ForgottenPlanet.modid + cobble3.getUnlocalizedName());
            GameRegistry.registerBlock(cobble4, ForgottenPlanet.modid + cobble4.getUnlocalizedName());
            
            GameRegistry.registerBlock(forgottenFuelOre, ForgottenPlanet.modid + forgottenFuelOre.getUnlocalizedName());
            GameRegistry.registerBlock(forgottenDustOre, ForgottenPlanet.modid + forgottenDustOre.getUnlocalizedName());
            
            GameRegistry.registerBlock(flower1, ForgottenPlanet.modid + flower1.getUnlocalizedName());
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
            
            LanguageRegistry.addName(dungeonCobble1, "Forgotten Dungeon Cobblestone");
            LanguageRegistry.addName(dungeonCobble2, "Emblazoned Dungeon Cobblestone");
            LanguageRegistry.addName(dungeonCobble3, "Enchated Dungeon Cobblestone");
            LanguageRegistry.addName(dungeonCobble4, "Toxified Dungeon Cobblestone");
            
            LanguageRegistry.addName(stone1, "Forgotten Stone");
            LanguageRegistry.addName(stone2, "Emblazoned Stone");
            LanguageRegistry.addName(stone3, "Enchanted Stone");
            LanguageRegistry.addName(stone4, "Toxified Stone");
            
            LanguageRegistry.addName(cobble1, "Forgotten Cobblestone");
            LanguageRegistry.addName(cobble2, "Emblazoned Cobblestone");
            LanguageRegistry.addName(cobble3, "Enchanted Cobblestone");
            LanguageRegistry.addName(cobble4, "Toxified Cobblestone");
            
            LanguageRegistry.addName(forgottenFuelOre, "Forgotten Fuel Ore");
            LanguageRegistry.addName(forgottenDustOre, "Forgotten Dust Ore");
            
            LanguageRegistry.addName(flower1, "Forgotten Flower");
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
