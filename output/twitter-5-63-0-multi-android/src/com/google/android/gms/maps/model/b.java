// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.ap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.j;

public final class b
{
    private static j a;
    
    public static a a(final float n) {
        try {
            return new a(a().a(n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static a a(final int n) {
        try {
            return new a(a().a(n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    private static j a() {
        return (j)ap.a(b.a, "IBitmapDescriptorFactory is not initialized");
    }
    
    public static void a(final j j) {
        if (b.a != null) {
            return;
        }
        b.a = (j)ap.a(j);
    }
}
