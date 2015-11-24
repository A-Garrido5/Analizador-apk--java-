// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.Comparator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable
{
    public static final c CREATOR;
    public static final Comparator a;
    int b;
    int c;
    private final int d;
    
    static {
        a = new b();
        CREATOR = new c();
    }
    
    public DetectedActivity(final int d, final int b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    private int a(int n) {
        if (n > 9) {
            n = 4;
        }
        return n;
    }
    
    public int a() {
        return this.a(this.b);
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "DetectedActivity [type=" + this.a() + ", confidence=" + this.c + "]";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.location.c.a(this, parcel, n);
    }
}
