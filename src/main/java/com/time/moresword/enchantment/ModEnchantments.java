package com.time.moresword.enchantment;

import com.time.moresword.SwordMod;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SwordMod.MODID);

    public static RegistryObject<Enchantment> VoltaicRevolt =
            ENCHANTMENTS.register("voltaic_revolt",
                    () -> new VoltaicRevolt(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));


    public static void register(IEventBus modEventBus) {
        ENCHANTMENTS.register(modEventBus);
    }
}