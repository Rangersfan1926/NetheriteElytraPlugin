package com.example.netheriteelytra;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.UUID;

public class ItemManager {
    public static ItemStack NETHERITE_ELYTRA;

    public static void init() {
        createNetheriteElytra();
    }

    private static void createNetheriteElytra() {
        ItemStack item = new ItemStack(Material.ELYTRA, 1);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName("§5Netherite Elytra");
            meta.addAttributeModifier(Attribute.GENERIC_ARMOR,
                new AttributeModifier(UUID.randomUUID(), "netherite_elytra_armor", 8.0,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
            meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS,
                new AttributeModifier(UUID.randomUUID(), "netherite_elytra_toughness", 3.0,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
            meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE,
                new AttributeModifier(UUID.randomUUID(), "netherite_elytra_knockback", 0.1,
                    AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST));
            item.setItemMeta(meta);
        }
        NETHERITE_ELYTRA = item;
    }
}
