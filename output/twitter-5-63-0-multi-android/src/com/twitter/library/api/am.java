// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class am implements Parcelable$Creator
{
    public Prompt a(final Parcel parcel) {
        return new Prompt(parcel);
    }
    
    public Prompt[] a(final int n) {
        return new Prompt[n];
    }
}
