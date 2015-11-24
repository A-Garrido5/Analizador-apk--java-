// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.zza;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout;

public class MapView extends FrameLayout
{
    public static int a;
    private GoogleMap zzaBV;
    private final MapView$zzb zzaCb;
    
    public MapView(final Context context) {
        super(context);
        this.zzaCb = new MapView$zzb((ViewGroup)this, context, null);
        this.init();
    }
    
    public MapView(final Context context, final AttributeSet set) {
        super(context, set);
        this.zzaCb = new MapView$zzb((ViewGroup)this, context, GoogleMapOptions.createFromAttributes(context, set));
        this.init();
    }
    
    public MapView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.zzaCb = new MapView$zzb((ViewGroup)this, context, GoogleMapOptions.createFromAttributes(context, set));
        this.init();
    }
    
    public MapView(final Context context, final GoogleMapOptions googleMapOptions) {
        super(context);
        this.zzaCb = new MapView$zzb((ViewGroup)this, context, googleMapOptions);
        this.init();
    }
    
    private void init() {
        this.setClickable(true);
    }
    
    @Deprecated
    public final GoogleMap getMap() {
        try {
            if (this.zzaBV != null) {
                return this.zzaBV;
            }
        }
        catch (RemoteException ex) {
            throw ex;
        }
        try {
            this.zzaCb.zzvu();
            if (this.zzaCb.zzqj() == null) {
                return null;
            }
        }
        catch (RemoteException ex2) {
            throw ex2;
        }
        try {
            return this.zzaBV = new GoogleMap(((MapView$zza)this.zzaCb.zzqj()).zzvv().getMap());
        }
        catch (RemoteException ex3) {
            throw new RuntimeRemoteException(ex3);
        }
    }
    
    public void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
        zzu.zzbY("getMapAsync() must be called on the main thread");
        this.zzaCb.getMapAsync(onMapReadyCallback);
    }
    
    public final void onCreate(final Bundle bundle) {
        try {
            this.zzaCb.onCreate(bundle);
            if (this.zzaCb.zzqj() == null) {
                zza.zzb(this);
            }
        }
        catch (RuntimeRemoteException ex) {
            throw ex;
        }
    }
    
    public final void onDestroy() {
        this.zzaCb.onDestroy();
    }
    
    public final void onLowMemory() {
        this.zzaCb.onLowMemory();
    }
    
    public final void onPause() {
        this.zzaCb.onPause();
    }
    
    public final void onResume() {
        this.zzaCb.onResume();
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        this.zzaCb.onSaveInstanceState(bundle);
    }
}
