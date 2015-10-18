// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzm$zza;

class MapFragment$zza$1 extends zzm$zza
{
    final OnMapReadyCallback zzaBX;
    final MapFragment$zza zzaBY;
    
    MapFragment$zza$1(final MapFragment$zza zzaBY, final OnMapReadyCallback zzaBX) {
        this.zzaBY = zzaBY;
        this.zzaBX = zzaBX;
    }
    
    public void zza(final IGoogleMapDelegate googleMapDelegate) {
        this.zzaBX.onMapReady(new GoogleMap(googleMapDelegate));
    }
}
