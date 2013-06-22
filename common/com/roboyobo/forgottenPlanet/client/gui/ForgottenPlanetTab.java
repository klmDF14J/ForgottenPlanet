package com.roboyobo.forgottenPlanet.client.gui;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.item.Items;

import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.creativetab.CreativeTabs;

public class ForgottenPlanetTab extends CreativeTabs{
	public int tabNumber;
	public String tabName;
	public ForgottenPlanetTab(int par1, String par2Str, int par3Tab) {
		super(par1, par2Str);
		tabNumber = par3Tab;
		tabName = par2Str;
		
	}
	public int getTabIconItemIndex() {
		int[] blocks = {Blocks.forgottenGrass.blockID, Items.forgottenFuel.itemID};
		int tab = blocks[tabNumber];
		return tab;
	}

	
	@Override
	public String getTranslatedTabLabel() {
		return tabName;
		
	}

}
