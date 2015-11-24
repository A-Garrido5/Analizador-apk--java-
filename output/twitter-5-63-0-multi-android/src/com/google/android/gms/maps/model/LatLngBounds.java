// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.internal.ai;
import android.os.Parcel;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLngBounds implements SafeParcelable
{
    public static final p CREATOR;
    public final LatLng a;
    public final LatLng b;
    private final int c;
    
    static {
        CREATOR = new p();
    }
    
    LatLngBounds(final int c, final LatLng a, final LatLng b) {
        ap.a(a, "null southwest");
        ap.a(b, "null northeast");
        ap.b(b.a >= a.a, "southern latitude exceeds northern latitude (%s > %s)", a.a, b.a);
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public LatLngBounds(final LatLng latLng, final LatLng latLng2) {
        this(1, latLng, latLng2);
    }
    
    private static double c(final double n, final double n2) {
        return (360.0 + (n - n2)) % 360.0;
    }
    
    private static double d(final double n, final double n2) {
        return (360.0 + (n2 - n)) % 360.0;
    }
    
    int a() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof LatLngBounds)) {
                return false;
            }
            final LatLngBounds latLngBounds = (LatLngBounds)o;
            if (!this.a.equals(latLngBounds.a) || !this.b.equals(latLngBounds.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(new Object[] { this.a, this.b });
    }
    
    @Override
    public String toString() {
        return al.a(this).a("southwest", this.a).a("northeast", this.b).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (ai.a()) {
            q.a(this, parcel, n);
            return;
        }
        p.a(this, parcel, n);
    }
}
