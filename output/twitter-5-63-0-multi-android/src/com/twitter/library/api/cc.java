// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class cc implements Parcelable$Creator
{
    public UserSettings a(final Parcel parcel) {
        return new UserSettings(parcel);
    }
    
    public UserSettings[] a(final int n) {
        return new UserSettings[n];
    }
}
