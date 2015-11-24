// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ny implements SafeParcelable
{
    public static final cl CREATOR;
    public static final long a;
    final int b;
    private final nu c;
    private final long d;
    private final int e;
    
    static {
        CREATOR = new cl();
        a = TimeUnit.HOURS.toMillis(1L);
    }
    
    public ny(final int b, final nu c, final long d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public nu a() {
        return this.c;
    }
    
    public long b() {
        return this.d;
    }
    
    public int c() {
        return this.e;
    }
    
    public int describeContents() {
        final cl creator = ny.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ny)) {
                return false;
            }
            final ny ny = (ny)o;
            if (!al.a(this.c, ny.c) || this.d != ny.d || this.e != ny.e) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.c, this.d, this.e);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("filter", this.c).a("interval", this.d).a("priority", this.e).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final cl creator = ny.CREATOR;
        cl.a(this, parcel, n);
    }
}
