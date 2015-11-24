// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsRequest implements SafeParcelable
{
    public static final b CREATOR;
    final int a;
    int b;
    String c;
    
    static {
        CREATOR = new b();
    }
    
    public AccountChangeEventsRequest() {
        this.a = 1;
    }
    
    AccountChangeEventsRequest(final int a, final int b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.auth.b.a(this, parcel, n);
    }
}
