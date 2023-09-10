package com.time.moresword.core.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.time.moresword.SwordMod;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SwordMod.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("better",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.bettersword"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ItemInit.SAPPHIRE.get()); 
                        pOutput.accept(ItemInit.RAW_SAPPHIRE.get());
                        pOutput.accept(Items.DIAMOND);
                    
                        
                        
                    })
                    .build());


    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}