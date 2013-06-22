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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.roboyobo.forgottenPlanet.achievement.Achievements;
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
import com.roboyobo.forgottenPlanet.dimension.DimensionHandler;
import com.roboyobo.forgottenPlanet.dimension.ForgottenPlanetBiome;
import com.roboyobo.forgottenPlanet.dimension.ForgottenLootGenerator;
import com.roboyobo.forgottenPlanet.dimension.ForgottenPlanetWorldProvider;
import com.roboyobo.forgottenPlanet.handler.CraftingHandler;
import com.roboyobo.forgottenPlanet.handler.FuelHandler;
import com.roboyobo.forgottenPlanet.handler.PickupHandler;
import com.roboyobo.forgottenPlanet.handler.PlayerHandler;
import com.roboyobo.forgottenPlanet.item.Items;
import com.roboyobo.forgottenPlanet.mob.Mobs;
import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.render.RenderEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.proxy.CommonProxy;
import com.roboyobo.forgottenPlanet.proxy.SideHandler;
import com.roboyobo.forgottenPlanet.recipe.Recipes;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarted;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = ForgottenPlanet.modid, name = ForgottenPlanet.modName, version = ForgottenPlanet.modVersion)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ForgottenPlanet implements IPlayerTracker
{
       public static final String modid = "ForgottenPlanet";
       public static final String modName = "Forgotten Planet";
       public static final String modVersion = "0.0.2";
       
       
       
       public static BiomeGenBase emblazonedForest;
       static int startEntityId = 300;
       
       public static CreativeTabs forgottenPlanetBlocks = new ForgottenPlanetTab(CreativeTabs.getNextID(), modName + " Blocks", 0);
       public static CreativeTabs forgottenPlanetItems = new ForgottenPlanetTab(CreativeTabs.getNextID(), modName + " Items", 1);
       
       @SidedProxy(clientSide = "com.roboyobo.forgottenPlanet.proxy.ClientProxy", serverSide = "com.roboyobo.forgottenPlanet.proxy.CommonProxy")
       public static CommonProxy proxy;
	   public static boolean portalHasSpawned = false;
	   public static byte stoneGen = (byte) BlockID.stone1;
	   
	   @Instance
	   public static ForgottenPlanet mod;

       @Init
       public void load(FMLInitializationEvent event)
       {
           initAll();
       }
       
       private void initAll() {
    	   proxy.registerRenderThings();
    	   Items.setupItems();
    	   Blocks.setupBlocks();
    	   emblazonedForest = new ForgottenPlanetBiome(23).setBiomeName("Forgotten Planet").setMinMaxHeight(0.2F, 1F).setTemperatureRainfall(1F, 0F);
    	   ForgottenLootGenerator.init();
    	   DimensionHandler.setupDimension();
    	   Recipes.initRecipes();
    	   Mobs.initMobs();
    	   MinecraftForge.addGrassPlant(Blocks.flower1, 0, 20);
    	   if(SideHandler.isClient()) {
    		   Achievements.init();
    	   }
    	   GameRegistry.registerFuelHandler(new FuelHandler());
    	   GameRegistry.registerCraftingHandler(new CraftingHandler());
    	   GameRegistry.registerPickupHandler(new PickupHandler());
    	   GameRegistry.registerPlayerTracker(new PlayerHandler());
       }
       

	@Override
	public void onPlayerLogin(EntityPlayer player) {

	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		
	}

	
       
       
       
}