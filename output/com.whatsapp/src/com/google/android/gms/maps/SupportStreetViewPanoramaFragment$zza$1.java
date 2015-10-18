// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzv$zza;

class SupportStreetViewPanoramaFragment$zza$1 extends zzv$zza
{
    final SupportStreetViewPanoramaFragment$zza zzaCK;
    final OnStreetViewPanoramaReadyCallback zzaCs;
    
    SupportStreetViewPanoramaFragment$zza$1(final SupportStreetViewPanoramaFragment$zza zzaCK, final OnStreetViewPanoramaReadyCallback zzaCs) {
        this.zzaCK = zzaCK;
        this.zzaCs = zzaCs;
    }
    
    public void zza(final IStreetViewPanoramaDelegate streetViewPanoramaDelegate) {
        this.zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(streetViewPanoramaDelegate));
    }
}
