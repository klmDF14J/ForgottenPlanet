package com.roboyobo.forgottenPlanet.dimension;

import java.util.Random;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EmblazonedForestBiome extends BiomeGenBase
{
	public WorldGenerator treeGenerator;
	public WorldGenerator abandonedHutGenerator;
	public WorldGenerator largeAbandonedHutGenerator;

	public byte sTopBlock;
	public byte sFillerBlock;

    public EmblazonedForestBiome(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.topBlock =  (byte) Blocks.emblazonedGrass.blockID;
        this.fillerBlock =  (byte) Blocks.forgottenDirt.blockID;
        this.theBiomeDecorator.treesPerChunk = 7;
        this.theBiomeDecorator.deadBushPerChunk = 5;
        this.theBiomeDecorator.reedsPerChunk = 0;
        this.theBiomeDecorator.cactiPerChunk = 0;
        this.treeGenerator = new ForgottenPlanetTreeGenerator(true);
        this.theBiomeDecorator.generateLakes = false;
        this.abandonedHutGenerator = new ForgottenPlanetAbandonedHutGenerator();
        this.largeAbandonedHutGenerator = new ForgottenPlanetLargeAbandonedHutGenerator();
        this.theBiomeDecorator.treesPerChunk = 10;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        
        /*this.spawnableMonsterList.add(new SpawnListEntry(EntityBanditWarlord.class, 1, 1, 1));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityBanditWarrior.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityBanditArcher.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityDustySkeleton.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityGhost.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityDesertWolf.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityStoneSoldier.class, 8, 4, 4));*/
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
        super.decorate(par1World, par2Random, par3, par4);

        long time;

        if (par2Random.nextInt(10) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            treeGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }

        if (par2Random.nextInt(50) == 0)
        {
        	Minecraft.getMinecraft().mcProfiler.startSection("Forgotten Planet Abandoned Hut");
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            abandonedHutGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        	Minecraft.getMinecraft().mcProfiler.endSection();
        }
        
        if (par2Random.nextInt(100) == 0)
        {
        	Minecraft.getMinecraft().mcProfiler.startSection("Forgotten Planet Large Abandoned Hut");
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            largeAbandonedHutGenerator.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        	Minecraft.getMinecraft().mcProfiler.endSection();
        }
    }
}