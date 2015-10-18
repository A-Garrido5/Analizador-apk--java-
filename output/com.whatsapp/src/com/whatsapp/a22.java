// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class a22 implements Runnable
{
    @Override
    public void run() {
        if (!SettingsPrivacy.e().isEmpty()) {
            SettingsPrivacy.e().clear();
            App.a(App.aq.getApplicationContext(), 2131231119, 1);
            if (SettingsPrivacy.c() != null) {
                SettingsPrivacy.a(SettingsPrivacy.c());
            }
        }
    }
}
