// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkf;

public final class zzc$zza
{
    public static zzkf zzact;
    public static zzkf zzacu;
    public static zzkf zzacv;
    public static zzkf zzacw;
    public static zzkf zzacx;
    public static zzkf zzacy;
    
    static {
        zzc$zza.zzact = zzkf.zza("gms:common:stats:connections:level", Integer.valueOf(zzd.zzacz));
        zzc$zza.zzacu = zzkf.zzs("gms:common:stats:connections:ignored_calling_processes", "");
        zzc$zza.zzacv = zzkf.zzs("gms:common:stats:connections:ignored_calling_services", "");
        zzc$zza.zzacw = zzkf.zzs("gms:common:stats:connections:ignored_target_processes", "");
        zzc$zza.zzacx = zzkf.zzs("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
        zzc$zza.zzacy = zzkf.zza("gms:common:stats:connections:time_out_duration", Long.valueOf(600000L));
    }
}
