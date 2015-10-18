// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Bundle;
import android.app.Activity;
import com.twitter.android.geo.GeoTagState;
import android.content.Context;
import com.twitter.library.client.az;
import android.location.Location;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.android.geo.PlacePickerModel;
import com.twitter.android.geo.d;
import com.twitter.library.client.AbsFragment;

public abstract class ComposerLocationFragment extends AbsFragment implements d, bn, so
{
    protected final PlacePickerModel a;
    protected c b;
    protected sp c;
    protected Session d;
    protected long e;
    protected y f;
    protected Location g;
    protected boolean h;
    protected boolean i;
    private boolean j;
    
    public ComposerLocationFragment() {
        this.a = new PlacePickerModel();
    }
    
    private boolean e() {
        boolean b;
        if (this.j || sk.a().c(this.d)) {
            b = true;
        }
        else {
            b = false;
        }
        this.j = false;
        return b && sk.a().a(az.a((Context)this.getActivity()).b());
    }
    
    @Override
    public void a() {
        this.j = true;
    }
    
    @Override
    public void a(final float n) {
    }
    
    @Override
    public void a(final Location location) {
    }
    
    public void a(final GeoTagState geoTagState) {
        this.a.a(geoTagState);
        if (this.f != null) {
            final boolean c = geoTagState.c();
            String fullName = null;
            if (c) {
                fullName = geoTagState.e().fullName;
            }
            this.f.a(fullName);
        }
    }
    
    public void a(final y f) {
        this.f = f;
    }
    
    public GeoTagState b() {
        return this.a.b();
    }
    
    @Override
    public void b(final int n) {
    }
    
    @Override
    public void b(final Location location) {
        this.i = false;
    }
    
    protected void b(final boolean h) {
        if (this.h != h) {
            this.h = h;
            sk.a().a(this.d, h);
            if (this.f != null) {
                this.f.a(h);
            }
        }
        if (this.h) {
            this.i = true;
            this.c.a(this);
            return;
        }
        this.i = false;
        this.c.b(this);
        this.g = null;
        this.a(GeoTagState.a());
    }
    
    public String c() {
        final GeoTagState b = this.b();
        String fullName;
        if (b.c()) {
            fullName = b.e().fullName;
        }
        else {
            fullName = "none";
        }
        return "geoSelectedPlaceId: " + fullName + "\nisGeoAutoTagEnabled: " + this.e();
    }
    
    public void d() {
        this.d = az.a((Context)this.getActivity()).b();
        this.e = this.d.g();
        this.b(this.e());
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.b = com.twitter.android.client.c.a((Context)activity);
        this.c = sp.a((Context)activity);
        this.d = az.a((Context)activity).b();
        this.e = this.d.g();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        super.setRetainInstance(true);
        String s;
        if (this.e()) {
            s = "compose:::autotag:enabled";
        }
        else {
            s = "compose:::autotag:disabled";
        }
        this.b.a(this.e, s);
    }
    
    @Override
    public void onPause() {
        this.c.b(this);
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.b(this.e());
    }
    
    @Override
    public void x() {
    }
}
