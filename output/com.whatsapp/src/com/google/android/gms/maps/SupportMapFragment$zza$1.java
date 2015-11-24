// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzm$zza;

class SupportMapFragment$zza$1 extends zzm$zza
{
    final OnMapReadyCallback zzaBX;
    final SupportMapFragment$zza zzaCI;
    
    SupportMapFragment$zza$1(final SupportMapFragment$zza zzaCI, final OnMapReadyCallback zzaBX) {
        this.zzaCI = zzaCI;
        this.zzaBX = zzaBX;
    }
    
    public void zza(final IGoogleMapDelegate googleMapDelegate) {
        this.zzaBX.onMapReady(new GoogleMap(googleMapDelegate));
    }
}
