// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.internal.al;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LocationRequest implements SafeParcelable
{
    public static final o CREATOR;
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    long h;
    private final int i;
    
    static {
        CREATOR = new o();
    }
    
    public LocationRequest() {
        this.i = 1;
        this.a = 102;
        this.b = 3600000L;
        this.c = 600000L;
        this.d = false;
        this.e = Long.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0L;
    }
    
    LocationRequest(final int i, final int a, final long b, final long c, final boolean d, final long e, final int f, final float g, final long h) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static LocationRequest a() {
        return new LocationRequest();
    }
    
    public static String c(final int n) {
        switch (n) {
            default: {
                return "???";
            }
            case 100: {
                return "PRIORITY_HIGH_ACCURACY";
            }
            case 102: {
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            }
            case 104: {
                return "PRIORITY_LOW_POWER";
            }
            case 105: {
                return "PRIORITY_NO_POWER";
            }
        }
    }
    
    private static void c(final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("invalid interval: " + n);
        }
    }
    
    private static void d(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("invalid quality: " + n);
            }
            case 100:
            case 102:
            case 104:
            case 105: {}
        }
    }
    
    public LocationRequest a(final int a) {
        d(a);
        this.a = a;
        return this;
    }
    
    public LocationRequest a(final long b) {
        c(b);
        this.b = b;
        if (!this.d) {
            this.c = (long)(this.b / 6.0);
        }
        return this;
    }
    
    int b() {
        return this.i;
    }
    
    public LocationRequest b(final int f) {
        if (f <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + f);
        }
        this.f = f;
        return this;
    }
    
    public LocationRequest b(final long c) {
        c(c);
        this.d = true;
        this.c = c;
        return this;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof LocationRequest)) {
                return false;
            }
            final LocationRequest locationRequest = (LocationRequest)o;
            if (this.a != locationRequest.a || this.b != locationRequest.b || this.c != locationRequest.c || this.d != locationRequest.d || this.e != locationRequest.e || this.f != locationRequest.f || this.g != locationRequest.g) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Request[").append(c(this.a));
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b + "ms");
        }
        sb.append(" fastest=");
        sb.append(this.c + "ms");
        if (this.e != Long.MAX_VALUE) {
            final long n = this.e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(n + "ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        o.a(this, parcel, n);
    }
}
