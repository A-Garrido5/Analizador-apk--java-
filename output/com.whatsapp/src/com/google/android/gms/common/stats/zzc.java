// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkf;

public final class zzc
{
    public static zzkf zzacr;
    public static zzkf zzacs;
    
    static {
        zzc.zzacr = zzkf.zzg("gms:common:stats:debug", false);
        zzc.zzacs = zzkf.zza("gms:common:stats:max_num_of_events", Integer.valueOf(100));
    }
}
