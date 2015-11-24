// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class jj implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    jj(final int a, final int b, final int c, final String d, final IBinder e, final Scope[] f, final Bundle g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        n.a(this, parcel, n);
    }
}
