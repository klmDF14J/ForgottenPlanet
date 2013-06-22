package com.roboyobo.forgottenPlanet.block;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class EnchantedLog extends Block
{
	@SideOnly(Side.CLIENT)
	public Icon topIcon;
	public Icon sideIcon;
	
       public EnchantedLog(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(ForgottenPlanet.forgottenPlanetBlocks);
             this.setHardness(2F);
       }
       
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister) {
        this.topIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2() + " Top");
        this.sideIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2() + " Side");
    }
       
       @SideOnly(Side.CLIENT)
       public Icon getBlockTextureFromSideAndMetadata(int side, int meta) {
    	   switch(side) {
    	   case 0 : return topIcon;
    	   case 1 : return topIcon;
    	   default : return sideIcon;
    	   }
       }
}