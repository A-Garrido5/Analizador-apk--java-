// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class xp implements Parcelable$Creator
{
    public UserAccount a(final Parcel parcel) {
        return new UserAccount(parcel);
    }
    
    public UserAccount[] a(final int n) {
        return new UserAccount[n];
    }
}
