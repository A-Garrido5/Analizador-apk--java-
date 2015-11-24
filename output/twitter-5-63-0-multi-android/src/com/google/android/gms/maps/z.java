// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.bq;
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
import com.google.android.gms.maps.internal.j;
import android.support.v4.app.Fragment;
import com.google.android.gms.maps.internal.af;

class z implements af
{
    private final Fragment a;
    private final j b;
    
    public z(final Fragment fragment, final j j) {
        this.b = (j)ap.a(j);
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
        final GoogleMapOptions googleMapOptions = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try {
            this.b.a(n.a(activity), googleMapOptions, bundle2);
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
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    cu.a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.b.a(bundle);
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
    }
    
    public void a(final t t) {
        try {
            this.b.a(new aa(this, t));
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
    
    public j f() {
        return this.b;
    }
}
