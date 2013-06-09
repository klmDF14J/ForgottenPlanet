package com.roboyobo.forgottenPlanet.generator;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.dimension.Plants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ForgeDirection;

public class ForgottenPlanetTreeGenerator extends WorldGenerator
{
    /** The minimum height of a generated tree. */
    private final int minTreeHeight;

    /** True if this tree should grow Vines. */
    private final boolean vinesGrow;

    /** The metadata value of the wood to use in tree generation. */
    private final int metaWood;

    /** The metadata value of the leaves to use in tree generation. */
    private final int metaLeaves;

    public ForgottenPlanetTreeGenerator(boolean par1)
    {
        this(par1, 4, 0, 0, false);
    }

    public ForgottenPlanetTreeGenerator(boolean par1, int par2, int par3, int par4, boolean par5)
    {
        super(par1);
        this.minTreeHeight = par2;
        this.metaWood = par3;
        this.metaLeaves = par4;
        this.vinesGrow = par5;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
       int blockID = 0;
       boolean canGen = false;
       
       if(par1World.getBlockId(par3, par4 - 1, par5) == Blocks.emblazonedGrass.blockID) {
    	   canGen = true;
    	   blockID = Blocks.forgottenLeaves1.blockID;
       }
       
       if(par1World.getBlockId(par3, par4 - 1, par5) == Blocks.enchantedGrass.blockID) {
    	   canGen = true;
    	   blockID = Blocks.forgottenLeaves2.blockID;
       }
       
       if(canGen) { 
    	   for(int var1 = 0; var1 < 5; var1++) {
    		   for(int var2 = 0; var2 < 5; var2++) {
    			   for(int var3 = 0; var3 < 2; var3++) {
    				   par1World.setBlock(par3 + var1 - 2, par4 + var3 + 2, par5 + var2 - 2, blockID);
    			   }
    		   }
    	   }
    	   for(int var4 = 0; var4 < 3; var4++) {
    		   for(int var5 = 0; var5 < 3; var5++) {
    			   for(int var6 = 0; var6 < 2; var6++) {
    				   par1World.setBlock(par3 + var4 - 1, par4 + var6 + 4, par5 + var5 - 1, blockID);
    			   }
    		   }
    	   }
    	   par1World.setBlock(par3 - 1, par4 + 6, par5, blockID);
    	   par1World.setBlock(par3 - 1, par4 + 7, par5, blockID);
    	   par1World.setBlock(par3 - 1, par4 + 8, par5, blockID);
       
    	   par1World.setBlock(par3 + 1, par4 + 6, par5, blockID);
    	   par1World.setBlock(par3 + 1, par4 + 7, par5, blockID);
    	   par1World.setBlock(par3 + 1, par4 + 8, par5, blockID);
       
    	   par1World.setBlock(par3, par4 + 6, par5 - 1, blockID);
    	   par1World.setBlock(par3, par4 + 7, par5 - 1, blockID);
    	   par1World.setBlock(par3, par4 + 8, par5 - 1, blockID);
       
    	   par1World.setBlock(par3, par4 + 6, par5 + 1, blockID);
    	   par1World.setBlock(par3, par4 + 7, par5 + 1, blockID);
       	   par1World.setBlock(par3, par4 + 8, par5 + 1, blockID);
       
       	   par1World.setBlock(par3, par4 + 8, par5, blockID);
       
       
       	   for(int var10 = 0; var10 <= 7; var10++) {
       		   par1World.setBlock(par3, par4 + var10, par5, Blocks.emblazonedLog.blockID);
       	   }
       }
       	return true;
    }

    /**
     * Grows vines downward from the given block for a given length. Args: World, x, starty, z, vine-length
     */
    private void growVines(World par1World, int par2, int par3, int par4, int par5)
    {
        this.setBlockAndMetadata(par1World, par2, par3, par4, Block.vine.blockID, par5);
        int i1 = 4;

        while (true)
        {
            --par3;

            if (par1World.getBlockId(par2, par3, par4) != 0 || i1 <= 0)
            {
                return;
            }

            this.setBlockAndMetadata(par1World, par2, par3, par4, Block.vine.blockID, par5);
            --i1;
        }
    }
}
