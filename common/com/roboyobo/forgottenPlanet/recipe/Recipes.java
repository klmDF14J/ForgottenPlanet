package com.roboyobo.forgottenPlanet.recipe;

import net.minecraft.item.ItemStack;

import com.roboyobo.forgottenPlanet.block.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void initRecipes() {
		GameRegistry.addSmelting(Blocks.emblazonedCobble.blockID, new ItemStack(Blocks.emblazonedStone), 0F);
		GameRegistry.addRecipe(new ItemStack(Blocks.genericBlock, 1, 4), new Object[]{"XX","XX",'X', Blocks.emblazonedStone});
	}
}
