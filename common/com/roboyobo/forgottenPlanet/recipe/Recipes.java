package com.roboyobo.forgottenPlanet.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.roboyobo.forgottenPlanet.block.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void initRecipes() {
		GameRegistry.addSmelting(Blocks.cobble1.blockID, new ItemStack(Blocks.stone1), 0F);
		GameRegistry.addRecipe(new ItemStack(Blocks.brick1, 4), new Object[]{"XX","XX",'X', Blocks.stone1});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.plank1, 4), new ItemStack(Blocks.log1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.plank2, 4), new ItemStack(Blocks.log2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.plank3, 4), new ItemStack(Blocks.log3));
		
		GameRegistry.addRecipe(new ItemStack(Blocks.portal, 6), new Object[]{"XXX", "XXX", "XXX", 'X', Block.dirt});
	}
}
