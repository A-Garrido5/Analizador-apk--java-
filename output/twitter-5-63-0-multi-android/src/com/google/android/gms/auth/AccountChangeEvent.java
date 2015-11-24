// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEvent implements SafeParcelable
{
    public static final a CREATOR;
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;
    
    static {
        CREATOR = new a();
    }
    
    AccountChangeEvent(final int a, final long b, final String s, final int d, final int e, final String f) {
        this.a = a;
        this.b = b;
        this.c = (String)ap.a((Object)s);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof AccountChangeEvent)) {
                return false;
            }
            final AccountChangeEvent accountChangeEvent = (AccountChangeEvent)o;
            if (this.a != accountChangeEvent.a || this.b != accountChangeEvent.b || !al.a(this.c, accountChangeEvent.c) || this.d != accountChangeEvent.d || this.e != accountChangeEvent.e || !al.a(this.f, accountChangeEvent.f)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }
    
    @Override
    public String toString() {
        String s = "UNKNOWN";
        switch (this.d) {
            case 1: {
                s = "ADDED";
                break;
            }
            case 2: {
                s = "REMOVED";
                break;
            }
            case 4: {
                s = "RENAMED_TO";
                break;
            }
            case 3: {
                s = "RENAMED_FROM";
                break;
            }
        }
        return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + s + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.auth.a.a(this, parcel, n);
    }
}
