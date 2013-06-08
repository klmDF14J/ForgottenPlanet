package com.roboyobo.forgottenPlanet;

import java.io.IOException;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

import com.roboyobo.forgottenPlanet.block.BlockID;
import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.block.EmblazonedGrass;
import com.roboyobo.forgottenPlanet.block.EnchantedGrass;
import com.roboyobo.forgottenPlanet.block.EnchantedLog;
import com.roboyobo.forgottenPlanet.block.ForgottenLeaves;
import com.roboyobo.forgottenPlanet.block.ForgottenPlanetBlock;
import com.roboyobo.forgottenPlanet.block.ForgottenPlanetStoneBlock;
import com.roboyobo.forgottenPlanet.block.ForgottenPortal;
import com.roboyobo.forgottenPlanet.client.gui.ForgottenPlanetTab;
import com.roboyobo.forgottenPlanet.dimension.EmblazonedForestBiome;
import com.roboyobo.forgottenPlanet.dimension.ForgottenLootGenerator;
import com.roboyobo.forgottenPlanet.dimension.ForgottenPlanetWorldProvider;
import com.roboyobo.forgottenPlanet.item.Items;
import com.roboyobo.forgottenPlanet.mob.Mobs;
import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.render.RenderEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.proxy.CommonProxy;
import com.roboyobo.forgottenPlanet.recipe.Recipes;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = ForgottenPlanet.modid, name = ForgottenPlanet.modName, version = ForgottenPlanet.modVersion)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ForgottenPlanet
{
       public static final String modid = "ForgottenPlanet";
       public static final String modName = "Forgotten Planet";
       public static final String modVersion = "0.0.2";
       public static int dimension = 20;
       
       public static BiomeGenBase emblazonedForest;
       static int startEntityId = 300;
       
       public static CreativeTabs forgottenPlanetTab = new ForgottenPlanetTab(CreativeTabs.getNextID(), modName, 0);
       
       @SidedProxy(clientSide = "com.roboyobo.forgottenPlanet.proxy.ClientProxy", serverSide = "com.roboyobo.forgottenPlanet.proxy.CommonProxy")
       public static CommonProxy proxy;
	public static boolean portalHasSpawned = false;
	public static byte stoneGen = (byte) BlockID.emblazonedStone;
      
       @Init
       public void load(FMLInitializationEvent event)
       {
    	  // proxy.initTickHandlers();
    	   Blocks.setupBlocks();
    	   Items.setupItems();
    	   ForgottenLootGenerator.init();
           emblazonedForest = new EmblazonedForestBiome(23).setBiomeName("Emblazoned Forest").setMinMaxHeight(0.2F, 1F).setTemperatureRainfall(1F, 0F);
           DimensionManager.registerProviderType(dimension, ForgottenPlanetWorldProvider.class, false);
    	   DimensionManager.registerDimension(dimension, dimension);
    	   Mobs.setMod(this);
    	   Mobs.initMobs();
    	   Recipes.initRecipes();
       }

	
       
       
       
}