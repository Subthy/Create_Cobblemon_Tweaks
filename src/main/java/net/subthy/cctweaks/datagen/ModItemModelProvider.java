package net.subthy.cctweaks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.subthy.cctweaks.CCTWEAKS;
import net.subthy.cctweaks.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CCTWEAKS.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.Pokeball_base);
        simpleItem(ModItems.Ancient_Azure_Ball_Lid);
        simpleItem(ModItems.Ancient_Citrine_Ball_Lid);
        simpleItem(ModItems.Ancient_Feather_Ball_Lid);
        simpleItem(ModItems.Ancient_Gigaton_Ball_Lid);
        simpleItem(ModItems.Ancient_Great_Ball_Lid);
        simpleItem(ModItems.Ancient_Heavy_Ball_Lid);
        simpleItem(ModItems.Ancient_Ivory_Ball_Lid);
        simpleItem(ModItems.Ancient_Jet_Ball_Lid);
        simpleItem(ModItems.Ancient_Leaden_Ball_Lid);
        simpleItem(ModItems.Ancient_Origin_Ball_Lid);
        simpleItem(ModItems.Ancient_Poke_Ball_Lid);
        simpleItem(ModItems.Ancient_Roseate_Ball_Lid);
        simpleItem(ModItems.Ancient_Slate_Ball_Lid);
        simpleItem(ModItems.Ancient_Ultra_Ball_Lid);
        simpleItem(ModItems.Ancient_Verdant_Ball_Lid);
        simpleItem(ModItems.Ancient_Wing_Ball_Lid);
        simpleItem(ModItems.Azure_Ball_Lid);
        simpleItem(ModItems.Beast_Ball_Lid);
        simpleItem(ModItems.Citrine_Ball_Lid);
        simpleItem(ModItems.Dive_Ball_Lid);
        simpleItem(ModItems.Dream_Ball_Lid);
        simpleItem(ModItems.Dusk_Ball_Lid);
        simpleItem(ModItems.Fast_Ball_Lid);
        simpleItem(ModItems.Friend_Ball_Lid);
        simpleItem(ModItems.Great_Ball_Lid);
        simpleItem(ModItems.Heal_Ball_Lid);
        simpleItem(ModItems.Heavy_Ball_Lid);
        simpleItem(ModItems.Level_Ball_Lid);
        simpleItem(ModItems.Love_Ball_Lid);
        simpleItem(ModItems.Lure_Ball_Lid);
        simpleItem(ModItems.Luxury_Ball_Lid);
        simpleItem(ModItems.Master_Ball_Lid);
        simpleItem(ModItems.Moon_Ball_Lid);
        simpleItem(ModItems.Nest_Ball_Lid);
        simpleItem(ModItems.Net_Ball_Lid);
        simpleItem(ModItems.Park_Ball_Lid);
        simpleItem(ModItems.Poke_Ball_Lid);
        simpleItem(ModItems.Premier_Ball_Lid);
        simpleItem(ModItems.Quick_Ball_Lid);
        simpleItem(ModItems.Repeat_Ball_Lid);
        simpleItem(ModItems.Roseate_Ball_Lid);
        simpleItem(ModItems.Safari_Ball_Lid);
        simpleItem(ModItems.Slate_Ball_Lid);
        simpleItem(ModItems.Sport_Ball_Lid);
        simpleItem(ModItems.Timer_Ball_Lid);
        simpleItem(ModItems.Ultra_Ball_Lid);
        simpleItem(ModItems.Verdant_Ball_Lid);
        simpleItem(ModItems.Cherish_Ball_Lid);

        simpleItem(ModItems.Incomplete_Poke_Ball);
        // Sheets
        simpleItem(ModItems.Ancient_Azure_Sheet);
        simpleItem(ModItems.Ancient_Citrine_Sheet);
        simpleItem(ModItems.Ancient_Feather_Sheet);
        simpleItem(ModItems.Ancient_Gigaton_Sheet);
        simpleItem(ModItems.Ancient_Great_Sheet);
        simpleItem(ModItems.Ancient_Heavy_Sheet);
        simpleItem(ModItems.Ancient_Ivory_Sheet);
        simpleItem(ModItems.Ancient_Jet_Sheet);
        simpleItem(ModItems.Ancient_Leaden_Sheet);
        simpleItem(ModItems.Ancient_Origin_Sheet);
        simpleItem(ModItems.Ancient_Poke_Sheet);
        simpleItem(ModItems.Ancient_Roseate_Sheet);
        simpleItem(ModItems.Ancient_Slate_Sheet);
        simpleItem(ModItems.Ancient_Ultra_Sheet);
        simpleItem(ModItems.Ancient_Verdant_Sheet);
        simpleItem(ModItems.Ancient_Wing_Sheet);
        simpleItem(ModItems.Azure_Sheet);
        simpleItem(ModItems.Beast_Sheet);
        simpleItem(ModItems.Citrine_Sheet);
        simpleItem(ModItems.Dive_Sheet);
        simpleItem(ModItems.Dream_Sheet);
        simpleItem(ModItems.Dusk_Sheet);
        simpleItem(ModItems.Fast_Sheet);
        simpleItem(ModItems.Friend_Sheet);
        simpleItem(ModItems.Great_Sheet);
        simpleItem(ModItems.Heal_Sheet);
        simpleItem(ModItems.Heavy_Sheet);
        simpleItem(ModItems.Level_Sheet);
        simpleItem(ModItems.Love_Sheet);
        simpleItem(ModItems.Lure_Sheet);
        simpleItem(ModItems.Luxury_Sheet);
        simpleItem(ModItems.Master_Sheet);
        simpleItem(ModItems.Moon_Sheet);
        simpleItem(ModItems.Nest_Sheet);
        simpleItem(ModItems.Net_Sheet);
        simpleItem(ModItems.Park_Sheet);
        simpleItem(ModItems.Premier_Sheet);
        simpleItem(ModItems.Pokeball_Sheet);
        simpleItem(ModItems.Quick_Sheet);
        simpleItem(ModItems.Repeat_Sheet);
        simpleItem(ModItems.Roseate_Sheet);
        simpleItem(ModItems.Safari_Sheet);
        simpleItem(ModItems.Slate_Sheet);
        simpleItem(ModItems.Sport_Sheet);
        simpleItem(ModItems.Timer_Sheet);
        simpleItem(ModItems.Ultra_Sheet);
        simpleItem(ModItems.Verdant_Sheet);
        simpleItem(ModItems.Cherish_Sheet);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CCTWEAKS.MOD_ID,"item/" + item.getId().getPath()));
    }
}
