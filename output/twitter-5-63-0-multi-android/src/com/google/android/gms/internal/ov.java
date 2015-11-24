// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ov implements SafeParcelable
{
    public static final cu CREATOR;
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    
    static {
        CREATOR = new cu();
    }
    
    public ov(final int a, final String b, final int c, final int d, final String e, final String f, final boolean g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ov)) {
                return false;
            }
            final ov ov = (ov)o;
            if (!this.b.equals(ov.b) || this.c != ov.c || this.d != ov.d || !al.a(this.h, ov.h) || !al.a(this.e, ov.e) || !al.a(this.f, ov.f) || this.g != ov.g) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.b, this.c, this.d, this.e, this.f, this.g);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=").append(this.b).append(',');
        sb.append("versionCode=").append(this.a).append(',');
        sb.append("logSource=").append(this.d).append(',');
        sb.append("logSourceName=").append(this.h).append(',');
        sb.append("uploadAccount=").append(this.e).append(',');
        sb.append("loggingId=").append(this.f).append(',');
        sb.append("logAndroidId=").append(this.g);
        sb.append("]");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        cu.a(this, parcel, n);
    }
}
