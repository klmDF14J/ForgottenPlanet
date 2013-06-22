package com.roboyobo.forgottenPlanet.handler;

import com.roboyobo.forgottenPlanet.achievement.Achievements;
import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IPickupNotifier;

public class PickupHandler implements IPickupNotifier {

	@Override
	public void notifyPickup(EntityItem item, EntityPlayer player) {
		ItemStack itemstack = item.getEntityItem();
		int id = itemstack.getItem().itemID;
		if(id == Blocks.flower1.blockID) {
			player.addStat(Achievements.pickupFlower, 1);
		}
		if(id == Blocks.log1.blockID || id == Blocks.log2.blockID || id == Blocks.log3.blockID) {
			player.addStat(Achievements.pickupWood, 1);
		}
		if(id == Blocks.cobble1.blockID || id == Blocks.cobble2.blockID || id == Blocks.cobble3.blockID || id == Blocks.cobble4.blockID) {
			player.addStat(Achievements.mineCobble, 1);
		}
	}

}
