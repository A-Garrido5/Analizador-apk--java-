// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.internal.ap;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsResponse implements SafeParcelable
{
    public static final c CREATOR;
    final int a;
    final List b;
    
    static {
        CREATOR = new c();
    }
    
    AccountChangeEventsResponse(final int a, final List list) {
        this.a = a;
        this.b = (List)ap.a(list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        c.a(this, parcel, n);
    }
}
