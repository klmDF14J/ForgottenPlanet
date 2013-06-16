package com.roboyobo.forgottenPlanet.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class SideHandler {
	
	public static boolean isClient() {
		Side side = FMLCommonHandler.instance().getSide();
		boolean isClient = false;
		if(side.isClient() && !side.isServer()) { isClient = true; }
		return isClient;
	}

	public static boolean isServer() {
		Side side = FMLCommonHandler.instance().getSide();
		boolean isServer = false;
		if(side.isServer() && !side.isClient()) { isServer = true; }
		return isServer;
	}
}
