// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import java.util.Iterator;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.maps.internal.cv;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.dynamic.o;
import com.google.android.gms.dynamic.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SupportStreetViewPanoramaFragment extends Fragment
{
    private final ae a;
    
    public SupportStreetViewPanoramaFragment() {
        this.a = new ae(this);
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
        this.a.a(activity);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup, bundle);
    }
    
    @Override
    public void onDestroy() {
        this.a.e();
        super.onDestroy();
    }
    
    @Override
    public void onDestroyView() {
        this.a.d();
        super.onDestroyView();
    }
    
    @Override
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        super.onInflate(activity, set, bundle);
        this.a.a(activity);
        this.a.a(activity, new Bundle(), bundle);
    }
    
    @Override
    public void onLowMemory() {
        this.a.f();
        super.onLowMemory();
    }
    
    @Override
    public void onPause() {
        this.a.c();
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a.b();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }
    
    @Override
    public void setArguments(final Bundle arguments) {
        super.setArguments(arguments);
    }
}
