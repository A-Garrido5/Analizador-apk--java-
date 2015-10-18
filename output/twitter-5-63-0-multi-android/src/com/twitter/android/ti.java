// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ti implements Parcelable$Creator
{
    public TabsAdapter$TabSavedState a(final Parcel parcel) {
        return new TabsAdapter$TabSavedState(parcel);
    }
    
    public TabsAdapter$TabSavedState[] a(final int n) {
        return new TabsAdapter$TabSavedState[n];
    }
}
