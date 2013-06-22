package com.roboyobo.forgottenPlanet.handler;

import com.roboyobo.forgottenPlanet.item.Items;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == Items.forgottenFuel.itemID) {
			return 8000;
		}
		else {
			return 0;
		}
	}
}
