// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class nd implements SafeParcelable
{
    public static final bo CREATOR;
    public final int a;
    public final String b;
    private final int c;
    
    static {
        CREATOR = new bo();
    }
    
    nd(final int c, final int a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    int a() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof nd) {
            final nd nd = (nd)o;
            if (nd.a == this.a && al.a(nd.b, this.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return String.format("%d:%s", this.a, this.b);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        bo.a(this, parcel, n);
    }
}
