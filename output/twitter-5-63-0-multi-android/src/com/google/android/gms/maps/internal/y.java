// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.graphics.Point;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class y implements SafeParcelable
{
    public static final cw CREATOR;
    private final int a;
    private final Point b;
    
    static {
        CREATOR = new cw();
    }
    
    public y(final int a, final Point b) {
        this.a = a;
        this.b = b;
    }
    
    int a() {
        return this.a;
    }
    
    public Point b() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof y && this.b.equals((Object)((y)o).b));
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public String toString() {
        return this.b.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        cw.a(this, parcel, n);
    }
}
