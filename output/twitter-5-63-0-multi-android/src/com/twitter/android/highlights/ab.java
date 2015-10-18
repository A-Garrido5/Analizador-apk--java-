// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ab implements Parcelable$Creator
{
    public StoryScribeItem a(final Parcel parcel) {
        return new StoryScribeItem(parcel);
    }
    
    public StoryScribeItem[] a(final int n) {
        return new StoryScribeItem[n];
    }
}
