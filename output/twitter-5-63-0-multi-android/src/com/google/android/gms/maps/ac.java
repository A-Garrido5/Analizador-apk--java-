// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.co;
import com.google.android.gms.maps.internal.cu;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.dynamic.n;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.gms.internal.ap;
import com.google.android.gms.maps.internal.v;
import android.support.v4.app.Fragment;
import com.google.android.gms.maps.internal.ag;

class ac implements ag
{
    private final Fragment a;
    private final v b;
    
    public ac(final Fragment fragment, final v v) {
        this.b = (v)ap.a(v);
        this.a = (Fragment)ap.a(fragment);
    }
    
    @Override
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        try {
            return (View)n.a(this.b.a(n.a(layoutInflater), n.a(viewGroup), bundle));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void a() {
        try {
            this.b.b();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void a(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        try {
            this.b.a(n.a(activity), (StreetViewPanoramaOptions)null, bundle2);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void a(Bundle bundle) {
        Label_0012: {
            if (bundle != null) {
                break Label_0012;
            }
            try {
                bundle = new Bundle();
                final Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    cu.a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.b.a(bundle);
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
    }
    
    public void a(final u u) {
        try {
            this.b.a(new ad(this, u));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void b() {
        try {
            this.b.c();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void b(final Bundle bundle) {
        try {
            this.b.b(bundle);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void c() {
        try {
            this.b.d();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void d() {
        try {
            this.b.e();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void e() {
        try {
            this.b.f();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
