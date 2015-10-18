// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.common.internal.zzu;
import android.content.Context;

public final class MapsInitializer
{
    public static int initialize(final Context context) {
        zzu.zzu(context);
        try {
            zza(zzy.zzay(context));
            return 0;
        }
        catch (GooglePlayServicesNotAvailableException ex) {
            return ex.errorCode;
        }
    }
    
    public static void zza(final zzc zzc) {
        try {
            CameraUpdateFactory.zza(zzc.zzvC());
            BitmapDescriptorFactory.zza(zzc.zzvD());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
