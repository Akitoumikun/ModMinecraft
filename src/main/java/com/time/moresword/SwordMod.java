package com.time.moresword;

import com.mojang.logging.LogUtils;
import com.time.moresword.core.init.BlockInit;
import com.time.moresword.core.init.ItemInit;
import com.time.moresword.core.init.ModCreativeModTabs;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SwordMod.MODID)
public class SwordMod {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "moresword";

    public SwordMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        
        ItemInit.register(modEventBus);
        
        BlockInit.register(modEventBus);
       
        ModCreativeModTabs.register(modEventBus);
        
        
      
        
        modEventBus.addListener(this::addCreative);
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ItemInit.RAW_SAPPHIRE);
        }
           
        }

    private void setup(final FMLCommonSetupEvent event) {
        
    }
}