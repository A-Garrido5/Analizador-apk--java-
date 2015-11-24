// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.h;
import android.content.Context;
import com.whatsapp.contact.f;
import android.os.Message;
import android.os.Handler$Callback;

final class d1 implements Handler$Callback
{
    public boolean handleMessage(final Message message) {
        f.a((Context)App.aq);
        App.b(h.BACKGROUND_FULL);
        return true;
    }
}
