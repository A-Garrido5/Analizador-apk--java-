// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.internal.ap;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Scope implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    private final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new ah();
    }
    
    Scope(final int a, final String b) {
        ap.a(b, "scopeUri must not be null or empty");
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Scope && this.b.equals(((Scope)o).b));
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public String toString() {
        return this.b;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ah.a(this, parcel, n);
    }
}
