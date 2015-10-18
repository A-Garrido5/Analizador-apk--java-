// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzu;
import android.os.RemoteException;
import android.graphics.Bitmap;
import com.google.android.gms.maps.model.internal.zzd;

public final class BitmapDescriptorFactory
{
    private static zzd zzaCP;
    
    public static BitmapDescriptor fromBitmap(final Bitmap bitmap) {
        try {
            return new BitmapDescriptor(zzvH().zzb(bitmap));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static BitmapDescriptor fromResource(final int n) {
        try {
            return new BitmapDescriptor(zzvH().zzhD(n));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public static void zza(final zzd zzd) {
        try {
            if (BitmapDescriptorFactory.zzaCP != null) {
                return;
            }
        }
        catch (RuntimeRemoteException ex) {
            throw ex;
        }
        BitmapDescriptorFactory.zzaCP = (zzd)zzu.zzu(zzd);
    }
    
    private static zzd zzvH() {
        return (zzd)zzu.zzb(BitmapDescriptorFactory.zzaCP, "IBitmapDescriptorFactory is not initialized");
    }
}
