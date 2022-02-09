package com.silicateseer.beholdertech.block;

import com.silicateseer.beholdertech.BeholderTech;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BTBlocks {

    public static final Block GOLDENDROP = registerBlockWithoutItem("goldendrop",
            new GoldendropBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GOLD).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));
    public static final Block FERREL = registerBlockWithoutItem("ferrel",
            new FerrelBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.LIGHT_GRAY).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));
    public static final Block GOLD_OREROOT = registerBlockWithoutItem("gold_oreroot",
            new GoldOrerootBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GOLD).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));
    public static final Block IRON_OREROOT = registerBlockWithoutItem("iron_oreroot",
            new IronOrerootBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GOLD).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));
    public static final Block COPPER_OREROOT = registerBlockWithoutItem("copper_oreroot",
            new CopperOrerootBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GOLD).noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP)));

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItems(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BeholderTech.MODID, name), block);
    }
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(BeholderTech.MODID, name), block);
    }
    private static Item registerBlockItems(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBTBlocks() {
        BeholderTech.LOGGER.info("Registering BeholderTech Blocks");
    }
}
