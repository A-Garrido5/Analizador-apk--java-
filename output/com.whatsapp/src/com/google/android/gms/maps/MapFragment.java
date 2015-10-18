// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.Parcelable;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;

public class MapFragment extends Fragment
{
    private final MapFragment$zzb zzaBU;
    
    public MapFragment() {
        this.zzaBU = new MapFragment$zzb(this);
    }
    
    public void onActivityCreated(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        MapFragment$zzb.zza(this.zzaBU, activity);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.zzaBU.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = this.zzaBU.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }
    
    public void onDestroy() {
        this.zzaBU.onDestroy();
        super.onDestroy();
    }
    
    public void onDestroyView() {
        this.zzaBU.onDestroyView();
        super.onDestroyView();
    }
    
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        super.onInflate(activity, set, bundle);
        MapFragment$zzb.zza(this.zzaBU, activity);
        final GoogleMapOptions fromAttributes = GoogleMapOptions.createFromAttributes((Context)activity, set);
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", (Parcelable)fromAttributes);
        this.zzaBU.onInflate(activity, bundle2, bundle);
    }
    
    public void onLowMemory() {
        this.zzaBU.onLowMemory();
        super.onLowMemory();
    }
    
    public void onPause() {
        this.zzaBU.onPause();
        super.onPause();
    }
    
    public void onResume() {
        super.onResume();
        this.zzaBU.onResume();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaBU.onSaveInstanceState(bundle);
    }
    
    public void setArguments(final Bundle arguments) {
        super.setArguments(arguments);
    }
}
