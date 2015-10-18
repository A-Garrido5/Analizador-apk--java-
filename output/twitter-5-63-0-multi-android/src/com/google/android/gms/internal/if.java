// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class if implements SafeParcelable
{
    public static final f CREATOR;
    final int a;
    final int b;
    final Bundle c;
    final byte[] d;
    
    static {
        CREATOR = new f();
    }
    
    public if(final int a, final int b, final Bundle c, final byte[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.a(this, parcel, n);
    }
}
