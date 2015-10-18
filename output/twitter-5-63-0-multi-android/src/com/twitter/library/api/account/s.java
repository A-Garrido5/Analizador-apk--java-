// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class s implements Parcelable$Creator
{
    public LoginVerificationRequest a(final Parcel parcel) {
        return new LoginVerificationRequest(parcel);
    }
    
    public LoginVerificationRequest[] a(final int n) {
        return new LoginVerificationRequest[n];
    }
}
