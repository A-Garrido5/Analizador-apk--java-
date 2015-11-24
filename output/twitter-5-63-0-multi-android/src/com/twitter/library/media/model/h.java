// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public MediaDescriptor a(final Parcel parcel) {
        return new MediaDescriptor(parcel);
    }
    
    public MediaDescriptor[] a(final int n) {
        return new MediaDescriptor[n];
    }
}
