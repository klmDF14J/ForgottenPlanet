package com.roboyobo.forgottenPlanet.item;

import java.util.List;

import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ForgottenPlanetPortalPlacer extends ForgottenPlanetItem
{
       public ForgottenPlanetPortalPlacer(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMisc);
             this.setMaxStackSize(1);
             this.setMaxDamage(1);
       }
       
       @Override
       public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	   par3List.add("A mystical dust. But what does it do?");
       }
      
       public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
       {
             if(!par3World.isRemote)
             {
                    int direction = MathHelper.floor_double((double)(par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
                   
                    if(direction == 1 || direction == 3)
                    {
                           for(int y = 1; y < 5; y++)
                           {
                                  for (int z = -1; z < 2; z++)
                                  {
                                        if(par3World.getBlockId(par4, par5 + y, par6 + z) != 0)
                                        {
                                        	par2EntityPlayer.addChatMessage("What ever this is, It's big! Clear some more land");
                                               return false;
                                        }
                                  }
                           }
                          
                           par3World.setBlock(par4, par5 + 1, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 1, par6 + 1, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 1, par6 + 2, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 1, par6 - 1, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6 - 1, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 3, par6 - 1, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 4, par6 - 1, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 5, par6 - 1, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6 + 2, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 3, par6 + 2, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 4, par6 + 2, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 5, par6 + 2, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4, par5 + 5, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4, par5 + 5, par6 + 1, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 3, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 4, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 2, par6 + 1, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 3, par6 + 1, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 4, par6 + 1, Blocks.portal.blockID);
                           
                           par2EntityPlayer.addChatMessage("Waa Hay! It seems you may have discovered something");
                           par1ItemStack.damageItem(2, par2EntityPlayer);
                    }
                    else
                    {
                           for(int y = 1; y < 5; y++)
                           {
                                  for (int x = -1; x < 2; x++)
                                  {
                                        if(par3World.getBlockId(par4 + x, par5 + y, par6) != 0)
                                        {
                                        	par2EntityPlayer.addChatMessage("What ever this is, It's big! Clear some more land");
                                               return false;
                                        }
                                  }
                           }
                          
                           par3World.setBlock(par4, par5 + 1, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 + 1, par5 + 1, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 + 2, par5 + 1, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 - 1, par5 + 1, par6, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4 - 1, par5 + 2, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 - 1, par5 + 3, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 - 1, par5 + 4, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 - 1, par5 + 5, par6, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4 + 2, par5 + 2, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 + 2, par5 + 3, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 + 2, par5 + 4, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 + 2, par5 + 5, par6, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4, par5 + 5, par6, Blocks.portalFrame.blockID);
                           par3World.setBlock(par4 + 1, par5 + 5, par6, Blocks.portalFrame.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 3, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4, par5 + 4, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4 + 1, par5 + 2, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4 + 1, par5 + 3, par6, Blocks.portal.blockID);
                           par3World.setBlock(par4 + 1, par5 + 4, par6, Blocks.portal.blockID);
                           
                           par2EntityPlayer.addChatMessage("Waa Hay! It seems you may have discovered something");
                           par1ItemStack.damageItem(2, par2EntityPlayer);
                    }
                   
                    return true;
             }
             else
                    return false;
    }
}