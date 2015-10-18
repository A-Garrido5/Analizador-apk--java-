// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import android.os.IInterface;

public interface IProjectionDelegate extends IInterface
{
    VisibleRegion getVisibleRegion();
    
    zzd toScreenLocation(final LatLng p0);
}
