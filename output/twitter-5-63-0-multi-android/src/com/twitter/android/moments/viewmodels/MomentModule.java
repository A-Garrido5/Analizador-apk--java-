// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import com.twitter.library.api.moments.Moment;
import android.os.Parcelable;

public abstract class MomentModule implements Parcelable
{
    private final Moment a;
    
    public MomentModule(final Parcel parcel) {
        this.a = (Moment)parcel.readParcelable(Moment.class.getClassLoader());
    }
    
    public MomentModule(final Moment a) {
        this.a = a;
    }
    
    public Moment c() {
        return this.a;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
    }
}
