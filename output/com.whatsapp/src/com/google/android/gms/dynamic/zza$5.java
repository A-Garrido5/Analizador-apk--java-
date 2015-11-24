// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import com.google.android.gms.common.GooglePlayServicesUtil;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

final class zza$5 implements View$OnClickListener
{
    final int zzajs;
    final Context zzqV;
    
    zza$5(final Context zzqV, final int zzajs) {
        this.zzqV = zzqV;
        this.zzajs = zzajs;
    }
    
    public void onClick(final View view) {
        this.zzqV.startActivity(GooglePlayServicesUtil.zzaT(this.zzajs));
    }
}
