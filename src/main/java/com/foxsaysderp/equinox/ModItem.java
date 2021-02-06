package com.foxsaysderp.equinox;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Equinox.MODID, version = Equinox.VERSION)

public class ModItem extends Item
    {
        public ModItem(String itemName)
        {
            this.setUnlocalizedName(itemName);
            this.setTextureName(Main.MODID + ":" + itemName);
            this.setCreativeTab(CreativeTabs.tabMisc);
        }
    }
