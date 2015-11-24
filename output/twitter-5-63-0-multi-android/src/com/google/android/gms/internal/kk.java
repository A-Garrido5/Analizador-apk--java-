// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kk implements SafeParcelable
{
    public static final as CREATOR;
    final int a;
    public final String b;
    public final int c;
    
    static {
        CREATOR = new as();
    }
    
    public kk(final int a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        as.a(this, parcel, n);
    }
}
