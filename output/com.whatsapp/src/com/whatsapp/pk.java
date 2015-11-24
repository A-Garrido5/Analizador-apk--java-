// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Binder;

public class pk extends Binder
{
    final VoiceService a;
    
    public pk(final VoiceService a) {
        this.a = a;
    }
    
    public VoiceService a() {
        return this.a;
    }
}
