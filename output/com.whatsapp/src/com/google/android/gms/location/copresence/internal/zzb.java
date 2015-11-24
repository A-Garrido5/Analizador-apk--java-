// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.copresence.internal;

import com.google.android.gms.location.internal.zzn;
import android.content.Context;

public class zzb
{
    private final Context mContext;
    private final String zzOe;
    private final String zzOx;
    private final zzn zzayq;
    private final CopresenceApiOptions zzayr;
    private zzc zzays;
    
    private zzb(final Context mContext, final String zzOx, final String zzOe, final zzn zzayq, final CopresenceApiOptions zzayr) {
        this.mContext = mContext;
        this.zzOx = zzOx;
        this.zzayq = zzayq;
        this.zzays = null;
        this.zzOe = zzOe;
        this.zzayr = zzayr;
    }
    
    public static zzb zza(final Context context, final String s, final String s2, final zzn zzn, final CopresenceApiOptions copresenceApiOptions) {
        return new zzb(context, s, s2, zzn, copresenceApiOptions);
    }
}
