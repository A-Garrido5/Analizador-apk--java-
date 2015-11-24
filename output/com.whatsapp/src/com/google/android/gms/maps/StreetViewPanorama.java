// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

public class StreetViewPanorama
{
    private final IStreetViewPanoramaDelegate zzaCj;
    
    protected StreetViewPanorama(final IStreetViewPanoramaDelegate streetViewPanoramaDelegate) {
        this.zzaCj = (IStreetViewPanoramaDelegate)zzu.zzu(streetViewPanoramaDelegate);
    }
}
