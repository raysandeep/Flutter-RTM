package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.agora.agorartm.AgoraRtmPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    AgoraRtmPlugin.registerWith(registry.registrarFor("io.agora.agorartm.AgoraRtmPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
