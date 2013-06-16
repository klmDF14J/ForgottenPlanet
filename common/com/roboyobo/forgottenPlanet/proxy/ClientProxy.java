package com.roboyobo.forgottenPlanet.proxy;

import java.io.File;

import com.roboyobo.forgottenPlanet.mob.Mobs;
import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedHuman;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedHuman;
import com.roboyobo.forgottenPlanet.mob.render.RenderEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.render.RenderEmblazonedHuman;
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
	
	@Override
	public void registerRenderThings() {
		Mobs.renderMob(EntityEmblazonedCreeper.class, new RenderEmblazonedCreeper(new ModelEmblazonedCreeper(), 2.0F));
		Mobs.renderMob(EntityEmblazonedHuman.class, new RenderEmblazonedHuman(new ModelEmblazonedHuman(), 2.0F));
	}

	public void registerModelRenderers() 
	{

	}
}