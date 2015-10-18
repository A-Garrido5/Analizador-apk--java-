// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.internal.ap;
import com.google.android.gms.dynamic.b;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout;

public class MapView extends FrameLayout
{
    private final r a;
    private c b;
    
    public MapView(final Context context) {
        super(context);
        this.a = new r((ViewGroup)this, context, null);
    }
    
    public MapView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new r((ViewGroup)this, context, GoogleMapOptions.a(context, set));
    }
    
    public MapView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new r((ViewGroup)this, context, GoogleMapOptions.a(context, set));
    }
    
    public MapView(final Context context, final GoogleMapOptions googleMapOptions) {
        super(context);
        this.a = new r((ViewGroup)this, context, googleMapOptions);
    }
    
    public final void a() {
        this.a.b();
    }
    
    public final void a(final Bundle bundle) {
        this.a.a(bundle);
        if (this.a.a() == null) {
            com.google.android.gms.dynamic.b.b(this);
        }
    }
    
    public void a(final t t) {
        ap.b("getMapAsync() must be called on the main thread");
        this.a.a(t);
    }
    
    public final void b() {
        this.a.c();
    }
    
    public final void b(final Bundle bundle) {
        this.a.b(bundle);
    }
    
    public final void c() {
        this.a.e();
    }
    
    public final void d() {
        this.a.f();
    }
    
    @Deprecated
    public final c getMap() {
        if (this.b != null) {
            return this.b;
        }
        this.a.g();
        if (this.a.a() == null) {
            return null;
        }
        try {
            return this.b = new c(((p)this.a.a()).f().a());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
