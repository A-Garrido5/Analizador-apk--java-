// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

public final class c
{
    private LatLng a;
    private float b;
    private float c;
    private float d;
    
    public CameraPosition a() {
        return new CameraPosition(this.a, this.b, this.c, this.d);
    }
    
    public c a(final float b) {
        this.b = b;
        return this;
    }
    
    public c a(final LatLng a) {
        this.a = a;
        return this;
    }
    
    public c b(final float c) {
        this.c = c;
        return this;
    }
    
    public c c(final float d) {
        this.d = d;
        return this;
    }
}
