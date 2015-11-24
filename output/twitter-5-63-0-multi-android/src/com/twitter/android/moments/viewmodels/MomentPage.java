// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class MomentPage implements Parcelable
{
    private final boolean a;
    
    public MomentPage(final Parcel parcel) {
        boolean a = true;
        if (parcel.readInt() != (a ? 1 : 0)) {
            a = false;
        }
        this.a = a;
    }
    
    public MomentPage(final boolean a) {
        this.a = a;
    }
    
    public abstract MomentPage$Type b();
    
    public boolean c() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2;
        if (this.a) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
