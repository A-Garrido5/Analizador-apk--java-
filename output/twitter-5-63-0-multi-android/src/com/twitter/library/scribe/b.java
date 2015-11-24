// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public NativeCardUserAction a(final Parcel parcel) {
        return new NativeCardUserAction(parcel);
    }
    
    public NativeCardUserAction[] a(final int n) {
        return new NativeCardUserAction[n];
    }
}
