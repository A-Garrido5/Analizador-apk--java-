// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

final class n implements ParcelableCompatCreatorCallbacks
{
    public StoriesViewPager$SavedState a(final Parcel parcel, final ClassLoader classLoader) {
        return new StoriesViewPager$SavedState(parcel, classLoader);
    }
    
    public StoriesViewPager$SavedState[] a(final int n) {
        return new StoriesViewPager$SavedState[n];
    }
}
