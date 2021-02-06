package com.foxsaysderp.equinox;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ModBlock extends Block
{
    private Item toDrop;
    
    public ModBlock(Material material, String blockName, Item toDrop)
    {
        super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + blockName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(10.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.toDrop = toDrop;
    }
    
    @Override
    public Item getItemDropped(int i, Random random, int j)
    {
        if(toDrop != null)
        {
            return toDrop;
        }
        else return Item.getItemFromBlock(this);
    }
}
