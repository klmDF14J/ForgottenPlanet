package com.roboyobo.forgottenPlanet.block;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ForgottenPlanetBlock extends Block
{
	@SideOnly(Side.CLIENT)
	public Icon blockIcon;
	
       public ForgottenPlanetBlock(int id, Material par2Material)
       {
             super(id, par2Material);
             this.setCreativeTab(ForgottenPlanet.forgottenPlanetTab);
             this.setHardness(3F);
             this.setResistance(5F);
             this.setTickRandomly(true);
       }
       
       @SideOnly(Side.CLIENT)
       public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2());
    }
       
       @SideOnly(Side.CLIENT)
       public Icon getBlockTextureFromSideAndMetadata(int side, int meta) {
    	   return blockIcon;
       }
       
       
       @SideOnly(Side.CLIENT)
       public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
    	 
       }

	private boolean portalFrameIsBuilt(int par2, int par3, int par4, World par5World) {
		int portalFramesDiscovered = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				if(par5World.getBlockId(par2 + i, par3 + j, par4) == Blocks.genericBlock.blockID) {
					portalFramesDiscovered++;
				}
			}
		}
		
		if(portalFramesDiscovered >= 14) {
			portalFramesDiscovered = 0;
			return true;
		}
		
		return false;
	}
       
}