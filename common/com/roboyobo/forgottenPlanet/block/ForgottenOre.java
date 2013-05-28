package com.roboyobo.forgottenPlanet.block;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class ForgottenOre extends Block {

	private Icon icon;
	
	public ForgottenOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(ForgottenPlanet.forgottenPlanetTab);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return this.blockID;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
     icon = par1IconRegister.registerIcon(ForgottenPlanet.modid + ":" + this.getUnlocalizedName2());
	}
	
	@SideOnly(Side.CLIENT)
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta) {
		return icon;
	}
	
}
