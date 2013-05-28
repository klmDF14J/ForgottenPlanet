package com.roboyobo.forgottenPlanet.client.gui;

import java.util.Random;

import net.minecraft.world.World;

public class ParticleSpawner {
	public static void spawnRandomParticle(Random par1Random, World par2World, String par3ParticleType, double par4XCoord, double par5YCoord, double par6ZCoord, int par7VelX, int par8VelY, int par9VelZ) {
	   float randomX = par1Random.nextFloat();
 	   float randomY = par1Random.nextFloat();
 	   float randomZ = par1Random.nextFloat();
 	   par2World.spawnParticle(par3ParticleType, par4XCoord + randomX, par5YCoord + 1.1, par6ZCoord + randomZ, par7VelX, par8VelY, par9VelZ);
	}
}
