package org.ancientrpg;

import net.fabricmc.api.ModInitializer;

public class Ancientrpgui implements ModInitializer {

    public static final String MOD_ID = "ancientrpg";

    @Override
    public void onInitialize() {
        CustomBlocks.init();
    }
}
