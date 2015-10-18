// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

public final class g
{
    public float a;
    public float b;
    
    public StreetViewPanoramaOrientation a() {
        return new StreetViewPanoramaOrientation(this.b, this.a);
    }
    
    public g a(final float b) {
        this.b = b;
        return this;
    }
    
    public g b(final float a) {
        this.a = a;
        return this;
    }
}
