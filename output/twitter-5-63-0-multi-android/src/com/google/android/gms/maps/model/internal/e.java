// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class e implements SafeParcelable
{
    public static final i CREATOR;
    private final int a;
    private a b;
    
    static {
        CREATOR = new i();
    }
    
    public e() {
        this.a = 1;
    }
    
    e(final int a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    int a() {
        return this.a;
    }
    
    public a b() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        i.a(this, parcel, n);
    }
}
