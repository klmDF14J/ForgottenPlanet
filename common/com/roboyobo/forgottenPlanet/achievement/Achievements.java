package com.roboyobo.forgottenPlanet.achievement;

import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.item.Items;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Achievements {
	
	private static int startID = 3000;
	private static int idsCycled = 0;
	
	public static final Achievement pickupFlower = new Achievement(getNextID(), "pickupFlower", -1, -2, Blocks.flower1, null).registerAchievement();
	public static final Achievement craftStrand = new Achievement(getNextID(), "craftStrand", 1, -2, Items.forgottenFlowerStrands, pickupFlower).registerAchievement();
	public static final Achievement craftMesh = new Achievement(getNextID(), "craftMesh", 1, -4, Items.forgottenFlowerMesh, craftStrand).registerAchievement();
	public static final Achievement craftPortalPlacer = new Achievement(getNextID(), "craftPortalPlacer", 3, -4, Items.forgottenPortalPlacer, craftMesh).registerAchievement();
	public static final Achievement enterForgottenPlanet = new Achievement(getNextID(), "enterForgottenPlanet", 5, -4, Blocks.portal, craftPortalPlacer).registerAchievement();
	public static final Achievement pickupWood = new Achievement(getNextID(), "pickupWood", 5, -2, Blocks.log1, enterForgottenPlanet).registerAchievement();
	public static final Achievement mineCobble = new Achievement(getNextID(), "mineCobble", 7, -4, Blocks.cobble1, enterForgottenPlanet).registerAchievement();
	public static final Achievement craftBricks = new Achievement(getNextID(), "craftBricks", 9, -4, Blocks.brick1, mineCobble).registerAchievement();
	
	public static AchievementPage page = new AchievementPage("Forgotten Planet", pickupFlower, craftStrand, craftMesh, craftPortalPlacer, enterForgottenPlanet, pickupWood, mineCobble, craftBricks);
	
	public static void init() {
		addName("pickupFlower", "Herbalist", "Gather Some Unusual Flowers");
		addName("craftStrand", "Flower Smasher", "Pull Apart A Forgotten Flower");
		addName("craftMesh", "Weaving With Flowers", "Create A Sturdy Mesh Using Flowers");
		addName("craftPortalPlacer", "Elemental Experimenter", "Fiddle With A Block Of Gold, Lava, Forgotten Flower Mesh And A Block Of Emerald");
		addName("enterForgottenPlanet", "Planetary Explorer", "Enter The Forgotten Planet");
		addName("pickupWood", "Getting Wood... Again", "Chop Down Some Colourful Trees");
		addName("mineCobble", "Cobbley Cobble", "Mine Some Foreign Cobble");
		addName("craftBricks", "Brick Builder", "Craft Some Unknown Bricks");
		AchievementPage.registerAchievementPage(page);
	}
	
	private static int getNextID() {
		int id = startID + idsCycled;
		idsCycled++;
		return id;
	}
	
	private static void addAchievementName(String ach, String name)
	{
	        LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private static void addAchievementDesc(String ach, String desc)
	{
	        LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}
	
	public static void addName(String par1, String par2, String par3) {
	    addAchievementName(par1, par2);
        addAchievementDesc(par1, par3);
	}
}
