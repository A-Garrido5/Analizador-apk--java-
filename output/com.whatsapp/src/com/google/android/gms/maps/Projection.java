// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.zze;
import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.internal.IProjectionDelegate;

public final class Projection
{
    private final IProjectionDelegate zzaCi;
    
    Projection(final IProjectionDelegate zzaCi) {
        this.zzaCi = zzaCi;
    }
    
    public VisibleRegion getVisibleRegion() {
        try {
            return this.zzaCi.getVisibleRegion();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public Point toScreenLocation(final LatLng latLng) {
        try {
            return (Point)zze.zzn(this.zzaCi.toScreenLocation(latLng));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
