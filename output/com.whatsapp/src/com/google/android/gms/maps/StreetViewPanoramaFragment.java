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
import android.app.Fragment;

public class StreetViewPanoramaFragment extends Fragment
{
    private final StreetViewPanoramaFragment$zzb zzaCp;
    
    public StreetViewPanoramaFragment() {
        this.zzaCp = new StreetViewPanoramaFragment$zzb(this);
    }
    
    public void onActivityCreated(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        StreetViewPanoramaFragment$zzb.zza(this.zzaCp, activity);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.zzaCp.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.zzaCp.onCreateView(layoutInflater, viewGroup, bundle);
    }
    
    public void onDestroy() {
        this.zzaCp.onDestroy();
        super.onDestroy();
    }
    
    public void onDestroyView() {
        this.zzaCp.onDestroyView();
        super.onDestroyView();
    }
    
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        super.onInflate(activity, set, bundle);
        StreetViewPanoramaFragment$zzb.zza(this.zzaCp, activity);
        this.zzaCp.onInflate(activity, new Bundle(), bundle);
    }
    
    public void onLowMemory() {
        this.zzaCp.onLowMemory();
        super.onLowMemory();
    }
    
    public void onPause() {
        this.zzaCp.onPause();
        super.onPause();
    }
    
    public void onResume() {
        super.onResume();
        this.zzaCp.onResume();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaCp.onSaveInstanceState(bundle);
    }
    
    public void setArguments(final Bundle arguments) {
        super.setArguments(arguments);
    }
}
