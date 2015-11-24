// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

class aq8 implements LocationListener
{
    private float a;
    private android.location.LocationListener b;
    private boolean c;
    private long d;
    
    public aq8(final long d, final float a, final boolean c, final android.location.LocationListener b) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    static float a(final aq8 aq8) {
        return aq8.a;
    }
    
    static long b(final aq8 aq8) {
        return aq8.d;
    }
    
    static boolean c(final aq8 aq8) {
        return aq8.c;
    }
    
    @Override
    public void onLocationChanged(final Location location) {
        this.b.onLocationChanged(location);
    }
}
