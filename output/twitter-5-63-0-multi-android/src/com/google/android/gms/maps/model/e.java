// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.internal.ai;
import android.os.Parcel;
import com.google.android.gms.internal.al;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;

public final class e
{
    private double a;
    private double b;
    private double c;
    private double d;
    
    public e() {
        this.a = Double.POSITIVE_INFINITY;
        this.b = Double.NEGATIVE_INFINITY;
        this.c = Double.NaN;
        this.d = Double.NaN;
    }
    
    private boolean a(final double n) {
        if (this.c <= this.d) {
            return this.c <= n && n <= this.d;
        }
        if (this.c > n) {
            final double n2 = dcmpg(n, this.d);
            final boolean b = false;
            if (n2 > 0) {
                return b;
            }
        }
        return true;
    }
    
    public LatLngBounds a() {
        ap.a(!Double.isNaN(this.c), (Object)"no included points");
        return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
    }
    
    public e a(final LatLng latLng) {
        this.a = Math.min(this.a, latLng.a);
        this.b = Math.max(this.b, latLng.a);
        final double b = latLng.b;
        if (Double.isNaN(this.c)) {
            this.c = b;
            this.d = b;
        }
        else if (!this.a(b)) {
            if (c(this.c, b) < d(this.d, b)) {
                this.c = b;
                return this;
            }
            this.d = b;
            return this;
        }
        return this;
    }
}
