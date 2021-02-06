package com.foxsaysderp.equinox;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Equinox.MODID, version = Equinox.VERSION)
public class Equinox
{
    public static final String MODID = "EQUINOX";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        Item eqiunoxium = new ModItem("equinoxium");
        GameRegistry.registerItem(equinoxium, "equinoxium");
        
        Block equinoxiumOre = new ModBlock(Material.rock, "equinoxiumOre");
        GameRegistry.registerBlock(equinoxiumOre, "equinoxiumOre");
        
        Block equinoxiumOre = new ModBlock(Material.rock, "equinoxiumOre", equinoxium);
    }
    private class ModBlock extends Block
    {
        private Item toDrop;
        
        public ModBlock(Material material, String blockName, Item toDrop)
        {
            super(material);
            this.setBlockName(blockName);
            this.setBlockTextureName(MODID + ":" + blockName);
            this.setCreativeTab(CreativeTabs.tabBlock);
            this.setHardness(15.0F);
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
        private class ModItem extends Item
    {
        public ModItem(String itemName)
        {
            this.setUnlocalizedName(itemName);
            this.setTextureName(MODID + ":" + itemName);
            this.setCreativeTab(CreativeTabs.tabMisc);
        }

    }
}
