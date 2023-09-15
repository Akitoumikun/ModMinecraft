package com.time.moresword.core.init;

import com.time.moresword.SwordMod;
import com.time.moresword.common.material.ModArmorMaterial;
import com.time.moresword.common.material.ModItemTier;
import com.time.moresword.item.sword.CobaltSword;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwordMod.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new CobaltSword(ModItemTier.SAPPHIRE, 4, -2.4F, new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHTNING_SWORD = ITEMS.register("lightning_sword",
            () -> new CobaltSword(ModItemTier.SAPPHIRE, 4, -2.4F, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModItemTier.SAPPHIRE, 1, 1, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModItemTier.SAPPHIRE, 7, 1, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModItemTier.SAPPHIRE, 0, 0, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModItemTier.SAPPHIRE, 0, 0, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}