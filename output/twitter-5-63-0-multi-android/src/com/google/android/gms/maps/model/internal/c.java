// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class c implements SafeParcelable
{
    public static final h CREATOR;
    private final int a;
    private int b;
    private Bundle c;
    
    static {
        CREATOR = new h();
    }
    
    c(final int a, final int b, final Bundle c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public Bundle c() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        h.a(this, parcel, n);
    }
}
