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
import android.support.v4.app.Fragment;

public class SupportMapFragment extends Fragment
{
    private final SupportMapFragment$zzb zzaCH;
    
    public SupportMapFragment() {
        this.zzaCH = new SupportMapFragment$zzb(this);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        SupportMapFragment$zzb.zza(this.zzaCH, activity);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.zzaCH.onCreate(bundle);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = this.zzaCH.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }
    
    @Override
    public void onDestroy() {
        this.zzaCH.onDestroy();
        super.onDestroy();
    }
    
    @Override
    public void onDestroyView() {
        this.zzaCH.onDestroyView();
        super.onDestroyView();
    }
    
    @Override
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        super.onInflate(activity, set, bundle);
        SupportMapFragment$zzb.zza(this.zzaCH, activity);
        final GoogleMapOptions fromAttributes = GoogleMapOptions.createFromAttributes((Context)activity, set);
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", (Parcelable)fromAttributes);
        this.zzaCH.onInflate(activity, bundle2, bundle);
    }
    
    @Override
    public void onLowMemory() {
        this.zzaCH.onLowMemory();
        super.onLowMemory();
    }
    
    @Override
    public void onPause() {
        this.zzaCH.onPause();
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.zzaCH.onResume();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaCH.onSaveInstanceState(bundle);
    }
    
    @Override
    public void setArguments(final Bundle arguments) {
        super.setArguments(arguments);
    }
}
