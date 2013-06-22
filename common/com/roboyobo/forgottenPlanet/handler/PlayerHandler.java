package com.roboyobo.forgottenPlanet.handler;

import com.roboyobo.forgottenPlanet.achievement.Achievements;
import com.roboyobo.forgottenPlanet.dimension.DimensionHandler;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class PlayerHandler implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		if(player.dimension == DimensionHandler.dimension) {
			player.addStat(Achievements.enterForgottenPlanet, 1);
		}
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

}
