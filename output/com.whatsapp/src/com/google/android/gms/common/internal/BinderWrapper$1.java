// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class BinderWrapper$1 implements Parcelable$Creator
{
    public Object createFromParcel(final Parcel parcel) {
        return this.zzV(parcel);
    }
    
    public Object[] newArray(final int n) {
        return this.zzbq(n);
    }
    
    public BinderWrapper zzV(final Parcel parcel) {
        return new BinderWrapper(parcel, null);
    }
    
    public BinderWrapper[] zzbq(final int n) {
        return new BinderWrapper[n];
    }
}
