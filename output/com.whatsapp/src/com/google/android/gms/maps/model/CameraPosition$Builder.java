// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

public final class CameraPosition$Builder
{
    private LatLng zzaCQ;
    private float zzaCR;
    private float zzaCS;
    private float zzaCT;
    
    public CameraPosition$Builder bearing(final float zzaCT) {
        this.zzaCT = zzaCT;
        return this;
    }
    
    public CameraPosition build() {
        return new CameraPosition(this.zzaCQ, this.zzaCR, this.zzaCS, this.zzaCT);
    }
    
    public CameraPosition$Builder target(final LatLng zzaCQ) {
        this.zzaCQ = zzaCQ;
        return this;
    }
    
    public CameraPosition$Builder tilt(final float zzaCS) {
        this.zzaCS = zzaCS;
        return this;
    }
    
    public CameraPosition$Builder zoom(final float zzaCR) {
        this.zzaCR = zzaCR;
        return this;
    }
}
