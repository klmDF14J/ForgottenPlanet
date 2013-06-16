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

    public ForgottenPlanetOreGenerator(int blockID)
    {
       block = blockID;
    }


    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
    	int height = 20;
    	par1World.setBlock(par3, par4 - (height - 1), par5, block);
    	par1World.setBlock(par3, par4 - height, par5, block);
    	par1World.setBlock(par3, par4 - (height + 1), par5, block);
    	par1World.setBlock(par3 - 1, par4 - height, par5, block);
    	par1World.setBlock(par3 + 1, par4 - height, par5, block);
    	par1World.setBlock(par3, par4 - height, par5 - 1, block);
    	par1World.setBlock(par3, par4 - height, par5 + 1, block);
        return true;
        
        //290 88 140
    }
}
