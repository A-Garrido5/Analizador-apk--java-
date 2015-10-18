// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.util;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public Size a(final Parcel parcel) {
        return new Size(parcel);
    }
    
    public Size[] a(final int n) {
        return new Size[n];
    }
}
