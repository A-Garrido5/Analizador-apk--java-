// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zze;
import java.util.Collection;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzpq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import android.view.View;
import android.os.Looper;
import com.google.android.gms.internal.zzpt$zza;
import java.util.Set;
import android.support.v4.app.FragmentActivity;
import android.accounts.Account;
import android.content.Context;

public final class GoogleApiClient$Builder
{
    private final Context mContext;
    private Account zzMY;
    private String zzOd;
    private String zzOe;
    private FragmentActivity zzWA;
    private int zzWB;
    private int zzWC;
    private GoogleApiClient$OnConnectionFailedListener zzWD;
    private Api$zza zzWE;
    private final Set zzWF;
    private final Set zzWG;
    private zzpt$zza zzWH;
    private Looper zzWt;
    private final Set zzWv;
    private int zzWw;
    private View zzWx;
    private final Map zzWy;
    private final Map zzWz;
    
    public GoogleApiClient$Builder(final Context mContext) {
        final boolean a = Api.a;
        this.zzWv = new HashSet();
        this.zzWy = new HashMap();
        this.zzWz = new HashMap();
        this.zzWB = -1;
        this.zzWC = -1;
        this.zzWF = new HashSet();
        this.zzWG = new HashSet();
        this.zzWH = new zzpt$zza();
        this.mContext = mContext;
        this.zzWt = mContext.getMainLooper();
        this.zzOe = mContext.getPackageName();
        this.zzOd = mContext.getClass().getName();
        this.zzWE = zzpq.zzNY;
        if (zzu.a != 0) {
            Api.a = !a;
        }
    }
    
    private GoogleApiClient zzmy() {
        final zzm zza = zzm.zza(this.zzWA);
        final zzg zzg = new zzg(this.mContext.getApplicationContext(), this.zzWt, this.zzmx(), this.zzWE, this.zzWz, this.zzWF, this.zzWG, this.zzWB, -1);
        zza.zza(this.zzWB, zzg, this.zzWD);
        return zzg;
    }
    
    private GoogleApiClient zzmz() {
        final zzn zzb = zzn.zzb(this.zzWA);
        GoogleApiClient zzbc = zzb.zzbc(this.zzWC);
        if (zzbc == null) {
            zzbc = new zzg(this.mContext.getApplicationContext(), this.zzWt, this.zzmx(), this.zzWE, this.zzWz, this.zzWF, this.zzWG, -1, this.zzWC);
        }
        zzb.zza(this.zzWC, zzbc, this.zzWD);
        return zzbc;
    }
    
    public GoogleApiClient$Builder addApi(final Api api) {
        this.zzWz.put(api, null);
        this.zzWv.addAll(api.zzmr());
        return this;
    }
    
    public GoogleApiClient$Builder addConnectionCallbacks(final GoogleApiClient$ConnectionCallbacks googleApiClient$ConnectionCallbacks) {
        this.zzWF.add(googleApiClient$ConnectionCallbacks);
        return this;
    }
    
    public GoogleApiClient$Builder addOnConnectionFailedListener(final GoogleApiClient$OnConnectionFailedListener googleApiClient$OnConnectionFailedListener) {
        this.zzWG.add(googleApiClient$OnConnectionFailedListener);
        return this;
    }
    
    public GoogleApiClient build() {
        zzu.zzb(!this.zzWz.isEmpty(), "must call addApi() to add at least one API");
        if (this.zzWB >= 0) {
            return this.zzmy();
        }
        if (this.zzWC >= 0) {
            return this.zzmz();
        }
        return new zzg(this.mContext, this.zzWt, this.zzmx(), this.zzWE, this.zzWz, this.zzWF, this.zzWG, -1, -1);
    }
    
    public zze zzmx() {
        return new zze(this.zzMY, this.zzWv, this.zzWy, this.zzWw, this.zzWx, this.zzOe, this.zzOd, this.zzWH.zzyc());
    }
}
