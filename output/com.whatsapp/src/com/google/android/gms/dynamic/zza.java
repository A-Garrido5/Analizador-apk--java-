// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.gms.common.internal.zzu;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.common.GooglePlayServicesUtil;
import android.widget.FrameLayout;
import java.util.LinkedList;
import android.os.Bundle;

public abstract class zza
{
    private LifecycleDelegate zzajh;
    private Bundle zzaji;
    private LinkedList zzajj;
    private final zzf zzajk;
    
    public zza() {
        this.zzajk = new zza$1(this);
    }
    
    static Bundle zza(final zza zza, final Bundle zzaji) {
        return zza.zzaji = zzaji;
    }
    
    static LifecycleDelegate zza(final zza zza, final LifecycleDelegate zzajh) {
        return zza.zzajh = zzajh;
    }
    
    static LinkedList zza(final zza zza) {
        return zza.zzajj;
    }
    
    private void zza(final Bundle bundle, final zza$zza zza$zza) {
        if (this.zzajh != null) {
            zza$zza.zzb(this.zzajh);
            return;
        }
        if (this.zzajj == null) {
            this.zzajj = new LinkedList();
        }
        this.zzajj.add(zza$zza);
        Label_0081: {
            if (bundle != null) {
                if (this.zzaji == null) {
                    this.zzaji = (Bundle)bundle.clone();
                    if (!zzd$zza.a) {
                        break Label_0081;
                    }
                }
                this.zzaji.putAll(bundle);
            }
        }
        this.zza(this.zzajk);
    }
    
    static LifecycleDelegate zzb(final zza zza) {
        return zza.zzajh;
    }
    
    public static void zzb(final FrameLayout frameLayout) {
        final boolean a = zzd$zza.a;
        final Context context = frameLayout.getContext();
        final int googlePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        final String zzb = com.google.android.gms.common.internal.zzf.zzb(context, googlePlayServicesAvailable, GooglePlayServicesUtil.zzad(context));
        final String zzh = com.google.android.gms.common.internal.zzf.zzh(context, googlePlayServicesAvailable);
        final LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout);
        final TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        textView.setText((CharSequence)zzb);
        linearLayout.addView((View)textView);
        if (zzh != null) {
            final Button button = new Button(context);
            button.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
            button.setText((CharSequence)zzh);
            linearLayout.addView((View)button);
            button.setOnClickListener((View$OnClickListener)new zza$5(context, googlePlayServicesAvailable));
        }
        if (a) {
            ++zzu.a;
        }
    }
    
    private void zzdY(final int n) {
        final boolean a = zzd$zza.a;
        while (!this.zzajj.isEmpty() && this.zzajj.getLast().getState() >= n) {
            this.zzajj.removeLast();
            if (a) {
                break;
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        this.zza(bundle, new zza$3(this, bundle));
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final boolean a = zzd$zza.a;
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.zza(bundle, new zza$4(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zzajh == null) {
            this.zza(frameLayout);
        }
        if (zzu.a != 0) {
            zzd$zza.a = !a;
        }
        return (View)frameLayout;
    }
    
    public void onDestroy() {
        if (this.zzajh != null) {
            this.zzajh.onDestroy();
            if (!zzd$zza.a) {
                return;
            }
        }
        this.zzdY(1);
    }
    
    public void onDestroyView() {
        if (this.zzajh != null) {
            this.zzajh.onDestroyView();
            if (!zzd$zza.a) {
                return;
            }
        }
        this.zzdY(2);
    }
    
    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        this.zza(bundle2, new zza$2(this, activity, bundle, bundle2));
    }
    
    public void onLowMemory() {
        if (this.zzajh != null) {
            this.zzajh.onLowMemory();
        }
    }
    
    public void onPause() {
        if (this.zzajh != null) {
            this.zzajh.onPause();
            if (!zzd$zza.a) {
                return;
            }
        }
        this.zzdY(5);
    }
    
    public void onResume() {
        this.zza(null, new zza$7(this));
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        if (this.zzajh != null) {
            this.zzajh.onSaveInstanceState(bundle);
            if (!zzd$zza.a) {
                return;
            }
        }
        if (this.zzaji != null) {
            bundle.putAll(this.zzaji);
        }
    }
    
    protected void zza(final FrameLayout frameLayout) {
        zzb(frameLayout);
    }
    
    protected abstract void zza(final zzf p0);
    
    public LifecycleDelegate zzqj() {
        return this.zzajh;
    }
}
