package com.roboyobo.forgottenPlanet.item;

public class ItemID {
	
	private static int startID = 5000;
	private static int idsCycled = 0;
	
	public static int forgottenFuel = getNextID();
	public static int forgottenDust = getNextID();
	public static int forgottenApple = getNextID();
	public static int forgottenPortalPlacer = getNextID();
	public static int forgottenFlowerStrands = getNextID();
	public static int forgottenFlowerMesh = getNextID();
	
	public static int getNextID() {
		int id = startID + idsCycled;
		idsCycled++;
		return id;
	}
}
