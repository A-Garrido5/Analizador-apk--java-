// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.internal.zzh$zza;

class GoogleMap$12 extends zzh$zza
{
    final GoogleMap$OnInfoWindowClickListener zzaBF;
    final GoogleMap zzaBs;
    
    GoogleMap$12(final GoogleMap zzaBs, final GoogleMap$OnInfoWindowClickListener zzaBF) {
        this.zzaBs = zzaBs;
        this.zzaBF = zzaBF;
    }
    
    public void zze(final zzi zzi) {
        this.zzaBF.onInfoWindowClick(new Marker(zzi));
    }
}
