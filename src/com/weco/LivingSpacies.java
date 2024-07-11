package com.weco;

abstract public class LivingSpacies {
    protected String aName;
    
    public String whoAmI() {
	return aName;
    }
    
    abstract public void eat();
    abstract public void sleep();
    abstract public void speak();
}