// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.os.Bundle;

class zza$4 implements zza$zza
{
    final zza zzajl;
    final Bundle zzajo;
    final FrameLayout zzajp;
    final LayoutInflater zzajq;
    final ViewGroup zzajr;
    
    zza$4(final zza zzajl, final FrameLayout zzajp, final LayoutInflater zzajq, final ViewGroup zzajr, final Bundle zzajo) {
        this.zzajl = zzajl;
        this.zzajp = zzajp;
        this.zzajq = zzajq;
        this.zzajr = zzajr;
        this.zzajo = zzajo;
    }
    
    @Override
    public int getState() {
        return 2;
    }
    
    @Override
    public void zzb(final LifecycleDelegate lifecycleDelegate) {
        this.zzajp.removeAllViews();
        this.zzajp.addView(zza.zzb(this.zzajl).onCreateView(this.zzajq, this.zzajr, this.zzajo));
    }
}
