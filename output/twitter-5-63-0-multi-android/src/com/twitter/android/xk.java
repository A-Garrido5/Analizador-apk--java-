// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class xk implements Parcelable$Creator
{
    public UmfPromptView$SavedState a(final Parcel parcel) {
        return new UmfPromptView$SavedState(parcel);
    }
    
    public UmfPromptView$SavedState[] a(final int n) {
        return new UmfPromptView$SavedState[n];
    }
}
