// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class a implements SafeParcelable
{
    public static final g CREATOR;
    private final int a;
    private byte b;
    private Bundle c;
    private Bitmap d;
    
    static {
        CREATOR = new g();
    }
    
    a(final int a, final byte b, final Bundle c, final Bitmap d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return this.a;
    }
    
    public byte b() {
        return this.b;
    }
    
    public Bundle c() {
        return this.c;
    }
    
    public Bitmap d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        g.a(this, parcel, n);
    }
}
