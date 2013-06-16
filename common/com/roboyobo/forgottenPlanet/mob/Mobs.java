package com.roboyobo.forgottenPlanet.mob;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedHuman;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedHuman;
import com.roboyobo.forgottenPlanet.mob.render.RenderEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.render.RenderEmblazonedHuman;
import com.roboyobo.forgottenPlanet.proxy.SideHandler;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Mobs {
	
	static int startEntityId = 300;
	static Object Mod = ForgottenPlanet.mod;
	private static int nextID = 1;

	public static void setMod(Object par1Mod) {
		Mod = par1Mod;
	}
	
	public static void initMobs() {
		boolean isClient = SideHandler.isClient();
		addMob(EntityEmblazonedCreeper.class, "Emblazoned Creeper", nextID, Mod, 80, 3, true, EntityEmblazonedCreeper.class, 10, 2, 4, EnumCreatureType.monster, ForgottenPlanet.modid, isClient, ForgottenPlanet.emblazonedForest);
		addMob(EntityEmblazonedHuman.class, "Emblazoned Human", nextID, Mod, 80, 3, true, EntityEmblazonedHuman.class, 10, 2, 4, EnumCreatureType.monster, ForgottenPlanet.modid, isClient, ForgottenPlanet.emblazonedForest);
	}
	
	private static void addMob(Class<? extends Entity> entity, String name, int id, Object mod, int trackingRange, int updateRange, boolean sendVeloPackets, Class<? extends EntityLiving> entityLiving, int weightedProb, int min, int max, EnumCreatureType type, String modid, boolean isClient, BiomeGenBase... biomes) {
		registerEntity(entity, name, id, mod, trackingRange, updateRange, sendVeloPackets);
		addSpawnToMob(entityLiving, weightedProb, min, max, type, biomes);
		addStringLocalization(modid, name);
		addMobEgg(entity, 0xFFFFFF, 0x000000);
		nextID++;
	}
	
	public static void renderMob(Class<? extends Entity> entity, Render render) {
		registerRenderingHandler(entity, render);
	}
	
	private static void registerEntity(Class<? extends Entity> entity, String name, int id, Object mod, int trackingRange, int updateRange, boolean sendVeloPackets) {
		EntityRegistry.registerModEntity(entity, name, id, mod, trackingRange, updateRange, sendVeloPackets);
	}
	
	private static void addSpawnToMob(Class<? extends EntityLiving> entityLiving, int weightedProb, int min, int max, EnumCreatureType type, BiomeGenBase... biomes) {
		EntityRegistry.addSpawn(entityLiving, weightedProb, min, max, type, biomes);
	}
	
	private static void addStringLocalization(String modid, String mobName) {
		LanguageRegistry.instance().addStringLocalization("entity." + modid + "." + mobName + ".name", mobName);
	}
	
	private static void addMobEgg(Class<? extends Entity> entity, int col1, int col2) {
		registerEntityEgg(entity, col1, col2);
	}
	
	private static void registerRenderingHandler(Class<? extends Entity> entity, Render render) {
		RenderingRegistry.registerEntityRenderingHandler(entity, render);
	}
	
	private static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
		  int id = getUniqueEntityId();
		  EntityList.IDtoClassMapping.put(id, entity);
		  EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	
	public static int getUniqueEntityId() {
	  do {
	   startEntityId++;
	  } 
	  while (EntityList.getStringFromID(startEntityId) != null);
	   return startEntityId;
	 }
	
	//10 2 4
}
