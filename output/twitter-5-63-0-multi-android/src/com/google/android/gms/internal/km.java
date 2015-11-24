// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class km implements SafeParcelable
{
    public static final at CREATOR;
    private final int a;
    private final ko b;
    
    static {
        CREATOR = new at();
    }
    
    km(final int a, final ko b) {
        this.a = a;
        this.b = b;
    }
    
    private km(final ko b) {
        this.a = 1;
        this.b = b;
    }
    
    public static km a(final aw aw) {
        if (aw instanceof ko) {
            return new km((ko)aw);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }
    
    int a() {
        return this.a;
    }
    
    ko b() {
        return this.b;
    }
    
    public aw c() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
    
    public int describeContents() {
        final at creator = km.CREATOR;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final at creator = km.CREATOR;
        at.a(this, parcel, n);
    }
}
