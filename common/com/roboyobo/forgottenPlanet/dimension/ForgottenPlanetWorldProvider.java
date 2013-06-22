package com.roboyobo.forgottenPlanet.dimension;

import static net.minecraft.world.biome.BiomeGenBase.forest;

import java.util.ArrayList;
import java.util.Arrays;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.util.MathHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class ForgottenPlanetWorldProvider extends WorldProvider
{
 private float[] colorsSunriseSunset = new float[4];


public void registerWorldChunkManager()
 {
  this.dimensionId = DimensionHandler.dimension;
  this.worldChunkMgr = new ForgottenPlanetChunkManager(ForgottenPlanet.emblazonedForest, 0.5F, 0.0F);
 }
 
 public String getDimensionName() 
 {
  return "Forgotten Planet";
 }
 
 public boolean canRespawnHere()
 {
  return false;
 }
 
 @Override
 public IChunkProvider createChunkGenerator()
 {
  return new ForgottenPlanetChunkProvider(worldObj, worldObj.getSeed(), true);
 }
 
 public String getSaveFolder()
 {
     return "Forgotten Planet";
 }
 
 @SideOnly(Side.CLIENT)
 public String getWelcomeMessage()
 {
 	return "Travelling To The Forgotten Planet";
 }
 
 @SideOnly(Side.CLIENT)
 public String getDepartMessage()
 {
 	return "Leaving The Forgotten Planet";
 }
 
}
