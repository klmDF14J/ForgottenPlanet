package com.roboyobo.forgottenPlanet.dimension;

import java.util.Random;

import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.DungeonHooks;

public class ForgottenPlanetLargeAbandonedHutGenerator extends WorldGenerator
{

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		j = j - 1;
		
		generateUnderneath(i, j, k, world, Blocks.emblazonedStoneBrick.blockID, 15, 15);
		generateFlatSurface(0, i, j, k, world, Blocks.emblazonedStoneBrick.blockID, 15, 15);
		generate1WallLayer(1, i, j, k, world, Blocks.emblazonedCobble.blockID, 15, 15);
		generate1WallLayer(2, i, j, k, world, Blocks.emblazonedCobble.blockID, 15, 15);
		generate1WallLayer(3, i, j, k, world, Blocks.emblazonedCobble.blockID, 15, 15);
		generate1WallLayer(4, i, j, k, world, Blocks.emblazonedCobble.blockID, 15, 15);
		
		generate1WallLayer(1, i, j, k + 8, world, Blocks.emblazonedCobble.blockID, 15, 7);
		generate1WallLayer(2, i, j, k + 8, world, Blocks.emblazonedCobble.blockID, 15, 7);
		generate1WallLayer(3, i, j, k + 8, world, Blocks.emblazonedCobble.blockID, 15, 7);
		generate1WallLayer(4, i, j, k + 8, world, Blocks.emblazonedCobble.blockID, 15, 7);
		generateFlatSurface(5, i, j, k, world, Blocks.emblazonedCobble.blockID, 15, 15);
		generateHutDoor(i, j, k, world, Blocks.emblazonedStoneBrick.blockID, 0, 0, 0);
		generateHutDoor(i, j, k, world, Blocks.emblazonedStoneBrick.blockID, 5, 0, 8);
		generateHutExtras(i, j, k, world, random);
		return false;
	}
	
	private void generateUnderneath(int i, int j, int k, World world, int blockID, int length, int width) {
		
		boolean missingBlock = true;
		
		for(int var1 = 0; var1 < 20; var1++) {
			System.out.println("At: " + var1);
			for(int var2 = 0; var2 < length; var2++) {
				for(int var3 = 0; var3 < width; var3++) {
					if(world.getBlockId(i + var2, j - var1, k + var3) == 0 || world.getBlockId(i + var2, j - var1, k + var3) == Block.waterStill.blockID || world.getBlockId(i + var2, j - var1, k + var3) == Block.lavaStill.blockID) {
						world.setBlock(i + var2, j - var1, k + var3, blockID);
					}	
				}
			}
		}
		
		
	}
	
	
	private void generate1WallLayer(int height, int i, int j, int k, World world, int blockID, int length, int width) {
		for(int var3 = 0; var3 < length; var3++) {
			for(int var4 = 0; var4 < 1; var4++) {
				world.setBlock(i + var3, j + height, k, blockID);
			}
			for(int var4 = 0; var4 < 1; var4++) {
				world.setBlock(i + var3, j + height, k + (width - 1), blockID);
			}
		}
		for(int var5 = 0; var5 < width; var5++) {
			for(int var6 = 0; var6 < 1; var6++) {
				world.setBlock(i, j + height, k + var5, blockID);
			}
			for(int var6 = 0; var6 < 1; var6++) {
				world.setBlock(i + (length - 1), j + height, k + var5, blockID);
			}
		}
	}
	
	private void generateFlatSurface(int height, int i, int j, int k, World world, int blockID, int length, int width) {
		for(int var1 = 0; var1 < length; var1++) {
			for(int var2 = 0; var2 < width; var2++) {
				world.setBlock(i + var1, j + height, k + var2, blockID);
			}
		}
	}
	
	private void generateHutDoor(int i, int j, int k, World world, int blockID, int offseti, int offsetj, int offsetk) {
		world.setBlock(i + 5 + offseti, j + 1 + offsetj, k + offsetk, blockID);
		world.setBlock(i + 5 + offseti, j + 2 + offsetj, k + offsetk, blockID);
		world.setBlock(i + 5 + offseti, j + 3 + offsetj, k + offsetk, blockID);
		world.setBlockToAir(i + 6 + offseti, j + 1 + offsetj, k + offsetk);
		world.setBlockToAir(i + 6 + offseti, j + 2 + offsetj, k + offsetk);
		world.setBlock(i + 6 + offseti, j + 3 + offsetj, k + offsetk, blockID);
		world.setBlock(i + 7 + offseti, j + 1 + offsetj, k + offsetk, blockID);
		world.setBlock(i + 7 + offseti, j + 2 + offsetj, k + offsetk, blockID);
		world.setBlock(i + 7 + offseti, j + 3 + offsetj, k + offsetk, blockID);
	}
	
	private void generateHutExtras(int i, int j, int k, World world, Random random) {
		
		world.setBlock(i + 3, j + 1, k + 7, Block.mobSpawner.blockID, 0, 2);
		world.setBlock(i + 1, j + 1, k + 7, Block.mobSpawner.blockID, 0, 2);
		world.setBlock(i + 5, j + 1, k + 7, Block.mobSpawner.blockID, 0, 2);
        TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getBlockTileEntity(i + 3, j + 1, k + 7);
        TileEntityMobSpawner tileentitymobspawner2 = (TileEntityMobSpawner)world.getBlockTileEntity(i + 1, j + 1, k + 7);
        TileEntityMobSpawner tileentitymobspawner3 = (TileEntityMobSpawner)world.getBlockTileEntity(i + 5, j + 1, k + 7);
        if (tileentitymobspawner != null && tileentitymobspawner2 != null && tileentitymobspawner3 != null)
        {
            tileentitymobspawner.func_98049_a().setMobID(this.pickMobSpawner(random));
            tileentitymobspawner2.func_98049_a().setMobID(this.pickMobSpawner(random));
            tileentitymobspawner3.func_98049_a().setMobID(this.pickMobSpawner(random));
        }
        
        world.setBlock(i + 13, j + 1, k + 7, Block.chest.blockID);
        world.setBlock(i + 1, j + 1, k + 1, Block.chest.blockID);
        IInventory chest = (IInventory) world.getBlockTileEntity(i + 13, j + 1, k + 7);
        IInventory chest2 = (IInventory) world.getBlockTileEntity(i + 1, j + 1, k + 1);
		ForgottenLootGenerator.fillChest(chest, 5, 2);
		ForgottenLootGenerator.fillChest(chest2, 5, 0);
	}
	
	private String pickMobSpawner(Random par1Random)
    {
        return DungeonHooks.getRandomDungeonMob(par1Random);
    }

}
