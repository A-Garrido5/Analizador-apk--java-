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
import com.google.android.gms.maps.internal.zzv;
import com.google.android.gms.common.internal.zzu;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;

class StreetViewPanoramaView$zza implements StreetViewLifecycleDelegate
{
    private final IStreetViewPanoramaViewDelegate zzaCD;
    private View zzaCE;
    private final ViewGroup zzaCc;
    
    public StreetViewPanoramaView$zza(final ViewGroup viewGroup, final IStreetViewPanoramaViewDelegate streetViewPanoramaViewDelegate) {
        this.zzaCD = (IStreetViewPanoramaViewDelegate)zzu.zzu(streetViewPanoramaViewDelegate);
        this.zzaCc = (ViewGroup)zzu.zzu(viewGroup);
    }
    
    public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.zzaCD.getStreetViewPanoramaAsync(new StreetViewPanoramaView$zza$1(this, onStreetViewPanoramaReadyCallback));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        try {
            this.zzaCD.onCreate(bundle);
            this.zzaCE = (View)zze.zzn(this.zzaCD.getView());
            this.zzaCc.removeAllViews();
            this.zzaCc.addView(this.zzaCE);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }
    
    @Override
    public void onDestroy() {
        try {
            this.zzaCD.onDestroy();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onDestroyView() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }
    
    @Override
    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }
    
    @Override
    public void onLowMemory() {
        try {
            this.zzaCD.onLowMemory();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onPause() {
        try {
            this.zzaCD.onPause();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onResume() {
        try {
            this.zzaCD.onResume();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        try {
            this.zzaCD.onSaveInstanceState(bundle);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
