// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class p implements Parcelable$Creator
{
    public LoginVerificationNotif a(final Parcel parcel) {
        return new LoginVerificationNotif(parcel);
    }
    
    public LoginVerificationNotif[] a(final int n) {
        return new LoginVerificationNotif[n];
    }
}
