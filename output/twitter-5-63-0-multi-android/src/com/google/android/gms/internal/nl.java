// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collections;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class nl implements SafeParcelable
{
    public static final ce CREATOR;
    static final List a;
    LocationRequest b;
    boolean c;
    boolean d;
    boolean e;
    List f;
    final String g;
    private final int h;
    
    static {
        a = Collections.emptyList();
        CREATOR = new ce();
    }
    
    nl(final int h, final LocationRequest b, final boolean c, final boolean d, final boolean e, final List f, final String g) {
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    int a() {
        return this.h;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof nl) {
            final nl nl = (nl)o;
            if (al.a(this.b, nl.b) && this.c == nl.c && this.d == nl.d && this.e == nl.e && al.a(this.f, nl.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(" requestNlpDebugInfo=");
        sb.append(this.c);
        sb.append(" restorePendingIntentListeners=");
        sb.append(this.d);
        sb.append(" triggerUpdate=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.f);
        if (this.g != null) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ce.a(this, parcel, n);
    }
}
