// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.dynamic.zzg$zza;
import com.google.android.gms.dynamic.zze;
import android.view.View;
import android.content.Context;
import com.google.android.gms.dynamic.zzg;

public final class zzx extends zzg
{
    private static final zzx zzabe;
    
    static {
        zzabe = new zzx();
    }
    
    private zzx() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }
    
    public static View zzb(final Context context, final int n, final int n2) {
        return zzx.zzabe.zzc(context, n, n2);
    }
    
    private View zzc(final Context context, final int n, final int n2) {
        try {
            return (View)zze.zzn(((zzr)this.zzak(context)).zza(zze.zzw(context), n, n2));
        }
        catch (Exception ex) {
            throw new zzg$zza("Could not get button with size " + n + " and color " + n2, ex);
        }
    }
    
    public zzr zzaJ(final IBinder binder) {
        return zzr$zza.zzaI(binder);
    }
    
    public Object zzd(final IBinder binder) {
        return this.zzaJ(binder);
    }
}
