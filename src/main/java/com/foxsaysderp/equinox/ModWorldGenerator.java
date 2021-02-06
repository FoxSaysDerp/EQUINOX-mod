package com.foxsaysderp.equinox;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Equinox.MODID, version = Equinox.VERSION)

public class ModWorldGenerator implements IWorldGenerator
{
    private Block block;
    private int veinSize;

    ModWorldGenerator(Block block, int veinSize)
    {
        this.block = block;
        this.veinSize = veinSize;
    }    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        // TODO Auto-generated method stub
        
    }
}
