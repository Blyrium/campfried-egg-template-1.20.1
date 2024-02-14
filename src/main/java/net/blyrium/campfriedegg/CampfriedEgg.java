package net.blyrium.campfriedegg;

import net.blyrium.campfriedegg.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CampfriedEgg implements ModInitializer {
	public static final String MOD_ID = "campfriedegg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}