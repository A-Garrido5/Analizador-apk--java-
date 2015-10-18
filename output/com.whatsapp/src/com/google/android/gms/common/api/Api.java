// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;

public final class Api
{
    public static boolean a;
    private final String mName;
    private final Api$ClientKey zzVu;
    private final Api$zza zzWi;
    private final Api$zzc zzWj;
    private final Api$zzd zzWk;
    private final ArrayList zzWl;
    
    public Api(final String mName, final Api$zza zzWi, final Api$ClientKey zzVu, final Scope[] array) {
        zzu.zzb(zzWi, "Cannot construct an Api with a null ClientBuilder");
        zzu.zzb(zzVu, "Cannot construct an Api with a null ClientKey");
        this.mName = mName;
        this.zzWi = zzWi;
        this.zzWj = null;
        this.zzVu = zzVu;
        this.zzWk = null;
        this.zzWl = new ArrayList((Collection<? extends E>)Arrays.asList(array));
    }
    
    public String getName() {
        return this.mName;
    }
    
    public Api$zza zzmp() {
        zzu.zza(this.zzWi != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.zzWi;
    }
    
    public Api$zzc zzmq() {
        zzu.zza(this.zzWj != null, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return this.zzWj;
    }
    
    public List zzmr() {
        return this.zzWl;
    }
    
    public Api$ClientKey zzms() {
        zzu.zza(this.zzVu != null, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.zzVu;
    }
    
    public boolean zzmt() {
        return this.zzWk != null;
    }
}
