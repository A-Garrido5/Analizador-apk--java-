// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.co;
import com.google.android.gms.dynamic.n;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.gms.internal.ap;
import android.view.View;
import com.google.android.gms.maps.internal.z;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.ag;

class w implements ag
{
    private final ViewGroup a;
    private final z b;
    private View c;
    
    public w(final ViewGroup viewGroup, final z z) {
        this.b = (z)ap.a(z);
        this.a = (ViewGroup)ap.a(viewGroup);
    }
    
    @Override
    public View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
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
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }
    
    @Override
    public void a(final Bundle bundle) {
        try {
            this.b.a(bundle);
            this.c = (View)n.a(this.b.f());
            this.a.removeAllViews();
            this.a.addView(this.c);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public void a(final u u) {
        try {
            this.b.a(new x(this, u));
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
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }
    
    @Override
    public void d() {
        try {
            this.b.d();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    @Override
    public void e() {
        try {
            this.b.e();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public z f() {
        return this.b;
    }
}
