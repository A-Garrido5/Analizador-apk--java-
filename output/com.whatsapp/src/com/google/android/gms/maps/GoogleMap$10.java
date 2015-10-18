// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.internal.zzn$zza;

class GoogleMap$10 extends zzn$zza
{
    final GoogleMap$OnMarkerClickListener zzaBD;
    final GoogleMap zzaBs;
    
    GoogleMap$10(final GoogleMap zzaBs, final GoogleMap$OnMarkerClickListener zzaBD) {
        this.zzaBs = zzaBs;
        this.zzaBD = zzaBD;
    }
    
    public boolean zza(final zzi zzi) {
        return this.zzaBD.onMarkerClick(new Marker(zzi));
    }
}
