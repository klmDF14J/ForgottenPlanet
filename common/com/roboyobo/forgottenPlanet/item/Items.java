package com.roboyobo.forgottenPlanet.item;

import com.roboyobo.forgottenPlanet.handler.FuelHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static Item forgottenFuel, forgottenDust, forgottenApple;
	public static Item forgottenPortalPlacer;
	public static Item forgottenFlowerStrands, forgottenFlowerMesh;
	
	public static void initItems() {
		forgottenFuel = new ForgottenPlanetItem(ItemID.forgottenFuel).setUnlocalizedName("ForgottenPlanet:Forgotten Fuel");
		forgottenDust = new ForgottenPlanetItem(ItemID.forgottenDust).setUnlocalizedName("ForgottenPlanet:Forgotten Dust");
		forgottenApple = new ForgottenPlanetItemFood(ItemID.forgottenApple, 4, 0.3F, false).setUnlocalizedName("ForgottenPlanet:Forgotten Apple");
		forgottenPortalPlacer = new ForgottenPlanetPortalPlacer(ItemID.forgottenPortalPlacer).setUnlocalizedName("ForgottenPlanet:Forgotten Portal Placer");
		forgottenFlowerStrands = new ForgottenPlanetItem(ItemID.forgottenFlowerStrands).setUnlocalizedName("ForgottenPlanet:Forgotten Flower Strands");
		forgottenFlowerMesh = new ForgottenPlanetItem(ItemID.forgottenFlowerMesh).setUnlocalizedName("ForgottenPlanet:Forgotten Flower Mesh");
	}
	
	public static void addNames() {
		LanguageRegistry.addName(forgottenFuel, "Forgotten Fuel");
		LanguageRegistry.addName(forgottenDust, "Forgotten Dust");
		LanguageRegistry.addName(forgottenApple, "Forgotten Apple");
		LanguageRegistry.addName(forgottenPortalPlacer, "Elementized Dust");
		LanguageRegistry.addName(forgottenFlowerStrands, "Forgotten Flower Stem");
		LanguageRegistry.addName(forgottenFlowerMesh, "Forgotten Flower Mesh");
	}
	
	
	
	public static void setupItems() {
		initItems();
		addNames();
	}
}
