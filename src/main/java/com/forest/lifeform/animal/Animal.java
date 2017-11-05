package com.forest.lifeform.animal;

import com.forest.lifeform.LifeForm;

public interface Animal extends LifeForm {

	public String getName();
	public void setName(String name);
	public char getSex();
	public void setSex(char sex);
	public int getHunger();
	public void setHunger(int hunger);
	public void checkHunger();
	public void feed(int portions);
	public void feed();
	public void incrementHunger();
	public void pooPoo();
	public void sleep();
	public void play(Animal animal);
	abstract public void voice(); 
	public void introduce();
}
