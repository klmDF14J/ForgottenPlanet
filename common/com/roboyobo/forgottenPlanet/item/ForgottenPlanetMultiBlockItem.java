package com.roboyobo.forgottenPlanet.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ForgottenPlanetMultiBlockItem extends ItemBlock
{
       public ForgottenPlanetMultiBlockItem(int par1)
       {
             super(par1);
             setHasSubtypes(true);
       }
      
       public String getUnlocalizedName(ItemStack itemstack)
       {
              String name = "";
              switch(itemstack.getItemDamage())
              {
                    case 0:
                    {
                           name = "portalFrame";
                           break;
                    }
                    case 1:
                    {
                           name = "nether";
                           break;
                    }
                    default: name = "broken";
              }
              return getUnlocalizedName();
       }
      
       public int getMetadata(int par1)
       {
             return par1;
       }
}