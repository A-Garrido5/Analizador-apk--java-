// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ko$a implements SafeParcelable
{
    public static final av CREATOR;
    final int a;
    final String b;
    final int c;
    
    static {
        CREATOR = new av();
    }
    
    ko$a(final int a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    ko$a(final String b, final int c) {
        this.a = 1;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        final av creator = ko$a.CREATOR;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final av creator = ko$a.CREATOR;
        av.a(this, parcel, n);
    }
}
