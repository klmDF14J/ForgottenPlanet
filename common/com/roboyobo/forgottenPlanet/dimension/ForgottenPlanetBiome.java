package com.roboyobo.forgottenPlanet.dimension;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.generator.ForgottenPlanetAbandonedHutGenerator;
import com.roboyobo.forgottenPlanet.generator.ForgottenPlanetEnchantedGrassPatch;
import com.roboyobo.forgottenPlanet.generator.ForgottenPlanetLargeAbandonedHutGenerator;
import com.roboyobo.forgottenPlanet.generator.ForgottenPlanetOreGenerator;
import com.roboyobo.forgottenPlanet.generator.ForgottenPlanetTreeGenerator;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ForgottenPlanetBiome extends BiomeGenBase
{
	public WorldGenerator treeGenerator;
	public WorldGenerator abandonedHutGenerator;
	public WorldGenerator largeAbandonedHutGenerator;
	public WorldGenerator enchantedDirtPatchGenerator;
	public WorldGenerator fuelGen, dustGen;

	public byte sTopBlock;
	public byte sFillerBlock;

    public ForgottenPlanetBiome(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock =  (byte) Blocks.forgottenGrass.blockID;
        this.fillerBlock =  (byte) Blocks.forgottenDirt.blockID;
        this.theBiomeDecorator.treesPerChunk = 7;
        this.theBiomeDecorator.deadBushPerChunk = 5;
        this.theBiomeDecorator.reedsPerChunk = 0;
        this.theBiomeDecorator.cactiPerChunk = 0;
        this.treeGenerator = new ForgottenPlanetTreeGenerator(true);
        this.theBiomeDecorator.generateLakes = true;
        this.abandonedHutGenerator = new ForgottenPlanetAbandonedHutGenerator();
        this.largeAbandonedHutGenerator = new ForgottenPlanetLargeAbandonedHutGenerator();
        this.fuelGen = new ForgottenPlanetOreGenerator(Blocks.forgottenFuelOre.blockID, 3, 3, 3, 3, 10);
        this.dustGen = new ForgottenPlanetOreGenerator(Blocks.forgottenDustOre.blockID, 4, 2, 4, 3, 20);
        this.theBiomeDecorator.treesPerChunk = 15;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.setDisableRain();
        
        
        //this.spawnableMonsterList.add(new SpawnListEntry(EntityBanditWarlord.class, 1, 1, 1));
    }


    /**
     * Allocate a new BiomeDecorator for this BiomeGenBase
     */
    @Override
    public BiomeDecorator createBiomeDecorator()
    {   
        return new ForgottenPlanetBiomeDecorator(this);
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    @Override
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return treeGenerator;
    }

    @Override
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        long time;

        if (par2Random.nextInt(1) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            treeGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        
        if (par2Random.nextInt(1) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            treeGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        

        if (par2Random.nextInt(50) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            abandonedHutGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
        
        if (par2Random.nextInt(100) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            largeAbandonedHutGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
        
        if (par2Random.nextInt(10) == 0)
        {
        	int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            fuelGen.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
        
        if (par2Random.nextInt(20) == 0)
        {
        	int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            dustGen.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
        
        
        
    }
}