// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import android.util.Base64;
import android.util.Log;
import android.content.pm.PackageInfo;

public class zzd
{
    private static final zzd zzVY;
    
    static {
        zzVY = new zzd();
    }
    
    public static zzd zzmn() {
        return zzd.zzVY;
    }
    
    zzc$zza zza(final PackageInfo packageInfo, final zzc$zza[] array) {
        final boolean a = GooglePlayServicesUtil.a;
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        final zzc$zzb zzc$zzb = new zzc$zzb(packageInfo.signatures[0].toByteArray());
        int i = 0;
        while (i < array.length) {
            if (array[i].equals(zzc$zzb)) {
                return array[i];
            }
            ++i;
            if (a) {
                break;
            }
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(zzc$zzb.getBytes(), 0));
        }
        return null;
    }
}
