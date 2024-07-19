package net.subthy.cctweaks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.cctweaks.CCTWEAKS;
import net.subthy.cctweaks.item.custom.SequencedAssemblyItem;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CCTWEAKS.MOD_ID);

    // Base

    public static final RegistryObject<Item> Pokeball_base = ITEMS.register("pokeball_base",
            () -> new Item(new Item.Properties()));


    // Lids

    public static final RegistryObject<Item> Ancient_Feather_Ball_Lid = ITEMS.register("ancient_feather_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Citrine_Ball_Lid = ITEMS.register("ancient_citrine_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Azure_Ball_Lid = ITEMS.register("ancient_azure_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Gigaton_Ball_Lid = ITEMS.register("ancient_gigaton_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Great_Ball_Lid = ITEMS.register("ancient_great_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Heavy_Ball_Lid = ITEMS.register("ancient_heavy_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Ivory_Ball_Lid = ITEMS.register("ancient_ivory_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Jet_Ball_Lid = ITEMS.register("ancient_jet_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Leaden_Ball_Lid = ITEMS.register("ancient_leaden_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Origin_Ball_Lid = ITEMS.register("ancient_origin_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Poke_Ball_Lid = ITEMS.register("ancient_poke_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Roseate_Ball_Lid = ITEMS.register("ancient_roseate_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Slate_Ball_Lid = ITEMS.register("ancient_slate_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Ultra_Ball_Lid = ITEMS.register("ancient_ultra_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Verdant_Ball_Lid = ITEMS.register("ancient_verdant_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Wing_Ball_Lid = ITEMS.register("ancient_wing_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Azure_Ball_Lid = ITEMS.register("azure_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Beast_Ball_Lid = ITEMS.register("beast_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Cherish_Ball_Lid = ITEMS.register("cherish_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Citrine_Ball_Lid = ITEMS.register("citrine_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Dive_Ball_Lid = ITEMS.register("dive_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Dream_Ball_Lid = ITEMS.register("dream_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Dusk_Ball_Lid = ITEMS.register("dusk_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Fast_Ball_Lid = ITEMS.register("fast_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Friend_Ball_Lid = ITEMS.register("friend_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Great_Ball_Lid = ITEMS.register("great_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Heal_Ball_Lid = ITEMS.register("heal_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Heavy_Ball_Lid = ITEMS.register("heavy_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Level_Ball_Lid = ITEMS.register("level_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Love_Ball_Lid = ITEMS.register("love_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Lure_Ball_Lid = ITEMS.register("lure_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Luxury_Ball_Lid = ITEMS.register("luxury_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Master_Ball_Lid = ITEMS.register("master_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Moon_Ball_Lid = ITEMS.register("moon_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Nest_Ball_Lid = ITEMS.register("nest_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Net_Ball_Lid = ITEMS.register("net_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Park_Ball_Lid = ITEMS.register("park_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Poke_Ball_Lid = ITEMS.register("poke_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Premier_Ball_Lid = ITEMS.register("premier_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Quick_Ball_Lid = ITEMS.register("quick_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Repeat_Ball_Lid = ITEMS.register("repeat_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Roseate_Ball_Lid = ITEMS.register("roseate_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Safari_Ball_Lid = ITEMS.register("safari_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Slate_Ball_Lid = ITEMS.register("slate_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Sport_Ball_Lid = ITEMS.register("sport_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Timer_Ball_Lid = ITEMS.register("timer_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ultra_Ball_Lid = ITEMS.register("ultra_ball_lid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Verdant_Ball_Lid = ITEMS.register("verdant_ball_lid",
            () -> new Item(new Item.Properties()));

    // Others

    public static final RegistryObject<Item> Incomplete_Poke_Ball = ITEMS.register("incomplete_poke_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    // Sheets

    public static final RegistryObject<Item> Pokeball_Sheet = ITEMS.register("poke_ball_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Azure_Sheet = ITEMS.register("ancient_azure_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Citrine_Sheet = ITEMS.register("ancient_citrine_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Feather_Sheet = ITEMS.register("ancient_feather_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Gigaton_Sheet = ITEMS.register("ancient_gigaton_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Great_Sheet = ITEMS.register("ancient_great_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Heavy_Sheet = ITEMS.register("ancient_heavy_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Ivory_Sheet = ITEMS.register("ancient_ivory_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Jet_Sheet = ITEMS.register("ancient_jet_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Leaden_Sheet = ITEMS.register("ancient_leaden_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Origin_Sheet = ITEMS.register("ancient_origin_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Poke_Sheet = ITEMS.register("ancient_poke_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Roseate_Sheet = ITEMS.register("ancient_roseate_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Slate_Sheet = ITEMS.register("ancient_slate_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Ultra_Sheet = ITEMS.register("ancient_ultra_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Verdant_Sheet = ITEMS.register("ancient_verdant_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ancient_Wing_Sheet = ITEMS.register("ancient_wing_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Azure_Sheet = ITEMS.register("azure_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Beast_Sheet = ITEMS.register("beast_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Cherish_Sheet = ITEMS.register("cherish_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Citrine_Sheet = ITEMS.register("citrine_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Dive_Sheet = ITEMS.register("dive_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Dream_Sheet = ITEMS.register("dream_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Dusk_Sheet = ITEMS.register("dusk_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Fast_Sheet = ITEMS.register("fast_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Friend_Sheet = ITEMS.register("friend_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Great_Sheet = ITEMS.register("great_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Heal_Sheet = ITEMS.register("heal_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Heavy_Sheet = ITEMS.register("heavy_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Level_Sheet = ITEMS.register("level_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Love_Sheet = ITEMS.register("love_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Lure_Sheet = ITEMS.register("lure_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Luxury_Sheet = ITEMS.register("luxury_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Master_Sheet = ITEMS.register("master_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Moon_Sheet = ITEMS.register("moon_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Nest_Sheet = ITEMS.register("nest_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Net_Sheet = ITEMS.register("net_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Park_Sheet = ITEMS.register("park_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Premier_Sheet = ITEMS.register("premier_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Quick_Sheet = ITEMS.register("quick_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Repeat_Sheet = ITEMS.register("repeat_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Roseate_Sheet = ITEMS.register("roseate_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Safari_Sheet = ITEMS.register("safari_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Slate_Sheet = ITEMS.register("slate_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Sport_Sheet = ITEMS.register("sport_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Timer_Sheet = ITEMS.register("timer_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Ultra_Sheet = ITEMS.register("ultra_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Verdant_Sheet = ITEMS.register("verdant_sheet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
