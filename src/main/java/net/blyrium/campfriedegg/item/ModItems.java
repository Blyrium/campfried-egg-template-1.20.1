package net.blyrium.campfriedegg.item;

import net.blyrium.campfriedegg.CampfriedEgg;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .snack()
                    .meat()
                    .hunger(4)
                    .saturationModifier(0.55F)
                    .build())));

    private static void addItemsToCorrectTabItemGroup(FabricItemGroupEntries entries) {
     entries.add(FRIED_EGG);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CampfriedEgg.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CampfriedEgg.LOGGER.info("Registering mod items for " + CampfriedEgg.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToCorrectTabItemGroup);
    }
}
