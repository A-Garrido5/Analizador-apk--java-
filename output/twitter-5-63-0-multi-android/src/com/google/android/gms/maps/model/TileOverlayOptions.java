// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.internal.ai;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.ag;
import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TileOverlayOptions implements SafeParcelable
{
    public static final af CREATOR;
    private final int a;
    private com.google.android.gms.maps.model.internal.af b;
    private i c;
    private boolean d;
    private float e;
    private boolean f;
    
    static {
        CREATOR = new af();
    }
    
    public TileOverlayOptions() {
        this.d = true;
        this.f = true;
        this.a = 1;
    }
    
    TileOverlayOptions(final int a, final IBinder binder, final boolean d, final float e, final boolean f) {
        this.d = true;
        this.f = true;
        this.a = a;
        this.b = ag.a(binder);
        i c;
        if (this.b == null) {
            c = null;
        }
        else {
            c = new h(this);
        }
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    int a() {
        return this.a;
    }
    
    IBinder b() {
        return this.b.asBinder();
    }
    
    public float c() {
        return this.e;
    }
    
    public boolean d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return this.f;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (ai.a()) {
            com.google.android.gms.maps.model.ag.a(this, parcel, n);
            return;
        }
        af.a(this, parcel, n);
    }
}
