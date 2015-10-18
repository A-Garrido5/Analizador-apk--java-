// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.signin.internal.zzg;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Api$zza;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;

public final class zzpq
{
    public static final Api API;
    public static final Api$ClientKey zzNX;
    public static final Api$zza zzNY;
    static final Api$zza zzaJO;
    public static final zzpr zzaJP;
    public static final Api zzada;
    public static final Api$ClientKey zzajz;
    
    static {
        zzNX = new Api$ClientKey();
        zzajz = new Api$ClientKey();
        zzNY = new zzpq$1();
        zzaJO = new zzpq$2();
        API = new Api("SignIn.API", zzpq.zzNY, zzpq.zzNX, new Scope[0]);
        zzada = new Api("SignIn.INTERNAL_API", zzpq.zzaJO, zzpq.zzajz, new Scope[0]);
        zzaJP = new zzg();
    }
}
