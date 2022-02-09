package com.silicateseer.beholdertech;

import com.silicateseer.beholdertech.block.BTBlocks;
import com.silicateseer.beholdertech.item.BTItems;
import com.silicateseer.beholdertech.util.BTRenderHelper;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeholderTech implements ModInitializer {
	public static final String MODID = "beholdertech";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		BTItems.registerBTItems();
		BTBlocks.registerBTBlocks();

		BTRenderHelper.setRenderLayers();
	}
}
