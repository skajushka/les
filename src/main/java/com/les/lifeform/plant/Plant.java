package com.les.lifeform.plant;

import com.les.lifeform.LifeForm;

public interface Plant extends LifeForm {

	public void introduce();
	public double getHeight();
	public void setHeight(double height);
	public void grow(double energy);
	
}
