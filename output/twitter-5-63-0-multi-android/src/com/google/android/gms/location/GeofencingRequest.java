// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GeofencingRequest implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    private final int a;
    private final List b;
    private final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    GeofencingRequest(final int a, final List b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.a;
    }
    
    public List b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        k.a(this, parcel, n);
    }
}
