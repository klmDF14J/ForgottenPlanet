package com.roboyobo.forgottenPlanet.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static Item forgottenIgniter;
	
	public static void initItems() {
		forgottenIgniter = new ForgottenIgniter(ItemID.forgottenIgniter).setUnlocalizedName("Forgotten Igniter");
	}
	
	public static void addNames() {
		LanguageRegistry.addName(forgottenIgniter, "Forgotten Igniter");
	}
	
	public static void setupItems() {
		initItems();
		addNames();
	}
}
