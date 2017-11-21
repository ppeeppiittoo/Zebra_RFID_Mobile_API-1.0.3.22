package com.zebra.rfidreader.demo.settings;

import com.zebra.rfidreader.demo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.(Added by Pragnesh)
 */
public class SettingsContent {
    /**
     * An array of sample (Settings) items.
     */
    public static List<SettingItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (Settings) items, by ID.
     */
    public static Map<String, SettingItem> ITEM_MAP = new HashMap<>();

    static {
        // Add items.
        addItem(new SettingItem("1", "Lista de lectores"/*,"Available Readers"*/, R.drawable.title_rdl));
        addItem(new SettingItem("2", "Aplicacion"/*,"Settings"*/, R.drawable.title_sett));
        addItem(new SettingItem("3", "Antena",/*"Set Antenna parameters",*/R.drawable.title_antn));
        addItem(new SettingItem("4", "Control de singulación",/*"Set target & action",*/R.drawable.title_singl));
        addItem(new SettingItem("5", "Iniciar\\Detener Triggers",/*"Region and channels",*/R.drawable.title_strstp));
        addItem(new SettingItem("6", "Informe De Etiqueta",/*"Triggers settings",*/R.drawable.title_tags));
        addItem(new SettingItem("7", "Regulador",/*"Host and sled volumes",*/R.drawable.title_reg));
        addItem(new SettingItem("8", "Bateria",/*"Configurations",*/R.drawable.title_batt));
        addItem(new SettingItem("9", "Administración De Poder",/*"Version information",*/R.drawable.title_dpo_disabled));
        addItem(new SettingItem("10", "Localizador",/*"Status",*/R.drawable.title_beep));
        addItem(new SettingItem("11", "Guardar Configuracion",/*"Tag Settings",*/R.drawable.title_save));
        //addItem(new SettingItem("11", "Inventory Settings",/*"Tag Settings",*/R.drawable.title_sett));
    }

    private static void addItem(SettingItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A Settings item representing a piece of content.
     */
    public static class SettingItem {
        public String id;
        public String content;
        //public String subcontent;
        public int icon;

        public SettingItem(String id, String content/*,String subcontent*/, int icon_id) {
            this.id = id;
            this.content = content;
            //this.subcontent = subcontent;
            this.icon = icon_id;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
