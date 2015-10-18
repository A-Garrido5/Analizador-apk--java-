// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import de.greenrobot.event.m;
import android.os.Message;
import android.os.Handler$Callback;

final class hv implements Handler$Callback
{
    public boolean handleMessage(final Message message) {
        final a8p a8p = (a8p)m.b().a(a8p.class);
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                if (!a8p.a()) {
                    App.av();
                }
                return true;
            }
            case 1: {
                if (!a8p.a()) {
                    App.S();
                }
                return true;
            }
        }
    }
}
