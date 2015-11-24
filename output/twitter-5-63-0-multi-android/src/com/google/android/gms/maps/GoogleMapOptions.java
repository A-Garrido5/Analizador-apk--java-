// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.ai;
import android.os.Parcel;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.gms.maps.internal.ah;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GoogleMapOptions implements SafeParcelable
{
    public static final ag CREATOR;
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    
    static {
        CREATOR = new ag();
    }
    
    public GoogleMapOptions() {
        this.d = -1;
        this.a = 1;
    }
    
    GoogleMapOptions(final int a, final byte b, final byte b2, final int d, final CameraPosition e, final byte b3, final byte b4, final byte b5, final byte b6, final byte b7, final byte b8, final byte b9, final byte b10) {
        this.d = -1;
        this.a = a;
        this.b = ah.a(b);
        this.c = ah.a(b2);
        this.d = d;
        this.e = e;
        this.f = ah.a(b3);
        this.g = ah.a(b4);
        this.h = ah.a(b5);
        this.i = ah.a(b6);
        this.j = ah.a(b7);
        this.k = ah.a(b8);
        this.l = ah.a(b9);
        this.m = ah.a(b10);
    }
    
    public static GoogleMapOptions a(final Context context, final AttributeSet set) {
        if (set == null) {
            return null;
        }
        final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, an.MapAttrs);
        final GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(an.MapAttrs_mapType)) {
            googleMapOptions.a(obtainAttributes.getInt(an.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a(obtainAttributes.getBoolean(an.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b(obtainAttributes.getBoolean(an.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiCompass)) {
            googleMapOptions.d(obtainAttributes.getBoolean(an.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiRotateGestures)) {
            googleMapOptions.h(obtainAttributes.getBoolean(an.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiScrollGestures)) {
            googleMapOptions.e(obtainAttributes.getBoolean(an.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiTiltGestures)) {
            googleMapOptions.g(obtainAttributes.getBoolean(an.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiZoomGestures)) {
            googleMapOptions.f(obtainAttributes.getBoolean(an.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiZoomControls)) {
            googleMapOptions.c(obtainAttributes.getBoolean(an.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_liteMode)) {
            googleMapOptions.i(obtainAttributes.getBoolean(an.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_uiMapToolbar)) {
            googleMapOptions.j(obtainAttributes.getBoolean(an.MapAttrs_uiMapToolbar, true));
        }
        googleMapOptions.a(CameraPosition.a(context, set));
        obtainAttributes.recycle();
        return googleMapOptions;
    }
    
    int a() {
        return this.a;
    }
    
    public GoogleMapOptions a(final int d) {
        this.d = d;
        return this;
    }
    
    public GoogleMapOptions a(final CameraPosition e) {
        this.e = e;
        return this;
    }
    
    public GoogleMapOptions a(final boolean b) {
        this.b = b;
        return this;
    }
    
    byte b() {
        return ah.a(this.b);
    }
    
    public GoogleMapOptions b(final boolean b) {
        this.c = b;
        return this;
    }
    
    byte c() {
        return ah.a(this.c);
    }
    
    public GoogleMapOptions c(final boolean b) {
        this.f = b;
        return this;
    }
    
    byte d() {
        return ah.a(this.f);
    }
    
    public GoogleMapOptions d(final boolean b) {
        this.g = b;
        return this;
    }
    
    public int describeContents() {
        return 0;
    }
    
    byte e() {
        return ah.a(this.g);
    }
    
    public GoogleMapOptions e(final boolean b) {
        this.h = b;
        return this;
    }
    
    byte f() {
        return ah.a(this.h);
    }
    
    public GoogleMapOptions f(final boolean b) {
        this.i = b;
        return this;
    }
    
    byte g() {
        return ah.a(this.i);
    }
    
    public GoogleMapOptions g(final boolean b) {
        this.j = b;
        return this;
    }
    
    byte h() {
        return ah.a(this.j);
    }
    
    public GoogleMapOptions h(final boolean b) {
        this.k = b;
        return this;
    }
    
    byte i() {
        return ah.a(this.k);
    }
    
    public GoogleMapOptions i(final boolean b) {
        this.l = b;
        return this;
    }
    
    byte j() {
        return ah.a(this.l);
    }
    
    public GoogleMapOptions j(final boolean b) {
        this.m = b;
        return this;
    }
    
    byte k() {
        return ah.a(this.m);
    }
    
    public int l() {
        return this.d;
    }
    
    public CameraPosition m() {
        return this.e;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (ai.a()) {
            com.google.android.gms.maps.ah.a(this, parcel, n);
            return;
        }
        ag.a(this, parcel, n);
    }
}
