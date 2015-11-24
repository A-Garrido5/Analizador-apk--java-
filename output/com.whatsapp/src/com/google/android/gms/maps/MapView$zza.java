// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.app.Activity;
import android.view.LayoutInflater;
import com.google.android.gms.dynamic.zze;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.common.internal.zzu;
import android.view.View;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;

class MapView$zza implements MapLifecycleDelegate
{
    private final ViewGroup zzaCc;
    private final IMapViewDelegate zzaCd;
    private View zzaCe;
    
    public MapView$zza(final ViewGroup viewGroup, final IMapViewDelegate mapViewDelegate) {
        this.zzaCd = (IMapViewDelegate)zzu.zzu(mapViewDelegate);
        this.zzaCc = (ViewGroup)zzu.zzu(viewGroup);
    }
    
    public void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
        try {
            this.zzaCd.getMapAsync(new MapView$zza$1(this, onMapReadyCallback));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        try {
            this.zzaCd.onCreate(bundle);
            this.zzaCe = (View)zze.zzn(this.zzaCd.getView());
            this.zzaCc.removeAllViews();
            this.zzaCc.addView(this.zzaCe);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }
    
    @Override
    public void onDestroy() {
        try {
            this.zzaCd.onDestroy();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onDestroyView() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }
    
    @Override
    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }
    
    @Override
    public void onLowMemory() {
        try {
            this.zzaCd.onLowMemory();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onPause() {
        try {
            this.zzaCd.onPause();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onResume() {
        try {
            this.zzaCd.onResume();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        try {
            this.zzaCd.onSaveInstanceState(bundle);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public IMapViewDelegate zzvv() {
        return this.zzaCd;
    }
}
