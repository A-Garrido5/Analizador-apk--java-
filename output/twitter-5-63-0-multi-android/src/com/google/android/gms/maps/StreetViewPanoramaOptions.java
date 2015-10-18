// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.maps.internal.ah;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StreetViewPanoramaOptions implements SafeParcelable
{
    public static final ai CREATOR;
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    
    static {
        CREATOR = new ai();
    }
    
    public StreetViewPanoramaOptions() {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.a = 1;
    }
    
    StreetViewPanoramaOptions(final int a, final StreetViewPanoramaCamera b, final String c, final LatLng d, final Integer e, final byte b2, final byte b3, final byte b4, final byte b5, final byte b6) {
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
        this.f = ah.a(b2);
        this.g = ah.a(b3);
        this.h = ah.a(b4);
        this.i = ah.a(b5);
        this.j = ah.a(b6);
    }
    
    int a() {
        return this.a;
    }
    
    byte b() {
        return ah.a(this.f);
    }
    
    byte c() {
        return ah.a(this.g);
    }
    
    byte d() {
        return ah.a(this.h);
    }
    
    public int describeContents() {
        return 0;
    }
    
    byte e() {
        return ah.a(this.i);
    }
    
    byte f() {
        return ah.a(this.j);
    }
    
    public StreetViewPanoramaCamera g() {
        return this.b;
    }
    
    public LatLng h() {
        return this.d;
    }
    
    public Integer i() {
        return this.e;
    }
    
    public String j() {
        return this.c;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ai.a(this, parcel, n);
    }
}
