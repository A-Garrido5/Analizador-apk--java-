// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.internal.ap;
import com.google.android.gms.maps.model.LatLngBounds;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.internal.a;

public final class b
{
    private static a a;
    
    public static com.google.android.gms.maps.a a(final LatLng latLng, final float n) {
        try {
            return new com.google.android.gms.maps.a(a().a(latLng, n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static com.google.android.gms.maps.a a(final LatLngBounds latLngBounds, final int n) {
        try {
            return new com.google.android.gms.maps.a(a().a(latLngBounds, n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static com.google.android.gms.maps.a a(final LatLngBounds latLngBounds, final int n, final int n2, final int n3) {
        try {
            return new com.google.android.gms.maps.a(a().a(latLngBounds, n, n2, n3));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    private static a a() {
        return (a)ap.a(b.a, "CameraUpdateFactory is not initialized");
    }
    
    public static void a(final a a) {
        b.a = (a)ap.a(a);
    }
}
