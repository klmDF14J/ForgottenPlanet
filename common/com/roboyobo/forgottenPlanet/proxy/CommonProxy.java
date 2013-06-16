package com.roboyobo.forgottenPlanet.proxy;

import java.io.File;

import com.roboyobo.forgottenPlanet.mob.Mobs;
import com.roboyobo.forgottenPlanet.tick.TickHandlerClient;

public class CommonProxy 
{
	public void registerParticles(){}

	public File getMinecraftDir() 
	{
		return new File(".");
	}

	public void preloadImages() {
		
	}

	public void registerModelRenderers() {
		
	}

	public void registerRenderThings() {
		
	}
	
	public static TickHandlerClient thc;

	public void initTickHandlers() {
		
	}
}