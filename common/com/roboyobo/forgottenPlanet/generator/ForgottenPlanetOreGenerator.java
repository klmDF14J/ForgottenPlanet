package com.roboyobo.forgottenPlanet.generator;

import java.util.Random;

import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ForgottenPlanetOreGenerator extends WorldGenerator
{
	private int block;
	private int veinX, veinY, veinZ, chance, height;

    public ForgottenPlanetOreGenerator(int blockID, int par1, int par2, int par3, int par4, int par5)
    {
       block = blockID;
       veinX = par1;
       veinY = par2;
       veinZ = par3;
       chance = par4;
       height = par5;
    }


    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
    	
    	for(int var1 = 0; var1 <= veinX; var1++) {
    		for(int var2 = 0; var2 <= veinY; var2++) {
    			for(int var3 = 0; var3 <= veinZ; var3++) {
    				int rand = par2Random.nextInt(chance);
    				if(rand == 0) {
    					par1World.setBlock(par3 + var1, (par4 - height) - var2, par5 - var3, block);
    				}
    			}
    		}
    	}
        return true;
    }
}
