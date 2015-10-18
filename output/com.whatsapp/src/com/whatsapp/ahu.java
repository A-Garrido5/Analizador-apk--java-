// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.LocationListener;

final class ahu implements Runnable
{
    final ho a;
    final LocationListener b;
    
    ahu(final ho a, final LocationListener b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.a(this.b);
    }
}
