package com.roboyobo.forgottenPlanet.block;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class ForgottenPlanetStoneBlock extends Block {

	public ForgottenPlanetStoneBlock(int i) {
		super(i, Material.rock);
		this.setHardness(1.5F);
        this.setResistance(5F);
        this.setCreativeTab(ForgottenPlanet.forgottenPlanetTab);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2());
	}
    
    @SideOnly(Side.CLIENT)
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta) {
    	return blockIcon;
    }
    
    public int idDropped(int par1, Random par2Random, int par3) {
		return Blocks.emblazonedCobble.blockID;
    }

}
