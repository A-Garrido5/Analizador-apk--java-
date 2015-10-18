// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.dynamic.k;
import android.os.IInterface;

public interface a extends IInterface
{
    k a();
    
    k a(final float p0);
    
    k a(final float p0, final float p1);
    
    k a(final float p0, final int p1, final int p2);
    
    k a(final CameraPosition p0);
    
    k a(final LatLng p0);
    
    k a(final LatLng p0, final float p1);
    
    k a(final LatLngBounds p0, final int p1);
    
    k a(final LatLngBounds p0, final int p1, final int p2, final int p3);
    
    k b();
    
    k b(final float p0);
}
