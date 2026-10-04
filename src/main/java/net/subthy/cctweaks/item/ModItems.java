package net.subthy.cctweaks.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.subthy.cctweaks.CreateCobblemonTweaks;
import net.subthy.cctweaks.item.custom.SequencedAssemblyItem;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateCobblemonTweaks.MOD_ID);

    //Other
    public static final DeferredItem<Item> Incomplete_Poke_Ball = ITEMS.register("incomplete_poke_ball",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredItem<Item> Pokeball_base =
            ITEMS.registerSimpleItem("pokeball_base");


    // Lids

    public static final DeferredItem<Item> Ancient_Feather_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_feather_ball_lid");

    public static final DeferredItem<Item> Ancient_Citrine_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_citrine_ball_lid");

    public static final DeferredItem<Item> Ancient_Azure_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_azure_ball_lid");

    public static final DeferredItem<Item> Ancient_Gigaton_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_gigaton_ball_lid");

    public static final DeferredItem<Item> Ancient_Great_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_great_ball_lid");

    public static final DeferredItem<Item> Ancient_Heavy_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_heavy_ball_lid");

    public static final DeferredItem<Item> Ancient_Ivory_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_ivory_ball_lid");

    public static final DeferredItem<Item> Ancient_Jet_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_jet_ball_lid");

    public static final DeferredItem<Item> Ancient_Leaden_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_leaden_ball_lid");

    public static final DeferredItem<Item> Ancient_Origin_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_origin_ball_lid");

    public static final DeferredItem<Item> Ancient_Poke_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_poke_ball_lid");

    public static final DeferredItem<Item> Ancient_Roseate_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_roseate_ball_lid");

    public static final DeferredItem<Item> Ancient_Slate_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_slate_ball_lid");

    public static final DeferredItem<Item> Ancient_Ultra_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_ultra_ball_lid");

    public static final DeferredItem<Item> Ancient_Verdant_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_verdant_ball_lid");

    public static final DeferredItem<Item> Ancient_Wing_Ball_Lid =
            ITEMS.registerSimpleItem("ancient_wing_ball_lid");

    public static final DeferredItem<Item> Azure_Ball_Lid =
            ITEMS.registerSimpleItem("azure_ball_lid");

    public static final DeferredItem<Item> Beast_Ball_Lid =
            ITEMS.registerSimpleItem("beast_ball_lid");

    public static final DeferredItem<Item> Cherish_Ball_Lid =
            ITEMS.registerSimpleItem("cherish_ball_lid");

    public static final DeferredItem<Item> Citrine_Ball_Lid =
            ITEMS.registerSimpleItem("citrine_ball_lid");

    public static final DeferredItem<Item> Dive_Ball_Lid =
            ITEMS.registerSimpleItem("dive_ball_lid");

    public static final DeferredItem<Item> Dream_Ball_Lid =
            ITEMS.registerSimpleItem("dream_ball_lid");

    public static final DeferredItem<Item> Dusk_Ball_Lid =
            ITEMS.registerSimpleItem("dusk_ball_lid");

    public static final DeferredItem<Item> Fast_Ball_Lid =
            ITEMS.registerSimpleItem("fast_ball_lid");

    public static final DeferredItem<Item> Friend_Ball_Lid =
            ITEMS.registerSimpleItem("friend_ball_lid");

    public static final DeferredItem<Item> Great_Ball_Lid =
            ITEMS.registerSimpleItem("great_ball_lid");

    public static final DeferredItem<Item> Heal_Ball_Lid =
            ITEMS.registerSimpleItem("heal_ball_lid");

    public static final DeferredItem<Item> Heavy_Ball_Lid =
            ITEMS.registerSimpleItem("heavy_ball_lid");

    public static final DeferredItem<Item> Level_Ball_Lid =
            ITEMS.registerSimpleItem("level_ball_lid");

    public static final DeferredItem<Item> Love_Ball_Lid =
            ITEMS.registerSimpleItem("love_ball_lid");

    public static final DeferredItem<Item> Lure_Ball_Lid =
            ITEMS.registerSimpleItem("lure_ball_lid");

    public static final DeferredItem<Item> Luxury_Ball_Lid =
            ITEMS.registerSimpleItem("luxury_ball_lid");

    public static final DeferredItem<Item> Master_Ball_Lid =
            ITEMS.registerSimpleItem("master_ball_lid");

    public static final DeferredItem<Item> Moon_Ball_Lid =
            ITEMS.registerSimpleItem("moon_ball_lid");

    public static final DeferredItem<Item> Nest_Ball_Lid =
            ITEMS.registerSimpleItem("nest_ball_lid");

    public static final DeferredItem<Item> Net_Ball_Lid =
            ITEMS.registerSimpleItem("net_ball_lid");

    public static final DeferredItem<Item> Park_Ball_Lid =
            ITEMS.registerSimpleItem("park_ball_lid");

    public static final DeferredItem<Item> Poke_Ball_Lid =
            ITEMS.registerSimpleItem("poke_ball_lid");

    public static final DeferredItem<Item> Premier_Ball_Lid =
            ITEMS.registerSimpleItem("premier_ball_lid");

    public static final DeferredItem<Item> Quick_Ball_Lid =
            ITEMS.registerSimpleItem("quick_ball_lid");

    public static final DeferredItem<Item> Repeat_Ball_Lid =
            ITEMS.registerSimpleItem("repeat_ball_lid");

    public static final DeferredItem<Item> Roseate_Ball_Lid =
            ITEMS.registerSimpleItem("roseate_ball_lid");

    public static final DeferredItem<Item> Safari_Ball_Lid =
            ITEMS.registerSimpleItem("safari_ball_lid");

    public static final DeferredItem<Item> Slate_Ball_Lid =
            ITEMS.registerSimpleItem("slate_ball_lid");

    public static final DeferredItem<Item> Sport_Ball_Lid =
            ITEMS.registerSimpleItem("sport_ball_lid");

    public static final DeferredItem<Item> Timer_Ball_Lid =
            ITEMS.registerSimpleItem("timer_ball_lid");

    public static final DeferredItem<Item> Ultra_Ball_Lid =
            ITEMS.registerSimpleItem("ultra_ball_lid");

    public static final DeferredItem<Item> Verdant_Ball_Lid =
            ITEMS.registerSimpleItem("verdant_ball_lid");


    // Sheets

    public static final DeferredItem<Item> Pokeball_Sheet =
            ITEMS.registerSimpleItem("poke_ball_sheet");

    public static final DeferredItem<Item> Ancient_Azure_Sheet =
            ITEMS.registerSimpleItem("ancient_azure_sheet");

    public static final DeferredItem<Item> Ancient_Citrine_Sheet =
            ITEMS.registerSimpleItem("ancient_citrine_sheet");

    public static final DeferredItem<Item> Ancient_Feather_Sheet =
            ITEMS.registerSimpleItem("ancient_feather_sheet");

    public static final DeferredItem<Item> Ancient_Gigaton_Sheet =
            ITEMS.registerSimpleItem("ancient_gigaton_sheet");

    public static final DeferredItem<Item> Ancient_Great_Sheet =
            ITEMS.registerSimpleItem("ancient_great_sheet");

    public static final DeferredItem<Item> Ancient_Heavy_Sheet =
            ITEMS.registerSimpleItem("ancient_heavy_sheet");

    public static final DeferredItem<Item> Ancient_Ivory_Sheet =
            ITEMS.registerSimpleItem("ancient_ivory_sheet");

    public static final DeferredItem<Item> Ancient_Jet_Sheet =
            ITEMS.registerSimpleItem("ancient_jet_sheet");

    public static final DeferredItem<Item> Ancient_Leaden_Sheet =
            ITEMS.registerSimpleItem("ancient_leaden_sheet");

    public static final DeferredItem<Item> Ancient_Origin_Sheet =
            ITEMS.registerSimpleItem("ancient_origin_sheet");

    public static final DeferredItem<Item> Ancient_Poke_Sheet =
            ITEMS.registerSimpleItem("ancient_poke_sheet");

    public static final DeferredItem<Item> Ancient_Roseate_Sheet =
            ITEMS.registerSimpleItem("ancient_roseate_sheet");

    public static final DeferredItem<Item> Ancient_Slate_Sheet =
            ITEMS.registerSimpleItem("ancient_slate_sheet");

    public static final DeferredItem<Item> Ancient_Ultra_Sheet =
            ITEMS.registerSimpleItem("ancient_ultra_sheet");

    public static final DeferredItem<Item> Ancient_Verdant_Sheet =
            ITEMS.registerSimpleItem("ancient_verdant_sheet");

    public static final DeferredItem<Item> Ancient_Wing_Sheet =
            ITEMS.registerSimpleItem("ancient_wing_sheet");

    public static final DeferredItem<Item> Azure_Sheet =
            ITEMS.registerSimpleItem("azure_sheet");

    public static final DeferredItem<Item> Beast_Sheet =
            ITEMS.registerSimpleItem("beast_sheet");

    public static final DeferredItem<Item> Cherish_Sheet =
            ITEMS.registerSimpleItem("cherish_sheet");

    public static final DeferredItem<Item> Citrine_Sheet =
            ITEMS.registerSimpleItem("citrine_sheet");

    public static final DeferredItem<Item> Dive_Sheet =
            ITEMS.registerSimpleItem("dive_sheet");

    public static final DeferredItem<Item> Dream_Sheet =
            ITEMS.registerSimpleItem("dream_sheet");

    public static final DeferredItem<Item> Dusk_Sheet =
            ITEMS.registerSimpleItem("dusk_sheet");

    public static final DeferredItem<Item> Fast_Sheet =
            ITEMS.registerSimpleItem("fast_sheet");

    public static final DeferredItem<Item> Friend_Sheet =
            ITEMS.registerSimpleItem("friend_sheet");

    public static final DeferredItem<Item> Great_Sheet =
            ITEMS.registerSimpleItem("great_sheet");

    public static final DeferredItem<Item> Heal_Sheet =
            ITEMS.registerSimpleItem("heal_sheet");

    public static final DeferredItem<Item> Heavy_Sheet =
            ITEMS.registerSimpleItem("heavy_sheet");

    public static final DeferredItem<Item> Level_Sheet =
            ITEMS.registerSimpleItem("level_sheet");

    public static final DeferredItem<Item> Love_Sheet =
            ITEMS.registerSimpleItem("love_sheet");

    public static final DeferredItem<Item> Lure_Sheet =
            ITEMS.registerSimpleItem("lure_sheet");

    public static final DeferredItem<Item> Luxury_Sheet =
            ITEMS.registerSimpleItem("luxury_sheet");

    public static final DeferredItem<Item> Master_Sheet =
            ITEMS.registerSimpleItem("master_sheet");

    public static final DeferredItem<Item> Moon_Sheet =
            ITEMS.registerSimpleItem("moon_sheet");

    public static final DeferredItem<Item> Nest_Sheet =
            ITEMS.registerSimpleItem("nest_sheet");

    public static final DeferredItem<Item> Net_Sheet =
            ITEMS.registerSimpleItem("net_sheet");

    public static final DeferredItem<Item> Park_Sheet =
            ITEMS.registerSimpleItem("park_sheet");

    public static final DeferredItem<Item> Premier_Sheet =
            ITEMS.registerSimpleItem("premier_sheet");

    public static final DeferredItem<Item> Quick_Sheet =
            ITEMS.registerSimpleItem("quick_sheet");

    public static final DeferredItem<Item> Repeat_Sheet =
            ITEMS.registerSimpleItem("repeat_sheet");

    public static final DeferredItem<Item> Roseate_Sheet =
            ITEMS.registerSimpleItem("roseate_sheet");

    public static final DeferredItem<Item> Safari_Sheet =
            ITEMS.registerSimpleItem("safari_sheet");

    public static final DeferredItem<Item> Slate_Sheet =
            ITEMS.registerSimpleItem("slate_sheet");

    public static final DeferredItem<Item> Sport_Sheet =
            ITEMS.registerSimpleItem("sport_sheet");

    public static final DeferredItem<Item> Timer_Sheet =
            ITEMS.registerSimpleItem("timer_sheet");

    public static final DeferredItem<Item> Ultra_Sheet =
            ITEMS.registerSimpleItem("ultra_sheet");

    public static final DeferredItem<Item> Verdant_Sheet =
            ITEMS.registerSimpleItem("verdant_sheet");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}