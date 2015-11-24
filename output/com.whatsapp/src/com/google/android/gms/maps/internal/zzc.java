// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.dynamic.zzd;
import android.os.IInterface;

public interface zzc extends IInterface
{
    IMapViewDelegate zza(final zzd p0, final GoogleMapOptions p1);
    
    IStreetViewPanoramaViewDelegate zza(final zzd p0, final StreetViewPanoramaOptions p1);
    
    void zzd(final zzd p0, final int p1);
    
    IMapFragmentDelegate zzr(final zzd p0);
    
    IStreetViewPanoramaFragmentDelegate zzs(final zzd p0);
    
    ICameraUpdateFactoryDelegate zzvC();
    
    com.google.android.gms.maps.model.internal.zzd zzvD();
}
