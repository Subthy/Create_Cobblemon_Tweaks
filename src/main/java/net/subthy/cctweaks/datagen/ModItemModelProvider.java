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
        simpleItem(ModItems.Pokeball_Sheet);

        simpleItem(ModItems.Incomplete_Poke_Ball);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CCTWEAKS.MOD_ID,"item/" + item.getId().getPath()));
    }
}
