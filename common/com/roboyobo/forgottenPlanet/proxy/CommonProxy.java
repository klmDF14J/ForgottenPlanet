package com.roboyobo.forgottenPlanet.proxy;

import java.io.File;

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
		// TODO Auto-generated method stub
		
	}
	
	public static TickHandlerClient thc;

	public void initTickHandlers() {
		
	}
}