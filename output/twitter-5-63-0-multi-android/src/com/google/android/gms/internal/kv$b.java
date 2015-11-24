// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kv$b implements SafeParcelable
{
    public static final ay CREATOR;
    final int a;
    final String b;
    final kr$a c;
    
    static {
        CREATOR = new ay();
    }
    
    kv$b(final int a, final String b, final kr$a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    kv$b(final String b, final kr$a c) {
        this.a = 1;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        final ay creator = kv$b.CREATOR;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ay creator = kv$b.CREATOR;
        ay.a(this, parcel, n);
    }
}
