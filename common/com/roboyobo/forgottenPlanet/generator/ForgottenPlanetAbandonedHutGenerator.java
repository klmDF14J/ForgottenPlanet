package com.roboyobo.forgottenPlanet.generator;

import java.util.Random;

import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.dimension.ForgottenLootGenerator;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.DungeonHooks;

public class ForgottenPlanetAbandonedHutGenerator extends WorldGenerator
{

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		j = j - 1;
		generateUnderneath(i, j, k, world, Blocks.brick1.blockID, 10, 7);
		clearInside(6, i, j, k, world, 10, 7);
		generateFlatSurface(0, i, j, k, world, Blocks.brick1.blockID, 10, 7);
		generate1WallLayer(1, i, j, k, world, Blocks.dungeonCobble2.blockID, 10, 7);
		generate1WallLayer(2, i, j, k, world, Blocks.dungeonCobble2.blockID, 10, 7);
		generate1WallLayer(3, i, j, k, world, Blocks.dungeonCobble2.blockID, 10, 7);
		generate1WallLayer(4, i, j, k, world, Blocks.dungeonCobble2.blockID, 10, 7);
		generateFlatSurface(5, i, j, k, world, Blocks.dungeonCobble2.blockID, 10, 7);
		generateHutDoor(i, j, k, world, Blocks.dungeonCobble2.blockID, 0);
		generateHutExtras(i, j, k, world, random);
		
		return false;
	}
	
	
	private void generateUnderneath(int i, int j, int k, World world, int blockID, int length, int width) {
		
		boolean missingBlock = true;
		
		for(int var1 = 0; var1 < 20; var1++) {
			for(int var2 = 0; var2 < length; var2++) {
				for(int var3 = 0; var3 < width; var3++) {
					if(world.getBlockId(i + var2, j - var1, k + var3) == 0 || world.getBlockId(i + var2, j - var1, k + var3) == Block.waterStill.blockID || world.getBlockId(i + var2, j - var1, k + var3) == Block.lavaStill.blockID || world.getBlockId(i + var2, j - var1, k + var3) == Block.waterMoving.blockID || world.getBlockId(i + var2, j - var1, k + var3) == Block.lavaMoving.blockID) {
						world.setBlock(i + var2, j - var1, k + var3, blockID);
					}	
				}
			}
		}
		
		
	}
	
	private void clearInside(int heightToClear, int i, int j, int k, World world, int length, int width) {
		for(int var1 = 0; var1 < heightToClear; var1++) {
			for(int var2 = 0; var2 < length; var2++) {
				for(int var3 = 0; var3 < width; var3++) {
					world.setBlockToAir(i + var2, j + var1, k + var3);
				}
			}
		}
	}


	private void generate1WallLayer(int height, int i, int j, int k, World world, int blockID, int length, int width) {
		for(int var1 = 0; var1 < length; var1++) {
			for(int var2 = 0; var2 < 1; var2++) {
				world.setBlock(i + var1, j + height, k, blockID);
			}
			for(int var2 = 0; var2 < 1; var2++) {
				world.setBlock(i + var1, j + height, k + 6, blockID);
			}
		}
		for(int var1 = 0; var1 < width; var1++) {
			for(int var2 = 0; var2 < 1; var2++) {
				world.setBlock(i, j + height, k + var1, blockID);
			}
			for(int var2 = 0; var2 < 1; var2++) {
				world.setBlock(i + 9, j + height, k + var1, blockID);
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
	
	private void generateHutDoor(int i, int j, int k, World world, int blockID, int meta) {
		world.setBlockMetadataWithNotify(i + 5, j + 1, k, blockID, meta);
		world.setBlockMetadataWithNotify(i + 5, j + 2, k, blockID, meta);
		world.setBlockMetadataWithNotify(i + 5, j + 3, k, blockID, meta);
		world.setBlockToAir(i + 6, j + 1, k);
		world.setBlockToAir(i + 6, j + 2, k);
		world.setBlockMetadataWithNotify(i + 6, j + 3, k, blockID, meta);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k, blockID, meta);
		world.setBlockMetadataWithNotify(i + 7, j + 2, k, blockID, meta);
		world.setBlockMetadataWithNotify(i + 7, j + 3, k, blockID, meta);
	}
	
	private void generateHutExtras(int i, int j, int k, World world, Random random) {
		
		world.setBlock(i + 1, j + 1, k + 5, Block.mobSpawner.blockID, 0, 2);
        TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)world.getBlockTileEntity(i + 1, j + 1, k + 5);
        if (tileentitymobspawner != null)
        {
            tileentitymobspawner.func_98049_a().setMobID(this.pickMobSpawner(random));
        }
        
        world.setBlock(i + 1, j, k + 5, Block.chest.blockID);
        IInventory chest = (IInventory) world.getBlockTileEntity(i + 1, j, k + 5);
		ForgottenLootGenerator.fillChest(chest, 5, 1);
		
	}
	
	private String pickMobSpawner(Random par1Random)
    {
        return DungeonHooks.getRandomDungeonMob(par1Random);
    }

}
