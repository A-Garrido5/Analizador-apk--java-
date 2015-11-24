// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.IInterface;

public interface ICameraUpdateFactoryDelegate extends IInterface
{
    zzd newCameraPosition(final CameraPosition p0);
    
    zzd newLatLng(final LatLng p0);
    
    zzd newLatLngBounds(final LatLngBounds p0, final int p1);
    
    zzd zoomBy(final float p0);
    
    zzd zoomTo(final float p0);
}
