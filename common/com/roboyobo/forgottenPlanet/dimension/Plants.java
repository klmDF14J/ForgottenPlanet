package com.roboyobo.forgottenPlanet.dimension;

import static net.minecraftforge.common.ForgeDirection.UP;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class Plants {
	 public static boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
	    {
	        int plantID = plant.getPlantID(world, x, y + 1, z);
	        EnumPlantType plantType = plant.getPlantType(world, x, y + 1, z);


	        switch (plantType)
	        {
	            case Plains: return Block.grass.blockID == Block.grass.blockID || Block.dirt.blockID == Block.dirt.blockID || Blocks.emblazonedGrass.blockID == Blocks.emblazonedGrass.blockID;
	        }

	        return false;
	    }
}
