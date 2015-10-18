// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public NativeCardEvent a(final Parcel parcel) {
        return new NativeCardEvent(parcel);
    }
    
    public NativeCardEvent[] a(final int n) {
        return new NativeCardEvent[n];
    }
}
