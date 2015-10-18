// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

public final class CameraUpdateFactory
{
    private static ICameraUpdateFactoryDelegate zzaBo;
    
    public static CameraUpdate newCameraPosition(final CameraPosition cameraPosition) {
        try {
            return new CameraUpdate(zzvh().newCameraPosition(cameraPosition));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static CameraUpdate newLatLng(final LatLng latLng) {
        try {
            return new CameraUpdate(zzvh().newLatLng(latLng));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static CameraUpdate newLatLngBounds(final LatLngBounds latLngBounds, final int n) {
        try {
            return new CameraUpdate(zzvh().newLatLngBounds(latLngBounds, n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static CameraUpdate zoomBy(final float n) {
        try {
            return new CameraUpdate(zzvh().zoomBy(n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static CameraUpdate zoomTo(final float n) {
        try {
            return new CameraUpdate(zzvh().zoomTo(n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static void zza(final ICameraUpdateFactoryDelegate cameraUpdateFactoryDelegate) {
        CameraUpdateFactory.zzaBo = (ICameraUpdateFactoryDelegate)zzu.zzu(cameraUpdateFactoryDelegate);
    }
    
    private static ICameraUpdateFactoryDelegate zzvh() {
        return (ICameraUpdateFactoryDelegate)zzu.zzb(CameraUpdateFactory.zzaBo, "CameraUpdateFactory is not initialized");
    }
}
