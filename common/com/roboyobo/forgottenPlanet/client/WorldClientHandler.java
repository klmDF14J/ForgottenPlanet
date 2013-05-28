package com.roboyobo.forgottenPlanet.client;

import com.roboyobo.forgottenPlanet.client.gui.ForgottenPlanetTab;

import net.minecraft.client.multiplayer.NetClientHandler;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.logging.ILogAgent;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;

public class WorldClientHandler extends WorldClient {
	int numOfTicksRan;
	public WorldClientHandler(NetClientHandler par1NetClientHandler, WorldSettings par2WorldSettings, int par3, int par4, Profiler par5Profiler, ILogAgent par6iLogAgent) {
		super(par1NetClientHandler, par2WorldSettings, par3, par4, par5Profiler, par6iLogAgent);
	}
	@Override
	public void tick() {
		numOfTicksRan++;
		if(numOfTicksRan >= 20) {
		ForgottenPlanetTab.tabNumber++;
		numOfTicksRan = 0;
		}
	}
	
}
