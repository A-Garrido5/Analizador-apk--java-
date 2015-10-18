// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzm$zza;

class MapView$zza$1 extends zzm$zza
{
    final OnMapReadyCallback zzaBX;
    final MapView$zza zzaCf;
    
    MapView$zza$1(final MapView$zza zzaCf, final OnMapReadyCallback zzaBX) {
        this.zzaCf = zzaCf;
        this.zzaBX = zzaBX;
    }
    
    public void zza(final IGoogleMapDelegate googleMapDelegate) {
        this.zzaBX.onMapReady(new GoogleMap(googleMapDelegate));
    }
}
