// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzv$zza;

class StreetViewPanoramaView$zza$1 extends zzv$zza
{
    final StreetViewPanoramaView$zza zzaCF;
    final OnStreetViewPanoramaReadyCallback zzaCs;
    
    StreetViewPanoramaView$zza$1(final StreetViewPanoramaView$zza zzaCF, final OnStreetViewPanoramaReadyCallback zzaCs) {
        this.zzaCF = zzaCF;
        this.zzaCs = zzaCs;
    }
    
    public void zza(final IStreetViewPanoramaDelegate streetViewPanoramaDelegate) {
        this.zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(streetViewPanoramaDelegate));
    }
}
