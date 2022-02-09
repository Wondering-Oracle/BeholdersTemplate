package com.silicateseer.beholdertech.item;

import com.silicateseer.beholdertech.BeholderTech;
import com.silicateseer.beholdertech.block.BTBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BTItems {

    public static final Item METAMORPHIC_WHEAT_SEEDS = registerItem("metamorphic_wheat_seeds",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item METAMORPHIC_BEETROOT_SEEDS = registerItem("metamorphic_beetroot_seeds",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item GOLDENDROP_SEEDS = registerItem("goldendrop_seeds",
            new AliasedBlockItem(BTBlocks.GOLDENDROP, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item FERREL_SEEDS = registerItem("ferrel_seeds",
            new AliasedBlockItem(BTBlocks.FERREL, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item GOLD_OREROOT_SEEDS = registerItem("gold_oreroot_seeds",
            new AliasedBlockItem(BTBlocks.GOLD_OREROOT, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item IRON_OREROOT_SEEDS = registerItem("iron_oreroot_seeds",
            new AliasedBlockItem(BTBlocks.IRON_OREROOT, new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item COPPER_OREROOT_SEEDS = registerItem("copper_oreroot_seeds",
            new AliasedBlockItem(BTBlocks.COPPER_OREROOT, new Item.Settings().group(ItemGroup.MATERIALS)));

    public static final Item GOLDENDROP_HAY = registerItem("goldendrop",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
    public static final Item FERREL_HAY = registerItem("ferrel",
            new Item(new Item.Settings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BeholderTech.MODID, name), item);
    }

    public static void registerBTItems() {
        BeholderTech.LOGGER.info("Registering BeholderTech Items");
    }
}
