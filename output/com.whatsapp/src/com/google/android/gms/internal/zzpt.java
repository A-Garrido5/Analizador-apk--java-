// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient$ServerAuthCodeCallbacks;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;

public final class zzpt implements Api$ApiOptions$Optional
{
    public static final zzpt zzaJQ;
    private final boolean zzaJR;
    private final boolean zzaJS;
    private final String zzaJT;
    private final GoogleApiClient$ServerAuthCodeCallbacks zzaJU;
    
    static {
        zzaJQ = new zzpt$zza().zzyc();
    }
    
    private zzpt(final boolean zzaJR, final boolean zzaJS, final String zzaJT, final GoogleApiClient$ServerAuthCodeCallbacks zzaJU) {
        this.zzaJR = zzaJR;
        this.zzaJS = zzaJS;
        this.zzaJT = zzaJT;
        this.zzaJU = zzaJU;
    }
    
    zzpt(final boolean b, final boolean b2, final String s, final GoogleApiClient$ServerAuthCodeCallbacks googleApiClient$ServerAuthCodeCallbacks, final zzpt$1 zzpt$1) {
        this(b, b2, s, googleApiClient$ServerAuthCodeCallbacks);
    }
    
    public boolean zzxZ() {
        return this.zzaJR;
    }
    
    public String zzxt() {
        return this.zzaJT;
    }
    
    public boolean zzya() {
        return this.zzaJS;
    }
    
    public GoogleApiClient$ServerAuthCodeCallbacks zzyb() {
        return this.zzaJU;
    }
}
