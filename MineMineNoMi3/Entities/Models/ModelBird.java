package MineMineNoMi3.Entities.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBird extends ModelBase
{
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
  
	public ModelBird()
	{
		textureWidth = 64;
		textureHeight = 64;
    
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(-3.5F, -1F, -4F, 7, 3, 7);
	      Shape1.setRotationPoint(0F, 0F, 0F);
	      Shape1.setTextureSize(64, 32);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 1.570796F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 0);
	      Shape2.addBox(-2.5F, -0.5F, 3F, 5, 2, 6);
	      Shape2.setRotationPoint(0F, 0F, 0F);
	      Shape2.setTextureSize(64, 32);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 1.570796F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 0);
	      Shape3.addBox(3.5F, 0F, -3F, 5, 1, 4);
	      Shape3.setRotationPoint(0F, 0F, 0F);
	      Shape3.setTextureSize(64, 32);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 1.570796F, 0F);
	      Shape4 = new ModelRenderer(this, 0, 0);
	      Shape4.addBox(-8.5F, 0F, -3F, 5, 1, 4);
	      Shape4.setRotationPoint(0F, 0F, 0F);
	      Shape4.setTextureSize(64, 32);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, 1.570796F, 0F);
	      Shape5 = new ModelRenderer(this, 0, 0);
	      Shape5.addBox(-2.5F, -1.5F, -8F, 5, 4, 4);
	      Shape5.setRotationPoint(0F, 0F, 0F);
	      Shape5.setTextureSize(64, 32);
	      Shape5.mirror = true;
	      setRotation(Shape5, 0F, 1.570796F, 0F);
	}
  
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}

