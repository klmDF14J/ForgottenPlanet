package com.roboyobo.forgottenPlanet.dimension;

import net.minecraftforge.common.DimensionManager;

public class DimensionHandler {
	
	public static int dimension = 20;
	
	public static void setupDimension() {
		DimensionManager.registerProviderType(dimension, ForgottenPlanetWorldProvider.class, false);
		DimensionManager.registerDimension(dimension, dimension);
	}
}
