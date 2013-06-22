package com.roboyobo.forgottenPlanet.block;

public class BlockID {
	private static int startID = 3000;
	private static int idsCycled;
	
	/*
	 * World Gen IDs. Need To Be < 256. Stone needs to be 180 for some reason.
	 */
	public static int stone1 = 230;
	public static int stone2 = 231;
	public static int stone3 = 232;
	public static int stone4 = 233;
	
	public static int forgottenGrass = 234;
	public static int emblazonedGrass = 235;
	public static int enchantedGrass = 236;
	public static int toxifiedGrass = 237;
	
	public static int forgottenDirt = 238;
		
	
	/*
	 * Normal Block IDs
	 */
	public static int forgottenSand = getNextID();
	
	public static int forgottenLeaves1 = getNextID();
	public static int forgottenLeaves2 = getNextID();
	public static int forgottenLeaves3 = getNextID();
	
	public static int portal = getNextID();
	public static int portalframe = getNextID();

	public static int emblazonedLog = getNextID();
	public static int enchantedLog = getNextID();
	public static int toxifiedLog = getNextID();
	
	public static int emblazonedPlank = getNextID();
	public static int enchantedPlank = getNextID();
	public static int toxifiedPlank = getNextID();
	
	public static int brick1 = getNextID();
	public static int brick2 = getNextID();
	public static int brick3 = getNextID();
	public static int brick4 = getNextID();
	
	public static int dungeonCobble1 = getNextID();
	public static int dungeonCobble2 = getNextID();
	public static int dungeonCobble3 = getNextID();
	public static int dungeonCobble4 = getNextID();
	
	public static int forgottenFuelOre = getNextID();
	public static int forgottenDustOre = getNextID();
	public static int forgottenGemOre = getNextID();
	
	public static int cobble1 = getNextID();
	public static int cobble2 = getNextID();
	public static int cobble3 = getNextID();
	public static int cobble4 = getNextID();
	
	public static int flower1 = getNextID();
	
	public static int getNextID() {
		int id = startID + idsCycled;
		idsCycled++;
		return id;
	}
	

}
