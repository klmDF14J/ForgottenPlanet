package com.roboyobo.forgottenPlanet.mob.render;

import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedCreeper;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedCreeper;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderEmblazonedCreeper extends RenderLiving
{
 protected ModelEmblazonedCreeper model;
 
 public RenderEmblazonedCreeper (ModelEmblazonedCreeper modelTutorial, float f)
 {
	 super(modelTutorial, f);
	 model = ((ModelEmblazonedCreeper)mainModel);
 }
 
 public void renderEmblazonedCreeper(EntityEmblazonedCreeper entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
	 	renderEmblazonedCreeper((EntityEmblazonedCreeper)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
	 	renderEmblazonedCreeper((EntityEmblazonedCreeper)par1Entity, par2, par4, par6, par8, par9);
    }
}