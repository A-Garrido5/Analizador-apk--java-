// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.vp;
import de.greenrobot.event.m;

class b
{
    final c0 a;
    
    b(final c0 a) {
        this.a = a;
        m.b().d(this);
    }
    
    public void onEventBackgroundThread(final vp vp) {
        this.a.a.abort();
    }
}
