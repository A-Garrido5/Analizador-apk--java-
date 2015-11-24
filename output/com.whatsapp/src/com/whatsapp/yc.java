// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;

final class yc extends TriggerEventListener
{
    public void onTrigger(final TriggerEvent triggerEvent) {
        if (l7.E()) {
            l7.c();
            if (!App.I) {
                return;
            }
        }
        l7.a(false);
    }
}
