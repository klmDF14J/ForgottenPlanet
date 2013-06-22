package com.roboyobo.forgottenPlanet.handler;

import com.roboyobo.forgottenPlanet.achievement.Achievements;
import com.roboyobo.forgottenPlanet.block.Blocks;
import com.roboyobo.forgottenPlanet.item.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler 
{
        //This is how you check if a player has crafted something that returns the block/item you want them to gain an achievement for
        @Override
        public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) 
        {
                if (item.itemID == Items.forgottenFlowerStrands.itemID)
                {
                        player.addStat(Achievements.craftStrand, 1);
                }
                else if(item.itemID == Items.forgottenFlowerMesh.itemID) {
                	player.addStat(Achievements.craftMesh, 1);
                }
                else if(item.itemID == Items.forgottenPortalPlacer.itemID) {
                	player.addStat(Achievements.craftPortalPlacer, 1);
                }
                else if(item.itemID == Blocks.brick1.blockID || item.itemID == Blocks.brick2.blockID || item.itemID == Blocks.brick3.blockID) {
                	player.addStat(Achievements.craftBricks, 1);
                }
        }

        
        //This is how you check if a player has smelted something that returns the block/item you want them to gain an achievement for
        @Override
        public void onSmelting(EntityPlayer player, ItemStack item) 
        {
        	
        }
}