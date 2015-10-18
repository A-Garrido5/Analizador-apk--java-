// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private IBinder zzZQ;
    
    static {
        CREATOR = (Parcelable$Creator)new BinderWrapper$1();
    }
    
    public BinderWrapper() {
        this.zzZQ = null;
    }
    
    public BinderWrapper(final IBinder zzZQ) {
        this.zzZQ = null;
        this.zzZQ = zzZQ;
    }
    
    private BinderWrapper(final Parcel parcel) {
        this.zzZQ = null;
        this.zzZQ = parcel.readStrongBinder();
    }
    
    BinderWrapper(final Parcel parcel, final BinderWrapper$1 binderWrapper$1) {
        this(parcel);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStrongBinder(this.zzZQ);
    }
}
