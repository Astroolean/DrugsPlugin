package main.java.me.theminddroid.drugs.hooks;

import me.theminddroid.drugs.listeners.NarcanListener;
import me.theminddroid.drugs.listeners.PsychoactiveDrugListener;
import me.theminddroid.drugs.models.Drug;
import me.theminddroid.drugs.models.Recipes;
import org.jetbrains.annotations.Nullable;

public class ItemsAdderHook implements Hook<Void>{
    private final boolean isHooked;
    ItemsAdderHook(){
        isHooked = hook();
        if (isHooked) {
            DrugsPlugin.get().getPluginManager().registerEvents(new ItemsAdderLoadDataListener(), DrugsPlugin.get());
        }
    }

    private boolean hook(){
        return VersionUtils.isLoaded("ItemsAdder");
    }

    @Override
    public boolean isOn() {
        return isHooked;
    }

    @Override
    public @Nullable Void getApi() {
        return null;
    }
}