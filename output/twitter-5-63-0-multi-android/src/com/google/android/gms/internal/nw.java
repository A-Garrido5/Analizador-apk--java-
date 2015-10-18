// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class nw implements SafeParcelable
{
    public static final ck CREATOR;
    final int a;
    private final String b;
    private final String c;
    private final String d;
    
    static {
        CREATOR = new ck();
    }
    
    nw(final int a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public String a() {
        return this.b;
    }
    
    public String b() {
        return this.c;
    }
    
    public String c() {
        return this.d;
    }
    
    public int describeContents() {
        final ck creator = nw.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof nw) {
            final nw nw = (nw)o;
            if (al.a(this.b, nw.b) && al.a(this.c, nw.c) && al.a(this.d, nw.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.b, this.c, this.d);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("mPlaceId", this.b).a("mTag", this.c).a("mSource", this.d).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ck creator = nw.CREATOR;
        ck.a(this, parcel, n);
    }
}
