package com.silencecrew;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SilenceCrewPluginTest
{
    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(SilenceCrewPlugin.class);
        RuneLite.main(args);
    }
}
