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

    public static final RegistryObject<CreativeModeTab> MORESWORD_TAB = CREATIVE_MODE_TABS.register("better",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.moresword"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ItemInit.SAPPHIRE.get()); 
                        pOutput.accept(ItemInit.RAW_SAPPHIRE.get());
                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(BlockInit.SAPPHIRE_BLOCK.get());
                        pOutput.accept(BlockInit.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(BlockInit.SAPPHIRE_ORE.get());
                        pOutput.accept(ItemInit.SAPPHIRE_SWORD.get());
                        pOutput.accept(ItemInit.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ItemInit.SAPPHIRE_AXE.get());
                        pOutput.accept(ItemInit.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ItemInit.SAPPHIRE_HOE.get());

                        pOutput.accept(ItemInit.SAPPHIRE_HELMET.get());
                        pOutput.accept(ItemInit.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ItemInit.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ItemInit.SAPPHIRE_BOOTS.get());
                        pOutput.accept(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get());
                        
                        
                    })
                    .build());


    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}