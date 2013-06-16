package com.roboyobo.forgottenPlanet.block;

import java.util.List;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ForgottenPlanetMultiBlock extends Block
{
       public ForgottenPlanetMultiBlock(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(ForgottenPlanet.forgottenPlanetTab);
       }
      
       @SideOnly(Side.CLIENT)
       private Icon[] icons;
       
       public static int numOfBlocks = 5;
      
       @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
             icons = new Icon[numOfBlocks];
            
             for(int i = 0; i < icons.length; i++)
             {
                    icons[i] = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
             }
    }
      
       @SideOnly(Side.CLIENT)
       public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
       {
             return icons[par2];
       }
      
       @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < numOfBlocks; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}