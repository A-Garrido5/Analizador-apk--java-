// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SupportStreetViewPanoramaFragment extends Fragment
{
    private final SupportStreetViewPanoramaFragment$zzb zzaCJ;
    
    public SupportStreetViewPanoramaFragment() {
        this.zzaCJ = new SupportStreetViewPanoramaFragment$zzb(this);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        SupportStreetViewPanoramaFragment$zzb.zza(this.zzaCJ, activity);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.zzaCJ.onCreate(bundle);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.zzaCJ.onCreateView(layoutInflater, viewGroup, bundle);
    }
    
    @Override
    public void onDestroy() {
        this.zzaCJ.onDestroy();
        super.onDestroy();
    }
    
    @Override
    public void onDestroyView() {
        this.zzaCJ.onDestroyView();
        super.onDestroyView();
    }
    
    @Override
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        super.onInflate(activity, set, bundle);
        SupportStreetViewPanoramaFragment$zzb.zza(this.zzaCJ, activity);
        this.zzaCJ.onInflate(activity, new Bundle(), bundle);
    }
    
    @Override
    public void onLowMemory() {
        this.zzaCJ.onLowMemory();
        super.onLowMemory();
    }
    
    @Override
    public void onPause() {
        this.zzaCJ.onPause();
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.zzaCJ.onResume();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaCJ.onSaveInstanceState(bundle);
    }
    
    @Override
    public void setArguments(final Bundle arguments) {
        super.setArguments(arguments);
    }
}
