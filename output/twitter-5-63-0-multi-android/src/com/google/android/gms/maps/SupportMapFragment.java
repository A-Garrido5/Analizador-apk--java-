// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import java.util.Iterator;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.maps.internal.cv;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.dynamic.o;
import com.google.android.gms.dynamic.b;
import android.os.Parcelable;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.internal.d;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.internal.j;
import android.support.v4.app.Fragment;

public class SupportMapFragment extends Fragment
{
    private final ab a;
    private c b;
    
    public SupportMapFragment() {
        this.a = new ab(this);
    }
    
    public static SupportMapFragment a() {
        return new SupportMapFragment();
    }
    
    protected j b() {
        this.a.g();
        if (this.a.a() == null) {
            return null;
        }
        return ((z)this.a.a()).f();
    }
    
    @Deprecated
    public final c c() {
        final j b = this.b();
        if (b != null) {
            try {
                final d a = b.a();
                if (a != null) {
                    if (this.b == null || this.b.a().asBinder() != a.asBinder()) {
                        this.b = new c(a);
                    }
                    return this.b;
                }
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
        return null;
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
        final GoogleMapOptions a = GoogleMapOptions.a((Context)activity, set);
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", (Parcelable)a);
        this.a.a(activity, bundle2, bundle);
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
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }
    
    @Override
    public void setArguments(final Bundle arguments) {
        super.setArguments(arguments);
    }
}
