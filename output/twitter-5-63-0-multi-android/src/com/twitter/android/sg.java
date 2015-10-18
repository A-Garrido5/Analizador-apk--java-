// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class sg implements Parcelable$Creator
{
    public SelectionFragment$SelectedItem a(final Parcel parcel) {
        return new SelectionFragment$SelectedItem(parcel);
    }
    
    public SelectionFragment$SelectedItem[] a(final int n) {
        return new SelectionFragment$SelectedItem[n];
    }
}
