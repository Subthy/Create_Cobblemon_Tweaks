package net.subthy.cctweaks.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.cctweaks.CCTWEAKS;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CCTWEAKS.MOD_ID);

    public static final RegistryObject<CreativeModeTab> POKEBALL_PART_TAB = CREATIVE_MODE_TABS.register("creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Poke_Ball_Lid.get()))
                    .title(Component.translatable("creativetab.pokeball_tab"))
                    .displayItems((displayParameters, output) -> {
                        // Lids
                        output.accept(ModItems.Pokeball_base.get());
                        output.accept(ModItems.Ancient_Azure_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Citrine_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Feather_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Gigaton_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Great_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Heavy_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Ivory_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Jet_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Leaden_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Origin_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Poke_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Roseate_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Slate_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Ultra_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Verdant_Ball_Lid.get());
                        output.accept(ModItems.Ancient_Wing_Ball_Lid.get());
                        output.accept(ModItems.Azure_Ball_Lid.get());
                        output.accept(ModItems.Beast_Ball_Lid.get());
                        output.accept(ModItems.Citrine_Ball_Lid.get());
                        output.accept(ModItems.Cherish_Ball_Lid.get());
                        output.accept(ModItems.Dive_Ball_Lid.get());
                        output.accept(ModItems.Dream_Ball_Lid.get());
                        output.accept(ModItems.Dusk_Ball_Lid.get());
                        output.accept(ModItems.Fast_Ball_Lid.get());
                        output.accept(ModItems.Friend_Ball_Lid.get());
                        output.accept(ModItems.Great_Ball_Lid.get());
                        output.accept(ModItems.Heal_Ball_Lid.get());
                        output.accept(ModItems.Heavy_Ball_Lid.get());
                        output.accept(ModItems.Level_Ball_Lid.get());
                        output.accept(ModItems.Love_Ball_Lid.get());
                        output.accept(ModItems.Lure_Ball_Lid.get());
                        output.accept(ModItems.Luxury_Ball_Lid.get());
                        output.accept(ModItems.Master_Ball_Lid.get());
                        output.accept(ModItems.Moon_Ball_Lid.get());
                        output.accept(ModItems.Nest_Ball_Lid.get());
                        output.accept(ModItems.Net_Ball_Lid.get());
                        output.accept(ModItems.Park_Ball_Lid.get());
                        output.accept(ModItems.Poke_Ball_Lid.get());
                        output.accept(ModItems.Premier_Ball_Lid.get());
                        output.accept(ModItems.Quick_Ball_Lid.get());
                        output.accept(ModItems.Repeat_Ball_Lid.get());
                        output.accept(ModItems.Roseate_Ball_Lid.get());
                        output.accept(ModItems.Safari_Ball_Lid.get());
                        output.accept(ModItems.Slate_Ball_Lid.get());
                        output.accept(ModItems.Sport_Ball_Lid.get());
                        output.accept(ModItems.Timer_Ball_Lid.get());
                        output.accept(ModItems.Ultra_Ball_Lid.get());
                        output.accept(ModItems.Verdant_Ball_Lid.get());
                        // Random
                        output.accept(ModItems.Incomplete_Poke_Ball.get());
                        // Sheets
                        output.accept(ModItems.Ancient_Azure_Sheet.get());
                        output.accept(ModItems.Ancient_Citrine_Sheet.get());
                        output.accept(ModItems.Ancient_Feather_Sheet.get());
                        output.accept(ModItems.Ancient_Gigaton_Sheet.get());
                        output.accept(ModItems.Ancient_Great_Sheet.get());
                        output.accept(ModItems.Ancient_Heavy_Sheet.get());
                        output.accept(ModItems.Ancient_Ivory_Sheet.get());
                        output.accept(ModItems.Ancient_Jet_Sheet.get());
                        output.accept(ModItems.Ancient_Leaden_Sheet.get());
                        output.accept(ModItems.Ancient_Origin_Sheet.get());
                        output.accept(ModItems.Ancient_Poke_Sheet.get());
                        output.accept(ModItems.Ancient_Roseate_Sheet.get());
                        output.accept(ModItems.Ancient_Slate_Sheet.get());
                        output.accept(ModItems.Ancient_Ultra_Sheet.get());
                        output.accept(ModItems.Ancient_Verdant_Sheet.get());
                        output.accept(ModItems.Ancient_Wing_Sheet.get());
                        output.accept(ModItems.Azure_Sheet.get());
                        output.accept(ModItems.Beast_Sheet.get());
                        output.accept(ModItems.Citrine_Sheet.get());
                        output.accept(ModItems.Cherish_Sheet.get());
                        output.accept(ModItems.Dive_Sheet.get());
                        output.accept(ModItems.Dream_Sheet.get());
                        output.accept(ModItems.Dusk_Sheet.get());
                        output.accept(ModItems.Fast_Sheet.get());
                        output.accept(ModItems.Friend_Sheet.get());
                        output.accept(ModItems.Great_Sheet.get());
                        output.accept(ModItems.Heal_Sheet.get());
                        output.accept(ModItems.Heavy_Sheet.get());
                        output.accept(ModItems.Level_Sheet.get());
                        output.accept(ModItems.Love_Sheet.get());
                        output.accept(ModItems.Lure_Sheet.get());
                        output.accept(ModItems.Luxury_Sheet.get());
                        output.accept(ModItems.Master_Sheet.get());
                        output.accept(ModItems.Moon_Sheet.get());
                        output.accept(ModItems.Nest_Sheet.get());
                        output.accept(ModItems.Net_Sheet.get());
                        output.accept(ModItems.Park_Sheet.get());
                        output.accept(ModItems.Pokeball_Sheet.get());
                        output.accept(ModItems.Premier_Sheet.get());
                        output.accept(ModItems.Quick_Sheet.get());
                        output.accept(ModItems.Repeat_Sheet.get());
                        output.accept(ModItems.Roseate_Sheet.get());
                        output.accept(ModItems.Safari_Sheet.get());
                        output.accept(ModItems.Slate_Sheet.get());
                        output.accept(ModItems.Sport_Sheet.get());
                        output.accept(ModItems.Timer_Sheet.get());
                        output.accept(ModItems.Ultra_Sheet.get());
                        output.accept(ModItems.Verdant_Sheet.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
