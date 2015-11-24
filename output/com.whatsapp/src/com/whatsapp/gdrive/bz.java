// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.App;
import com.whatsapp.vp;
import de.greenrobot.event.m;

class bz
{
    final ae a;
    
    bz(final ae a) {
        this.a = a;
        m.b().d(this);
    }
    
    public void onEventBackgroundThread(final vp vp) {
        if (ae.c(this.a).get() == 26 && (App.j() == 2 || App.j() == 0)) {
            ae.c(this.a).set(10);
            this.a.e(ae.a(this.a), 100L);
        }
        if (ae.c(this.a).get() == 16 && (App.j() == 2 || App.j() == 0)) {
            ae.c(this.a).set(10);
            this.a.g(ae.a(this.a), 100L);
        }
    }
}
