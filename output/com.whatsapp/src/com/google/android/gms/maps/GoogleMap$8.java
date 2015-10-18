// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.internal.zzj$zza;

class GoogleMap$8 extends zzj$zza
{
    final GoogleMap$OnMapClickListener zzaBB;
    final GoogleMap zzaBs;
    
    GoogleMap$8(final GoogleMap zzaBs, final GoogleMap$OnMapClickListener zzaBB) {
        this.zzaBs = zzaBs;
        this.zzaBB = zzaBB;
    }
    
    public void onMapClick(final LatLng latLng) {
        this.zzaBB.onMapClick(latLng);
    }
}
