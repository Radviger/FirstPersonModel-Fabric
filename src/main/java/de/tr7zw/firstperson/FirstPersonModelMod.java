package de.tr7zw.firstperson;

import net.fabricmc.api.ModInitializer;

public class FirstPersonModelMod implements ModInitializer {
	
	//Helper var
	public static boolean hideNextHeadArmor = false;
	public static boolean isRenderingPlayer = false;
	public static boolean hideNextHeadItem = false; //Pumpkin mostly
	
	@Override
	public void onInitialize() {
		System.out.println("Loaded FirstPerson Models");
	}
}
