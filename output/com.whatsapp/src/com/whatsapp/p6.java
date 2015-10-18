// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;

class p6 implements Runnable
{
    final aw6 a;
    final Location b;
    final boolean c;
    
    p6(final aw6 a, final boolean c, final Location b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (LocationPicker.a(this.a.h) == null || this.c) {
            LocationPicker.g(this.a.h).a(LocationPicker.n(this.a.h).getMyLocation());
            LocationPicker.a(this.a.h, this.b, Math.max((int)this.b.getAccuracy(), 100), null, true);
        }
    }
}
