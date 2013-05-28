package com.roboyobo.forgottenPlanet.tick;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandlerClient
	implements ITickHandler
{
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
	        if (type.equals(EnumSet.of(TickType.CLIENT)))
	        {
	        	if(Minecraft.getMinecraft().theWorld != null)
	        	{      		
	        		worldTick(Minecraft.getMinecraft(), Minecraft.getMinecraft().theWorld);
	        	}
	        }
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT, TickType.PLAYER, TickType.RENDER);
	}

	@Override
	public String getLabel() {
		return "TickHandlerClientForgottenPlanet";
	}
	
	
	
	public void worldTick(Minecraft mc, WorldClient world) {
		
		//System.out.println(Keyboard.isKeyDown(Keyboard.KEY_C));
		
	}
	
    public static boolean isKeyPressed(int key)
    {
    	if(key < 0)
    	{
    		return Mouse.isButtonDown(key + 100);
    	}
    	return Keyboard.isKeyDown(key);
    }

	public void playerTick(World world, EntityPlayer player)
	{
	}
	
	public void preRenderTick(Minecraft mc, World world, float renderTick)
	{
		
	}
	
	public void renderTick(Minecraft mc, World world, float renderTick)
	{
	}
	
	
}
