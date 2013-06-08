package com.roboyobo.forgottenPlanet.block;

import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ForgottenLeaves extends Block
{
	@SideOnly(Side.CLIENT)
	public Icon blockIcon;
	
       public ForgottenLeaves(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(ForgottenPlanet.forgottenPlanetTab);
             this.setHardness(0.2F);
             this.setTickRandomly(true);
            
       }
       
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2());
       }
       
       public boolean isOpaqueCube() {
		return false;
    	   
       }
       
       @SideOnly(Side.CLIENT)
       public Icon getBlockTextureFromSideAndMetadata(int side, int meta) {
    	   return blockIcon;
       }
       
       public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    	   super.updateTick(par1World, par2, par3, par4, par5Random);
    	   /*par1World.setBlock(par2, par3, par4, 0);
    	   par1World.setBlock(par2, par3 - 1, par4, ForgottenPlanet.forgottenLeaves1.blockID);*/
       }
       
       public int tickRate(World par1World) {
    	   return 60;
       }
       
       public int idDropped(int par1, Random par2Random, int par3) {
    	   int num = par2Random.nextInt(5);
    	   switch(num) {
    	   case 0 : return Block.sapling.blockID;
    	   default: return 0;
    	   }
       }
       
       
       public void onBlockAdded(World par1World, int par2, int par3, int par4) {
    	   
    	 /*  String[] donators = {"roboyobo", "test", "xbannanazx"};
    	   for(String username : donators) {
    		   if(Minecraft.getMinecraft().thePlayer.username.equals(username)) {
    			   System.out.println("Username is: " + username + " and is a donator");
    		   }
    		  
       }*/
       }
       
}