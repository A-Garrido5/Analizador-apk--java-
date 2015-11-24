// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.vp;

class m
{
    final i a;
    
    m(final i a) {
        this.a = a;
        de.greenrobot.event.m.b().d(this);
    }
    
    public void onEventBackgroundThread(final vp vp) {
        this.a.a.abort();
    }
}
