package com.roboyobo.forgottenPlanet.block;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.client.gui.ParticleSpawner;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.Particle;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class EnchantedGrass extends Block
{
	@SideOnly(Side.CLIENT)
	public Icon topIcon;
	public Icon bottomIcon;
	public Icon sideIcon;
	
       public EnchantedGrass(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(ForgottenPlanet.forgottenPlanetTab);
             this.setHardness(3F);
             this.setResistance(5F);
       }
       
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister) {
        this.topIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2() + " Top");
        this.bottomIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2() + " Bottom");
        this.sideIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2() + " Side");
    }
       
       @SideOnly(Side.CLIENT)
       public Icon getBlockTextureFromSideAndMetadata(int side, int meta) {
    	   switch(side) {
    	   case 0 : return bottomIcon;
    	   case 1 : return topIcon;
    	   default : return sideIcon;
    	   }
       }
       
       public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    	   int rand = par5Random.nextInt(30);
    	   if(rand == 1) {
    	   ParticleSpawner.spawnRandomParticle(par5Random, par1World, "mobSpell", par2, par3, par4, 0, 0, 255);
    	   ParticleSpawner.spawnRandomParticle(par5Random, par1World, "mobSpell", par2, par3, par4, 255, 0, 255);
    	   }
       }
}