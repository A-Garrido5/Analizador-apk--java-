// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzv$zza;

class StreetViewPanoramaFragment$zza$1 extends zzv$zza
{
    final OnStreetViewPanoramaReadyCallback zzaCs;
    final StreetViewPanoramaFragment$zza zzaCt;
    
    StreetViewPanoramaFragment$zza$1(final StreetViewPanoramaFragment$zza zzaCt, final OnStreetViewPanoramaReadyCallback zzaCs) {
        this.zzaCt = zzaCt;
        this.zzaCs = zzaCs;
    }
    
    public void zza(final IStreetViewPanoramaDelegate streetViewPanoramaDelegate) {
        this.zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(streetViewPanoramaDelegate));
    }
}
