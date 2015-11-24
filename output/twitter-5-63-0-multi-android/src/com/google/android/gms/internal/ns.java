// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ns implements SafeParcelable
{
    public static final ci CREATOR;
    private final int a;
    private final int b;
    private final int c;
    private final nu d;
    
    static {
        CREATOR = new ci();
    }
    
    ns(final int a, final int b, final int c, final nu d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public nu d() {
        return this.d;
    }
    
    public int describeContents() {
        final ci creator = ns.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ns)) {
                return false;
            }
            final ns ns = (ns)o;
            if (this.b != ns.b || this.c != ns.c || !this.d.equals(ns.d)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.b, this.c);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("transitionTypes", this.b).a("loiteringTimeMillis", this.c).a("placeFilter", this.d).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ci creator = ns.CREATOR;
        ci.a(this, parcel, n);
    }
}
