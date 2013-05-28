package com.roboyobo.forgottenPlanet.proxy;

import java.io.File;

import com.roboyobo.forgottenPlanet.tick.TickHandlerClient;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy 
{
	
	@Override
	public void initTickHandlers() {
		thc = new TickHandlerClient();
		TickRegistry.registerTickHandler(thc, Side.CLIENT);
	}
	
	public void registerParticles() {
		
	}

	public File getMinecraftDir() 
	{
		return Minecraft.getMinecraftDir();
	}

	public void preloadImages()
	{
	}

	public void registerTickHandlers()
	{
		
	}

	public void registerModelRenderers() 
	{

	}
}