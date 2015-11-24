// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.internal.al;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Status implements u, SafeParcelable
{
    public static final w CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    private final int f;
    private final int g;
    private final String h;
    private final PendingIntent i;
    
    static {
        a = new Status(0);
        b = new Status(14);
        c = new Status(8);
        d = new Status(15);
        e = new Status(16);
        CREATOR = new w();
    }
    
    public Status(final int n) {
        this(n, null);
    }
    
    Status(final int f, final int g, final String h, final PendingIntent i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public Status(final int n, final String s) {
        this(1, n, s, null);
    }
    
    public Status(final int n, final String s, final PendingIntent pendingIntent) {
        this(1, n, s, pendingIntent);
    }
    
    private String g() {
        if (this.h != null) {
            return this.h;
        }
        return m.a(this.g);
    }
    
    PendingIntent a() {
        return this.i;
    }
    
    @Override
    public Status b() {
        return this;
    }
    
    public String c() {
        return this.h;
    }
    
    int d() {
        return this.f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return this.g <= 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Status) {
            final Status status = (Status)o;
            if (this.f == status.f && this.g == status.g && al.a(this.h, status.h) && al.a(this.i, status.i)) {
                return true;
            }
        }
        return false;
    }
    
    public int f() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.f, this.g, this.h, this.i);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("statusCode", this.g()).a("resolution", this.i).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        w.a(this, parcel, n);
    }
}
