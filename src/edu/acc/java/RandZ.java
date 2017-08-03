package edu.acc.java;

import java.util.Random;

public class RandZ {
	
	private int z;
	
	public RandZ() {
		Random rand = new Random();
		z = rand.nextInt(100);
	}
	
	public RandZ random_z() {
		return this;
	}
	
	public int getZ() {
		return z;
	}

}
