package com.foxsaysderp.equinox;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Equinox.MODID, version = Equinox.VERSION)
public class Main
{
    public static final String MODID = "EQUINOX";
    public static final String VERSION = "1.0";
     
    public static Item equinoxium;
    public static Block equinoxiumOre;
   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        amethyst = new ModItem("equinoxium");
        GameRegistry.registerItem(equinoxium, "equinoxium");
        
        amethystOre = new ModBlock(Material.rock, "equinoxiumOre", equinoxium);
        GameRegistry.registerBlock(equinoxium, "equinoxiumOre");
        
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(equinoxiumOre, 6), 0);
    }
    
}
