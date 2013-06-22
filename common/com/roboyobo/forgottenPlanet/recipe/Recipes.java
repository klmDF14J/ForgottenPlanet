package com.roboyobo.forgottenPlanet.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.item.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void initRecipes() {
		GameRegistry.addSmelting(Blocks.cobble1.blockID, new ItemStack(Blocks.stone1), 0F);
		GameRegistry.addSmelting(Blocks.cobble2.blockID, new ItemStack(Blocks.stone2), 0F);
		GameRegistry.addSmelting(Blocks.cobble3.blockID, new ItemStack(Blocks.stone3), 0F);
		GameRegistry.addSmelting(Blocks.cobble4.blockID, new ItemStack(Blocks.stone4), 0F);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.brick1, 4), new Object[]{"XX","XX",'X', Blocks.stone2});
		GameRegistry.addRecipe(new ItemStack(Blocks.brick2, 4), new Object[]{"XX","XX",'X', Blocks.stone3});
		GameRegistry.addRecipe(new ItemStack(Blocks.brick3, 4), new Object[]{"XX","XX",'X', Blocks.stone4});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.plank1, 4), new ItemStack(Blocks.log1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.plank2, 4), new ItemStack(Blocks.log2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.plank3, 4), new ItemStack(Blocks.log3));
		
		GameRegistry.addRecipe(new ItemStack(Items.forgottenFlowerStrands, 1), new Object[]{"A", 'A', Blocks.flower1});
		GameRegistry.addRecipe(new ItemStack(Items.forgottenFlowerMesh, 1), new Object[]{"AAA", "AAA", "AAA", 'A', Items.forgottenFlowerStrands});
		GameRegistry.addRecipe(new ItemStack(Items.forgottenPortalPlacer, 1), new Object[]{"AB", "CD", 'A', Block.blockGold, 'B', Item.bucketLava, 'C', Items.forgottenFlowerMesh, 'D', Block.blockEmerald});
	}
}
