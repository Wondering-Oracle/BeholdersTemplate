package com.silicateseer.beholdertech.util;

import com.silicateseer.beholdertech.block.BTBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BTRenderHelper {
    public static void setRenderLayers(){
        BlockRenderLayerMap.INSTANCE.putBlock(BTBlocks.GOLDENDROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BTBlocks.FERREL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BTBlocks.GOLD_OREROOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BTBlocks.IRON_OREROOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BTBlocks.COPPER_OREROOT, RenderLayer.getCutout());
    }
}
