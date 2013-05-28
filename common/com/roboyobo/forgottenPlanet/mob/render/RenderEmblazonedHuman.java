package com.roboyobo.forgottenPlanet.mob.render;

import com.roboyobo.forgottenPlanet.mob.entity.EntityEmblazonedHuman;
import com.roboyobo.forgottenPlanet.mob.model.ModelEmblazonedHuman;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderEmblazonedHuman extends RenderLiving
{
 protected ModelEmblazonedHuman model;
 
 public RenderEmblazonedHuman (ModelEmblazonedHuman modelTutorial, float f)
 {
	 super(modelTutorial, f);
	 model = ((ModelEmblazonedHuman)mainModel);
 }
 
 public void renderEmblazonedHuman(EntityEmblazonedHuman entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
	 	renderEmblazonedHuman((EntityEmblazonedHuman)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
	 	renderEmblazonedHuman((EntityEmblazonedHuman)par1Entity, par2, par4, par6, par8, par9);
    }
}