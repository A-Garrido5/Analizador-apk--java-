// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class k implements Parcelable$Creator
{
    public LoginVerificationRequiredResponse a(final Parcel parcel) {
        return new LoginVerificationRequiredResponse(parcel);
    }
    
    public LoginVerificationRequiredResponse[] a(final int n) {
        return new LoginVerificationRequiredResponse[n];
    }
}
