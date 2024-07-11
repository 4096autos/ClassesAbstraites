package com.weco;

import com.weco.feline.Lion;
import com.weco.feline.Puma;
import com.weco.feline.Tiger;

public class app {

    public static void main(String[] args) {
	Tiger ti = new Tiger();
	System.out.println(ti.whoAmI());
	ti.speak();
	System.out.println("------------");
	Lion li = new Lion();
	System.out.println(li.whoAmI());
	li.speak();
	System.out.println("------------");
	Puma pu = new Puma();
	System.out.println(pu.whoAmI());
	pu.speak();

    }

}