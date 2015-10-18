// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.internal.ai;
import android.os.Parcel;
import com.google.android.gms.internal.al;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.gms.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CameraPosition implements SafeParcelable
{
    public static final j CREATOR;
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;
    
    static {
        CREATOR = new j();
    }
    
    CameraPosition(final int e, final LatLng a, final float b, final float n, float n2) {
        ap.a(a, "null camera target");
        ap.b(0.0f <= n && n <= 90.0f, (Object)"Tilt needs to be between 0 and 90 inclusive");
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = n + 0.0f;
        if (n2 <= 0.0) {
            n2 = 360.0f + n2 % 360.0f;
        }
        this.d = n2 % 360.0f;
    }
    
    public CameraPosition(final LatLng latLng, final float n, final float n2, final float n3) {
        this(1, latLng, n, n2, n3);
    }
    
    public static CameraPosition a(final Context context, final AttributeSet set) {
        if (set == null) {
            return null;
        }
        final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, an.MapAttrs);
        float float1;
        if (obtainAttributes.hasValue(an.MapAttrs_cameraTargetLat)) {
            float1 = obtainAttributes.getFloat(an.MapAttrs_cameraTargetLat, 0.0f);
        }
        else {
            float1 = 0.0f;
        }
        float float2;
        if (obtainAttributes.hasValue(an.MapAttrs_cameraTargetLng)) {
            float2 = obtainAttributes.getFloat(an.MapAttrs_cameraTargetLng, 0.0f);
        }
        else {
            float2 = 0.0f;
        }
        final LatLng latLng = new LatLng(float1, float2);
        final c b = b();
        b.a(latLng);
        if (obtainAttributes.hasValue(an.MapAttrs_cameraZoom)) {
            b.a(obtainAttributes.getFloat(an.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_cameraBearing)) {
            b.c(obtainAttributes.getFloat(an.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(an.MapAttrs_cameraTilt)) {
            b.b(obtainAttributes.getFloat(an.MapAttrs_cameraTilt, 0.0f));
        }
        return b.a();
    }
    
    public static c b() {
        return new c();
    }
    
    int a() {
        return this.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof CameraPosition)) {
                return false;
            }
            final CameraPosition cameraPosition = (CameraPosition)o;
            if (!this.a.equals(cameraPosition.a) || Float.floatToIntBits(this.b) != Float.floatToIntBits(cameraPosition.b) || Float.floatToIntBits(this.c) != Float.floatToIntBits(cameraPosition.c) || Float.floatToIntBits(this.d) != Float.floatToIntBits(cameraPosition.d)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("target", this.a).a("zoom", this.b).a("tilt", this.c).a("bearing", this.d).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (ai.a()) {
            k.a(this, parcel, n);
            return;
        }
        j.a(this, parcel, n);
    }
}
