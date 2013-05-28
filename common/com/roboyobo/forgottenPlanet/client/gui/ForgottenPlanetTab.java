package com.roboyobo.forgottenPlanet.client.gui;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.creativetab.CreativeTabs;

public class ForgottenPlanetTab extends CreativeTabs{
	public static int tabNumber;
	public String tabName;
	public ForgottenPlanetTab(int par1, String par2Str, int par3Tab) {
		super(par1, par2Str);
		tabNumber = par3Tab;
		tabName = par2Str;
		
	}
	public int getTabIconItemIndex() {
		if(tabNumber > 1) {
			tabNumber = 0;
		}
		switch(tabNumber) {
		case 0 : return Blocks.emblazonedGrass.blockID;
		case 1 : return Blocks.enchantedGrass.blockID;
		default : return Block.bedrock.blockID;
		}
	}

	
	@Override
	public String getTranslatedTabLabel() {
		return tabName;
		
	}

}
