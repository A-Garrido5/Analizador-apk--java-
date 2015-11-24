// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class or implements SafeParcelable
{
    public static final ct CREATOR;
    public final int a;
    public final long b;
    public final String c;
    public final byte[] d;
    public final Bundle e;
    
    static {
        CREATOR = new ct();
    }
    
    or(final int a, final long b, final String c, final byte[] d, final Bundle e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("tag=").append(this.c).append(",");
        sb.append("eventTime=").append(this.b).append(",");
        if (this.e != null && !this.e.isEmpty()) {
            sb.append("keyValues=");
            for (final String s : this.e.keySet()) {
                sb.append("(").append(s).append(",");
                sb.append(this.e.getString(s)).append(")");
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ct.a(this, parcel, n);
    }
}
