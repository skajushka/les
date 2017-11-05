package com.forest.lifeform.plant;

import com.forest.lifeform.LifeForm;

public interface Plant extends LifeForm {

	public void introduce();
	public double getHeight();
	public void setHeight(double height);
	public void grow(double energy);
	
}
