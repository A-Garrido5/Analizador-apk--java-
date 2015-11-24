// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.internal.al;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StreetViewPanoramaLocation implements SafeParcelable
{
    public static final ab CREATOR;
    public final StreetViewPanoramaLink[] a;
    public final LatLng b;
    public final String c;
    private final int d;
    
    static {
        CREATOR = new ab();
    }
    
    StreetViewPanoramaLocation(final int d, final StreetViewPanoramaLink[] a, final LatLng b, final String c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    int a() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof StreetViewPanoramaLocation)) {
                return false;
            }
            final StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation)o;
            if (!this.c.equals(streetViewPanoramaLocation.c) || !this.b.equals(streetViewPanoramaLocation.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(new Object[] { this.b, this.c });
    }
    
    @Override
    public String toString() {
        return al.a(this).a("panoId", this.c).a("position", this.b.toString()).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ab.a(this, parcel, n);
    }
}
