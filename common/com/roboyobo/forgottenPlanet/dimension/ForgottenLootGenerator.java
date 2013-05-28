package com.roboyobo.forgottenPlanet.dimension;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ForgottenLootGenerator {
	
	private static ArrayList<ItemStack> badLoot = new ArrayList<ItemStack>();
	private static ArrayList<ItemStack> averageLoot = new ArrayList<ItemStack>();
	private static ArrayList<ItemStack> goodLoot = new ArrayList<ItemStack>();
	private static ArrayList<ItemStack> epicLoot = new ArrayList<ItemStack>();
	
	
	private static int lootBandToUse = 0;
	
	static ItemStack stack = new ItemStack(0, 0, 0);
	
	public static void init() {
		badLoot.add(new ItemStack(Item.arrow));
		badLoot.add(new ItemStack(Item.appleRed));
		badLoot.add(new ItemStack(Item.bowlEmpty));
		badLoot.add(new ItemStack(Item.clay));
		badLoot.add(new ItemStack(Item.egg));
		
		averageLoot.add(new ItemStack(Item.compass));
		averageLoot.add(new ItemStack(Item.cookie));
		averageLoot.add(new ItemStack(Item.brewingStand));
		averageLoot.add(new ItemStack(Item.book));
		averageLoot.add(new ItemStack(Item.enderPearl));
		
		goodLoot.add(new ItemStack(Item.appleGold));
		goodLoot.add(new ItemStack(Item.bucketLava));
		goodLoot.add(new ItemStack(Item.diamond));
		goodLoot.add(new ItemStack(Item.magmaCream));
		goodLoot.add(new ItemStack(Item.expBottle));
		
		epicLoot.add(new ItemStack(Item.pickaxeDiamond));
		epicLoot.add(new ItemStack(Item.recordStrad));
		epicLoot.add(new ItemStack(Item.helmetDiamond));
		epicLoot.add(new ItemStack(Item.recordWait));
		epicLoot.add(new ItemStack(Item.swordDiamond));
		
	}
	
	public static void fillChest(IInventory inventory, int multiplier, int quality) 
	{
		//init();
		if(inventory == null)
		{
			init();
			System.out.println("Error trying to fill empty chest");
			return;
		}

		/*if(badLoot == null || averageLoot == null || goodLoot == null || epicLoot == null) {
			init();
		}*/

		Random rand = new Random();
		for(int i = 0; i < multiplier; i++)
		{
			lootBandToUse = quality;
			
			int slot = rand.nextInt(inventory.getSizeInventory());
			finaliseLoot(rand, slot, inventory);
			
		}
	}
	
	private static void finaliseLoot(Random rand, int slot, IInventory inventory) {
		if(lootBandToUse == 0) {
			int i = (new Random()).nextInt(badLoot.size());
			stack = badLoot.get(i).copy();
		}
		else if(lootBandToUse == 1) {
			int i = (new Random()).nextInt(averageLoot.size());
			stack = averageLoot.get(i).copy();
		}
		else if(lootBandToUse == 2) {
			int i = (new Random()).nextInt(goodLoot.size());
			stack = goodLoot.get(i).copy();
		}
		else if(lootBandToUse == 3) {
			int i = (new Random()).nextInt(epicLoot.size());
			stack = epicLoot.get(i).copy();
		}
		inventory.setInventorySlotContents(slot, stack);
	}
}
