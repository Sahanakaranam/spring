package com.xworkz.cosmetic;

public class Cosmetic {

	public Cosmetic() {
		super();
		System.out.println(this.getClass().getSimpleName());
	}

	public void enhanceTheBeauty() {
		System.out.println("invoked  enhanceTheBeauty()");
		System.out.println("enhanceTheBeauty");
	}

	public void makesFacePresentable() {
		System.out.println("invoked makesFacePresentable()");
		System.out.println("makesFacePresentable");
	}

}
