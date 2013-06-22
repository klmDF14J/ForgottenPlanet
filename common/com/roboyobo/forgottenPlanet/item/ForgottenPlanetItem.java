package com.roboyobo.forgottenPlanet.item;

import java.util.List;

import com.roboyobo.forgottenPlanet.ForgottenPlanet;
import com.roboyobo.forgottenPlanet.block.Blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ForgottenPlanetItem extends Item
{
    public ForgottenPlanetItem(int par1)
    {
        super(par1);
        this.setCreativeTab(ForgottenPlanet.forgottenPlanetItems);
    }
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    	if(this.itemID == Items.forgottenFlowerStrands.itemID) {
    		par3List.add("That poor little flower...");
    		par3List.add("Looks sturdy enough to make some kind of mesh");
    	}
    	
    	else if(this.itemID == Items.forgottenFlowerMesh.itemID) {
    		par3List.add("By weaving together some flowers, you have created a sturdy mesh");
    	}
    }
}
